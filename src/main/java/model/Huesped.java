package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Huesped {
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;
    private String rva_hosp_cod_rva_hosp;

    // Constructores, getters y setters
    // ...
}
