import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Estudiante
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", new Date(), Estudiante.State.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2, "Ana", "García", new Date(), Estudiante.State.INACTIVO);

        // Crear instancias de Curso
        Curso curso1 = new Curso();
        curso1.setId(101);
        curso1.setNombre("Matemáticas");
        curso1.setDescripcion("Curso básico de matemáticas");
        curso1.setNumeroCreditos(3);
        curso1.setVersion(1);

        Curso curso2 = new Curso();
        curso2.setId(102);
        curso2.setNombre("Literatura");
        curso2.setDescripcion("Curso avanzado de literatura");
        curso2.setNumeroCreditos(2);
        curso2.setVersion(1);

        // Instanciar GestorAcademico
        GestorAcademico gestor = new GestorAcademico();

        try {
            // Probar la inscripción de estudiantes y creación de cursos
            gestor.matricularEstudiante(estudiante1);
            gestor.agregarCurso(curso1);
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());

            // Repetir para el segundo estudiante y curso
            gestor.matricularEstudiante(estudiante2);
            gestor.agregarCurso(curso2);
            gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());

            // Desinscribir a un estudiante
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());

            // Mostrar estudiantes inscritos en un curso
            System.out.println("Estudiantes inscritos en Matemáticas: " + gestor.obtenerEstudiantesIncritos(String.valueOf(curso1)));

            // Mostrar cursos en los que está inscrito un estudiante
            System.out.println("Cursos en los que está inscrito Juan Pérez: " + gestor.obtenerCursosDeEstudiante(estudiante1));

        } catch (Exceptions.EstudianteYaMatriculadoException | Exceptions.CursoYaCreadoException |
                 Exceptions.EstudianteYaInscritoException | Exceptions.EstudianteNoInscritoException |
                 Exceptions.CursoNoValidoException e) {
            e.printStackTrace();
        }
    }
}
