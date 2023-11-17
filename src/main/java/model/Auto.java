package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auto {

    private String codAuto;
    private String placa;
    private int numPuestos;
    private float precioPorDia;
    private String color;
    private float capacidadCarga;
    private String tipoCombustible;
    private String codigoTipoAuto;
    private String codigoGamaAuto;
    private String codigoMarcaAuto;
    private String codigoEstadoAuto;

}
