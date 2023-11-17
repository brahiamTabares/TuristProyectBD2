package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotel {

    private String codHotel;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String urlImagen;
    private String ciudadEntCodigo;
    private String tipoHotelCodTipoH;

}

