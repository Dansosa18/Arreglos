package umg.edu.gt.lombok;


public class Main {
    public static void main(String[] args) {
        // Crear un usuario usando el constructor
        Usuario usuario1 = new Usuario(1L, "Víctor", "victor@email.com");
        System.out.println(usuario1);

        // Crear un usuario usando el patrón Builder
        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("Sosa")
                .email("sosa@email.com")
                .build();
        System.out.println(usuario2);

        // Modificar atributos con setters
        usuario1.setNombre("Daniel");
        System.out.println("Usuario actualizado: " + usuario1.getNombre());
    }
}