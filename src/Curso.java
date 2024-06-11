public class Curso {
    private int idCurso;
    private String nombreCurso;
    private String descripcionCurso;
    private int numeroCreditos;
    private int versionCurso;

    public Curso(int idCurso, String nombreCurso, String descripcionCurso, int numeroCreditos, int versionCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.numeroCreditos = numeroCreditos;
        this.versionCurso = versionCurso;
    }

    public Curso() {
        return;
    }

    public int getId() {
        return idCurso;
    }

    public void setId(int idDelCurso) {
        this.idCurso = idDelCurso;
    }

    public String getNombre() {
        return nombreCurso;
    }

    public void setNombre(String nombreDelCurso) {
        this.nombreCurso = nombreDelCurso;
    }

    public String getDescripcion() {
        return descripcionCurso;
    }

    public void setDescripcion(String descripcionDelCurso) {
        this.descripcionCurso = descripcionDelCurso;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getVersion() {
        return versionCurso;
    }

    public void setVersion(int versionDelCurso) {
        this.versionCurso = versionDelCurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "id= " + idCurso + ", nombre= " + nombreCurso + ", descripcion= " + descripcionCurso + ", version= " + versionCurso + '}';
    }
}