package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Servicio {
    private String cod_serv;
    private String descripcion;
    private float costo;
    private char estado;
    private String factura_c_cod_fac;
    private String rva_paq_tur_cod_rpt;
    private String administrador_cod_adm;

    // Constructores, getters y setters
    // ...
}
