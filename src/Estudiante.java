public class Estudiante extends Persona{
    int idEstudiante;

    //Constructor
    public Estudiante(int idEstudiante, String nombre, String apellido, String fechaNacimiento) {
        super(nombre, apellido, String.valueOf(fechaNacimiento));
        this.idEstudiante = idEstudiante;
    }

    //Getter
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public String getNombrePersona() {
        return getNombrePersona();
    }

    public String getApellidoPersona() {
        return getApellidoPersona();
    }

    public String getFechaNacimientoPersona() {
        return getFechaNacimientoPersona();
    }
    //Getter

    //Setter
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        setNombrePersona(nombreEstudiante);
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        setApellidoPersona(apellidoEstudiante);
    }

    public void setFechaNacimientoEstudiante(String fechaNacimientoEstudiante) {
        setFechaNacimientoPersona(fechaNacimientoEstudiante);
    }
    //Setter
}