import java.util.*;

public class Estudiante extends Persona {
    private State estado;

    public Estudiante(int id, String nombre, String apellido, Date fechaNacimiento, State estado) {
        super(id, nombre, apellido, fechaNacimiento);
        this.estado = estado;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public enum State{
        MATRICULADO,
        INACTIVO,
        GRADUADO
    }

    @Override
    public String toString() {
        return "Estudiante {" + "id= " + idEstudiante + ", nombre= " + nombreEstudiante + '\'' + ", apellido= " + apellidoEstudiante + ", fechaNacimiento= " + fechaNacimiento + ", estado= " + estado + '}';
    }
}