package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaqueteServicio {
    private String cod_pserv;
    private int cantidad;
    private float preciounitario;
    private float descuento;
    private float subtotal;
    private String factura_c_cod_fac;
    private String servicio_cod_serv;

    // Constructores, getters y setters
    // ...
}
