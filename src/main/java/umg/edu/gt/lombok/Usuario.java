package umg.edu.gt.lombok;
import lombok.*;

@Data  // Genera getters, setters, toString, equals y hashCode automáticamente
@Builder // Implementa el patrón Builder
@AllArgsConstructor // Constructor con todos los atributos
@NoArgsConstructor // Constructor vacío
public class Usuario {
    private Long id;
    private String nombre;
    private String email;
}


