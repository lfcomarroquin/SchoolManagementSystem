import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI {

    //Atributos que son ArrayLists
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<Estudiante>> inscripciones;

    //Constructor
    public GestorAcademico() {
        this.inscripciones = new HashMap<>();

        this.estudiantes = new ArrayList<>();

        //Aca se crea el formato para parsear las fechas
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.US);

        //Aca se crea a los estudiantes predefinidos
        Estudiante estudiantePredefinido1 = new Estudiante(1, "Luis", "Marroquin", "3/12/1987");
        Estudiante estudiantePredefinido2 = new Estudiante(2, "Karin", "Lopez", "17/07/1983");

        //Aca se agregan esos estudiantes predefinidos al ArrayList
        this.estudiantes.add(estudiantePredefinido1);
        this.estudiantes.add(estudiantePredefinido2);


        this.cursos = new ArrayList<>();
        //Aca se crean los cursos predefinidos
        Curso cursoPredefinido1 = new Curso(101,"Java Backend","Programacion Java con Springboot",3,"1.0.0");
        Curso cursoPredefinido2 = new Curso(102,"Cisco Ethical Hacker","Ciberseguridad con Cisco Ethical Hacker",3,"1.0.0");

        //Aca se agregan esos cursos predefinidos al ArrayList
        this.cursos.add(cursoPredefinido1);
        this.cursos.add(cursoPredefinido2);
    }

    //Metodo que devuelve un estudiante por ID
    public Estudiante obtenerEstudiantePorID(int idDelEstudiante) {
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getIdEstudiante() == idDelEstudiante) {
                return estudiante;
            }
        }
        return null;
    }

    //Metodo que devuelve un curso por ID
    public Curso obtenerCursoPorID(int idDelCurso) {
        for (Curso curso : this.cursos) {
            if (curso.getIdCurso() == idDelCurso) {
                return curso;
            }
        }
        return null;
    }

    //Metodo para agregar un estudiante a un curso especifico
    @Override
    public void inscribirEstudianteACurso(Curso curso, Estudiante estudiante) throws EstudianteYaInscritoException {
        ArrayList<Estudiante> estudiantesInscritos = this.inscripciones.get(curso);
        if (estudiantesInscritos == null) {
            estudiantesInscritos = new ArrayList<>();
            this.inscripciones.put(curso, estudiantesInscritos);
        } else if (estudiantesInscritos.contains(estudiante)) {
            throw new EstudianteYaInscritoException("El estudiante ya esta inscrito en este curso");
        }
        estudiantesInscritos.add(estudiante);
    }

    //Metodo para eliminar un estudiante de un curso especifico
    @Override
    public void desinscribirEstudianteACurso(Curso curso, Estudiante estudiante) throws EstudianteNoInscritoEnCursoException {
        ArrayList<Estudiante> estudiantesInscritos = this.inscripciones.get(curso);
        if (estudiantesInscritos != null && estudiantesInscritos.contains(estudiante)) {
            estudiantesInscritos.remove(estudiante);
        } else {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no esta inscrito en este curso");
        }
    }

    //Metodo para añadir un nuevo curso a la lista
    @Override
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    //Metodo para añadir un estudiante
    @Override
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public HashMap<Curso, ArrayList<Estudiante>> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(HashMap<Curso, ArrayList<Estudiante>> inscripciones) {
        this.inscripciones = inscripciones;
    }
}