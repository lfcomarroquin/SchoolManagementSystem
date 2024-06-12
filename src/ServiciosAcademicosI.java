public interface ServiciosAcademicosI {
    void inscribirEstudianteACurso(Curso curso, Estudiante estudiante) throws EstudianteYaInscritoException;
    void desinscribirEstudianteACurso(Curso curso, Estudiante estudiante) throws EstudianteNoInscritoEnCursoException;
    void agregarCurso(Curso curso);
    void agregarEstudiante(Estudiante estudiante);
}