package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegimenHospedaje {
    private String codigo;
    private String nombre;
    private String descripcion;
    private float prcincremento;

    // Constructores, getters y setters
    // ...
}
