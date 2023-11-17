package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class ReservaAuto {
    private String codigo_rva_auto;
    private float subtotal;
    private Date fecharecogida;
    private Date fechaentrega;
    private float preciorentadia;
    private String estadoreservaauto_codigo;
    private String auto_codigo_auto;
    private String servicio_cod_serv;
    private String ciudad_ent_codigo;

    // Constructores, getters y setters
    // ...
}
