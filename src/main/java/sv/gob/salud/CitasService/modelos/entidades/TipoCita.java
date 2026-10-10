package sv.gob.salud.CitasService.modelos.entidades;
import sv.gob.salud.CitasService.modelos.enums.EstadoCita;
import sv.gob.salud.CitasService.modelos.enums.Prioridad;

public class TipoCita {
    private Long id;
    private AgendaMedica agendaMedica;
    private Expediente expediente;
    private int orden;
    private EstadoCita estadoCita;
    
}
