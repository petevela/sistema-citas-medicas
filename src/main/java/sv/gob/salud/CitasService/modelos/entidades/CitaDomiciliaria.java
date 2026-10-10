
package sv.gob.salud.CitasService.modelos.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import sv.gob.salud.CitasService.modelos.enums.TipoCita;
import sv.gob.salud.CitasService.modelos.enums.Prioridad;
import sv.gob.salud.CitasService.modelos.enums.EstadoCita;

public class CitaDomiciliaria extends Cita {

    private String direccionVisita;
    private String referenciaUbicacion;

    public CitaDomiciliaria(
            Long id,
            AgendaMedica agendaMedica,
            Expediente expediente,
            int orden,
            EstadoCita estadoCita,
            Prioridad prioridad,
            TipoCita tipo,
            Cita citaOrigen,
            LocalDate fechaCita,
            LocalTime horaInicio,
            LocalTime horaFin,
            String direccionVisita,
            String referenciaUbicacion) {

        super(
            id,
            agendaMedica,
            expediente,
            orden,
            estadoCita,
            prioridad,
            tipo,
            citaOrigen,
            fechaCita,
            horaInicio,
            horaFin
        );

        if (direccionVisita == null || direccionVisita.isBlank()) {
            throw new IllegalArgumentException(
                "La dirección de visita es obligatoria"
            );
        }

        this.direccionVisita = direccionVisita;
        this.referenciaUbicacion = referenciaUbicacion;
    }

    public String getDireccionVisita() {
        return direccionVisita;
    }

    public String getReferenciaUbicacion() {
        return referenciaUbicacion;
    }

    public void actualizarDireccion(String direccionVisita, String referenciaUbicacion) {
        if (direccionVisita == null || direccionVisita.isBlank()) {
            throw new IllegalArgumentException(
                "La dirección de visita es obligatoria"
            );
        }

        this.direccionVisita = direccionVisita;
        this.referenciaUbicacion = referenciaUbicacion;
    }

    public String obtenerUbicacionCompleta() {
        if (referenciaUbicacion == null || referenciaUbicacion.isBlank()) {
        return direccionVisita;
        }

        return direccionVisita + " - Referencia: " + referenciaUbicacion;
    }

    public boolean tieneReferenciaUbicacion() {
            return referenciaUbicacion != null && !referenciaUbicacion.isBlank();
        }

        public String mostrarDatosDomiciliarios() {
            return "Dirección: " + direccionVisita
            + "\nReferencia: "
            + (referenciaUbicacion == null ? "No especificada" : referenciaUbicacion);
        }

}