package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Compra_Articulo {

    private String codigoCart;
    private float precioUnidad;
    private int numUnidades;
    private float subtotal;
    private String facturaCCodigoFac;
    private String articuloCodigo;
    private String estadoCartCodigo;

}

