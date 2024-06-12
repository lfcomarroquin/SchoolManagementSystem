public class Curso {
    //Atributos
    private int idCurso;
    private String nombreCurso;
    private String descripcionCurso;
    private int numeroCreditos;
    private String versionCurso;

    //Constructor
    public Curso(int idCurso, String nombreCurso, String descripcionCurso, int numeroCreditos, String versionCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.numeroCreditos = numeroCreditos;
        this.versionCurso = versionCurso;
    }

    //Metodo Curso (Ejemplo)
    public void crearCurso() {
        System.out.println("El curso " + nombreCurso + " ha sido creado con el id " + idCurso);
    }

    //Getters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public String getVersionCurso() {
        return versionCurso;
    }
    //Getters
}