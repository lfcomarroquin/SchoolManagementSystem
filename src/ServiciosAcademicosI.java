public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante) throws Exceptions.EstudianteYaMatriculadoException;
    void agregarCurso(Curso curso) throws Exceptions.CursoYaCreadoException;
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws Exceptions.EstudianteYaInscritoException, Exceptions.CursoNoValidoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws Exceptions.EstudianteNoInscritoException, Exceptions.CursoNoValidoException;
}