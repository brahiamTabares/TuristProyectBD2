package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Cliente {

    private String cedula;
    private String correo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private String password;
    private String ciudadEntCodigo;
    private String estadoClienteCodEstadoC;

}
