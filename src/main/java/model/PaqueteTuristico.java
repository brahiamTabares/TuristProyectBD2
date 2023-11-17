package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaqueteTuristico {
    private String cod_paq_tur;
    private String codigo_proveedor;
    private String descripcion;
    private float preciopersona;
    private String ciudad_ent_codigo;
    private String tipo_paq_cod_tipopaq;

    // Constructores, getters y setters
    // ...
}
