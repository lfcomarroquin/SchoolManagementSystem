import java.util.*;

public class GestorAcademico {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Curso, ArrayList<Estudiante>> inscripciones = new HashMap<>();

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
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

    public ArrayList<Estudiante> obtenerEstudiantesIncritos(Curso curso) {
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