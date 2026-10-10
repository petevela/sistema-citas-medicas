package sv.gob.salud.CitasService.modelos.entidades;
import java.time.LocalDate;
import java.time.LocalTime;

import sv.gob.salud.CitasService.modelos.enums.TipoCita;
import sv.gob.salud.CitasService.modelos.enums.Prioridad;
import sv.gob.salud.CitasService.modelos.enums.EstadoCita;

public class Cita {

    private Long id;
    private AgendaMedica agendaMedica;
    private Expediente expediente;
    private int orden;
    private EstadoCita estadoCita;
    private Prioridad prioridad;
    private TipoCita tipo;
    private Cita citaOrigen;
    private LocalDate fechaCita;
    private LocalTime horaInicio;
    private LocalTime horaFin;

     public Cita(Long id, 
            AgendaMedica agendaMedica,
            Expediente expediente,
            int orden,
            EstadoCita estadoCita,
            Prioridad prioridad,
            TipoCita tipo,
            Cita citaOrigen,
            LocalDate fechaCita,
            LocalTime horaInicio,
            LocalTime horaFin) {

        this.id = id;
        this.agendaMedica = agendaMedica;
        this.expediente = expediente;
        this.orden = orden;
        this.estadoCita = estadoCita;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.citaOrigen = citaOrigen;
        this.fechaCita = fechaCita;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void cambiarEstadoCita(EstadoCita estadoCita){
        this.estadoCita = estadoCita;
    }

    public void reprogramarCita(LocalDate fechaCita, LocalTime horaInicio, LocalTime horaFin ){       
        this.fechaCita = fechaCita;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }   
}
