package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Articulo {

    private String codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private int unidadesStock;
    private String estadoArtCodigo;
    private String tipoArtCodTipoArt;

}



