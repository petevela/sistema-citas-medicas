package sv.gob.salud.CitasService.modelos.entidades;

import java.time.LocalDate;

import sv.gob.salud.CitasService.modelos.enums.Genero;

public class Persona {
    private String documentoIdentidad;
    private String nombres;
    private String apellidos;
    private Genero genero;
    private LocalDate fechaNacimiento;

    private String numeroTelefono;
    private String correoElectronico;
    
}
