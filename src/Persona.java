import java.util.Date;

public class Persona {
    protected int idEstudiante;
    protected String nombreEstudiante;
    protected String apellidoEstudiante;
    protected Date fechaNacimiento;

    public Persona(int idDelEstudiante, String nombreDelEstudiante, String apellidoDelEstudiante, Date fechaNacimiento) {
        this.idEstudiante = idDelEstudiante;
        this.nombreEstudiante = nombreDelEstudiante;
        this.apellidoEstudiante = apellidoDelEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return idEstudiante;
    }

    public void setId(int idDelEstudiante) {
        this.idEstudiante = idDelEstudiante;
    }

    public String getNombre() {
        return nombreEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombreEstudiante = nombre;
    }

    public String getApellido() {
        return apellidoEstudiante;
    }

    public void setApellido(String apellidoDelEstudiante) {
        this.apellidoEstudiante = apellidoDelEstudiante;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}