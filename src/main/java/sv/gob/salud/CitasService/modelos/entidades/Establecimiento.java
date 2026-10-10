package sv.gob.salud.CitasService.modelos.entidades;

import java.util.List;

import sv.gob.salud.CitasService.modelos.enums.EstadoEstablecimiento;
import sv.gob.salud.CitasService.modelos.enums.TipoEstablecimiento;

public class Establecimiento {
    private Long id;
    private String codigo;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;
    private TipoEstablecimiento tipoEstablecimiento;
    private EstadoEstablecimiento estadoEstablecimiento;
    private List<Especialidad> especialidad;
}
