package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServicioAdicionalAuto {
    private String cod_servadauto;
    private String auto_cod_auto;
    private String serv_ad_cod_servad;

    // Constructores, getters y setters
    // ...
}
