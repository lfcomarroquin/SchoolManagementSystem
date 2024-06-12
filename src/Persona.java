public class Persona {
    protected String nombrePersona;
    protected String apellidoPersona;
    protected String fechaNacimientoPersona;

    public Persona(String nombre, String apellido, String fechaNacimiento) {
        this.nombrePersona = nombre;
        this.apellidoPersona = apellido;
        this.fechaNacimientoPersona = fechaNacimiento;
    }

    //Getters
    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public String getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }
    //Getters

    //Setters
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public void setFechaNacimientoPersona(String fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }
    //Setters
}