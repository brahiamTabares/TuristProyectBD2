package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class ReporteServicio {
    private String codigo_re;
    private String descripcion_re;
    private Date fechareporte;
    private String estado_ser;
    private String administrador_cod_adm;
    private String servicio_cod_serv;

    // Constructores, getters y setters
    // ...
}
