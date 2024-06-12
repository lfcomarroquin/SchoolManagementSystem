import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorAcademico gestor = new GestorAcademico();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a tu gestor academico!");
        while (true) {
            System.out.println("Por favor, selecciona una opcion:");
            System.out.println("1. Gestionar estudiantes");
            System.out.println("2. Gestionar cursos");
            System.out.println("3. Inscribir un estudiante a un curso");
            System.out.println("4. Desinscribir un estudiante de un curso");
            System.out.println("5. Salir");
            System.out.println("");

            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("1. Agregar un estudiante");
                    System.out.println("2. Ver la lista de estudiantes");
                    System.out.println("3. Salir");
                    System.out.println("");

                    int opcion2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese el ID del estudiante:");
                            int idEstudiante = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Ingrese el nombre del estudiante:");
                            String nombreEstudiante = scanner.nextLine();

                            System.out.println("Ingrese el apellido del estudiante:");
                            String apellidoEstudiante = scanner.nextLine();

                            System.out.println("Ingrese la fecha de nacimiento del estudiante:");
                            String fechaNacimientoEstudiante = scanner.nextLine();
                            //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            String fecha = fechaNacimientoEstudiante;

                            Estudiante estudiante = new Estudiante(idEstudiante, nombreEstudiante, apellidoEstudiante, fecha);
                            gestor.agregarEstudiante(estudiante);

                            System.out.println("El estudiante " + nombreEstudiante + " ha sido agregado correctamente");
                            break;

                        case 2:
                            System.out.println("Estudiantes:");
                            for (Estudiante estudiante1 : gestor.getEstudiantes()) {
                                System.out.println("- ID: " + estudiante1.getIdEstudiante());
                                System.out.println("- Nombre: " + estudiante1.getNombrePersona());
                                System.out.println("- Apellido: " + estudiante1.getApellidoPersona());
                                System.out.println("- Fecha de Nacimiento: " + estudiante1.getFechaNacimientoPersona());
                            }
                            break;

                        case 3:
                            System.out.println("Saliendo del programa...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo");
                    }

                case 2:
                    System.out.println("1. Agregar un curso");
                    System.out.println("2. Ver la lista de cursos");
                    System.out.println("3. Salir");

                    int opcion3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion3) {
                        case 1:
                            System.out.println("Ingrese el ID del curso:");
                            int idCurso = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Ingrese el nombre del curso:");
                            String nombreCurso = scanner.nextLine();

                            System.out.println("Ingrese la descripcion del curso:");
                            String descripcionCurso = scanner.nextLine();

                            String creditos = String.valueOf(3);
                            System.out.println("Los creditos de este curso son: " + creditos);

                            String version = "1.0.0";
                            System.out.println("La version de este curso es: " + version);

                            System.out.println("El curso ha sido agregado correctamente");
                            break;

                        case 2:
                            System.out.println("Cursos:");
                            for (Curso curso1 : gestor.getCursos()) {
                                System.out.println("- ID: " + curso1.getIdCurso());
                                System.out.println("- Nombre: " + curso1.getNombreCurso());
                                System.out.println("- Descripcion: " + curso1.getDescripcionCurso());
                                System.out.println("- Creditos: " + curso1.getNumeroCreditos());
                                System.out.println("- Version: " + curso1.getVersionCurso());
                            }
                            break;

                        case 3:
                            System.out.println("Saliendo del programa...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo");
                    }

                case 3:
                    System.out.println("Introduzca el ID del estudiante:");
                    int idEstudianteParaInscribirACurso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Introduce el ID del curso:");
                    int idCursoParaInscribirACurso = scanner.nextInt();
                    scanner.nextLine();

                    Estudiante estudianteParaInscribirACurso = gestor.obtenerEstudiantePorID(idEstudianteParaInscribirACurso);
                    Curso curso = gestor.obtenerCursoPorID(idCursoParaInscribirACurso);

                    if (estudianteParaInscribirACurso == null) {
                        System.out.println("No se encontró un estudiante con el ID proporcionado.");
                    } else if (curso == null) {
                        System.out.println("No se encontró un curso con el ID proporcionado.");
                    } else {
                        try {
                            gestor.inscribirEstudianteACurso(curso, estudianteParaInscribirACurso);
                            System.out.println("El estudiante ha sido inscrito en el curso exitosamente.");
                        } catch (EstudianteYaInscritoException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Introduce el ID del estudiante:");
                    int idEstudianteParaDesinscribirACurso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Introduce el ID del curso:");
                    int idCursoParaDesinscribirACurso = scanner.nextInt();
                    scanner.nextLine();

                    Estudiante estudianteParaDesinscribirACurso = gestor.obtenerEstudiantePorID(idEstudianteParaDesinscribirACurso);
                    Curso cursoParaDesinscribirACurso = gestor.obtenerCursoPorID(idCursoParaDesinscribirACurso);

                    if (estudianteParaDesinscribirACurso == null) {
                        System.out.println("No se encontró un estudiante con el ID proporcionado.");
                    } else if (cursoParaDesinscribirACurso == null) {
                        System.out.println("No se encontró un curso con el ID proporcionado.");
                    } else {
                        try {
                            gestor.desinscribirEstudianteACurso(cursoParaDesinscribirACurso, estudianteParaDesinscribirACurso);
                            System.out.println("El estudiante ha sido desinscrito del curso exitosamente.");
                        } catch (EstudianteNoInscritoEnCursoException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
                    System.out.println("");
            }
        }
    }
}