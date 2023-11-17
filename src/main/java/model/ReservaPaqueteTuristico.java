package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservaPaqueteTuristico {
    private String cod_rpt;
    private float prcdescuento;
    private float subtotal;
    private int numpersonas;
    private float preciopersona;
    private String paq_turistico_cod_paq_tur;
    private String estado_rva_paq_codigo;
    private String horario_paq_codigo;
    private String factura_c_cod_fac;

    // Constructores, getters y setters
    // ...
}
