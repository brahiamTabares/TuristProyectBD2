package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class ReservaHospedaje {
    private String cod_rva_hosp;
    private Date fechachekcin;
    private Date fechacheckout;
    private float precionoche;
    private float prcincremento;
    private float subtotal;
    private String estadorvahosp_codigo;
    private String servicio_cod_serv;
    private String regimen_hosp_codigo;
    private String habitacion_codigo_hotel;
    private String habitacion_cod_hab;

    // Constructores, getters y setters
    // ...
}
