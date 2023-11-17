package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Horario_paq {

    private String codigo;
    private String dia;
    private String horaInicio;
    private String horaFin;
    private String paqTuristicoCodPaqTur;

}
