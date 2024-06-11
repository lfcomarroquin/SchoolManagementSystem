import java.util.*;

public class GestorAcademico implements ServiciosAcademicosI {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Curso, ArrayList<Estudiante>> inscripciones = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) throws Exceptions.EstudianteYaMatriculadoException {
        for (Estudiante e : estudiantes) {
            if (e.getId() == estudiante.getId()) {
                throw new Exceptions.EstudianteYaMatriculadoException("El estudiante con ID " + estudiante.getId() + " ya esta matriculado.");
            }
        }
        estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) throws Exceptions.CursoYaCreadoException {
        for (Curso c : cursos) {
            if (c.getId() == curso.getId()) {
                throw new Exceptions.CursoYaCreadoException("El curso con ID " + curso.getId() + " ya existe");
            }
        }
        cursos.add(curso);
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws Exceptions.EstudianteYaInscritoException, Exceptions.CursoNoValidoException {
        Curso curso = null;
        for (Curso c : cursos) {
            if (c.getId() == idCurso) {
                curso = c;
                break;
            }
        }
        if (curso == null) {
            throw new Exceptions.CursoNoValidoException("El curso con ID " + idCurso + " no es valido");
        }
        ArrayList<Estudiante> estudiantesIncritos = inscripciones.get(curso);
        if (estudiantesIncritos != null && estudiantesIncritos.contains(estudiante)) {
            throw new Exceptions.EstudianteYaInscritoException("El estudiante con ID " + estudiante.getId() + " ya esta incrito en el curso con ID " + idCurso + ".");
        }
        if (estudiantesIncritos == null) {
            estudiantesIncritos = new ArrayList<>();
            inscripciones.put(curso, estudiantesIncritos);
        }
        estudiantesIncritos.add(estudiante);
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws Exceptions.EstudianteNoInscritoException, Exceptions.CursoNoValidoException {
        Curso curso = null;
        for (Curso c : cursos) {
            if (c.getId() == idCurso) {
                curso = c;
                break;
            }
        }
        if (curso == null) {
            throw new Exceptions.CursoNoValidoException("El curso con ID " + idCurso + " no es valido");
        }
        Estudiante estudiante = null;
        for (Estudiante e : estudiantes) {
            if (e.getId() == idEstudiante) {
                estudiante = e;
                break;
            }
        }
        if (estudiante == null) {
            throw new Exceptions.EstudianteNoInscritoException("El estudiante con ID " + idEstudiante + " no esta inscrito en ningun curso.");
        }

        ArrayList<Estudiante> estudiantesIncritos = inscripciones.get(curso);
        if (estudiantesIncritos == null || !estudiantesIncritos.remove(estudiante)) {
            throw new Exceptions.EstudianteNoInscritoException("El estudiante con ID " + idEstudiante + " no esta inscrito en el curso con ID " + idCurso + ".");
        }
    }


    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void inscribirEstudianteACurso(Estudiante estudiante, Curso curso) {
        ArrayList<Estudiante> estudiantesIncritos = inscripciones.get(curso);
        if (estudiantesIncritos == null) {
            estudiantesIncritos = new ArrayList<>();
            inscripciones.put(curso, estudiantesIncritos);
        }
        estudiantesIncritos.add(estudiante);
    }

    public ArrayList<Estudiante> obtenerEstudiantesIncritos(String curso) {
        return inscripciones.get(curso);
    }

    public ArrayList<Curso> obtenerCursosDeEstudiante(Estudiante estudiante) {
        ArrayList<Curso> cursosDelEstudiantes = new ArrayList<>();
        for (Curso curso : inscripciones.keySet()) {
            ArrayList<Estudiante> estudiantesIncritos = inscripciones.get(curso);
            if (estudiantesIncritos.contains(estudiante)) {
                cursosDelEstudiantes.add(curso);
            }
        }
        return cursosDelEstudiantes;
    }
 }