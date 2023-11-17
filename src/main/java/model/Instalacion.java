package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instalacion {
    private String cod_inst;
    private String nombre;
    private String descripcion;
    private String urlimagen;
    private String hotel_cod_hotel;
    private String tipo_inst_cod_tipoi;

    // Constructores, getters y setters
    // ...
}
