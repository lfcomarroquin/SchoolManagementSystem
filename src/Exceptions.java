public class Exceptions {
    static class EstudianteYaMatriculadoException extends Exception {
        public EstudianteYaMatriculadoException(String s) {
            super("El estudiante ya se encuentra matriculado");
        }
    }

    static class CursoYaCreadoException extends Exception {
        public CursoYaCreadoException(String s) {
            super("El curso ya se encuentra creado");
        }
    }

    static class EstudianteYaInscritoException extends Exception {
        public EstudianteYaInscritoException(String s) {
            super("El estudiante ya se encuentra inscrito");
        }
    }

    static class EstudianteNoInscritoException extends Exception {
        public EstudianteNoInscritoException(String s) {
            super("El estudiante no se encuentra inscrito");
        }
    }

    public static class CursoNoValidoException extends Exception {
        public CursoNoValidoException(String s) {
            super("El curso no es valido");
        }
    }
}