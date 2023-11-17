package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TipoHabitacion {
    private String cod_tipohab;
    private String nombre;
    private String descripcion;

    // Constructores, getters y setters
    // ...
}
