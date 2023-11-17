package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServicioAdicional {
    private String cod_servad;
    private String nombre;
    private String descripcion;
    private float precio;

    // Constructores, getters y setters
    // ...
}
