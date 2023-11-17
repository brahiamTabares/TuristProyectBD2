package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Factura_c {

    private String codFac;
    private Date fechaExpedicion;
    private Date fechaVencimiento;
    private String detalleCompra;
    private String clienteCedula;
    private float total;
    private char estado;

}

