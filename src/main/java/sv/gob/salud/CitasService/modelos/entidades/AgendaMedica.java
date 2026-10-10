package sv.gob.salud.CitasService.modelos.entidades;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class AgendaMedica {

    private Long id;
    private Empleado medico;
    private Especialidad especialidad;
    private LocalDate fecha;
    private RangoHorario rangoHorario;
    private int cupoMaximo;
    private boolean activa;
    private Set<Cita> citas;


    public Set<RangoHorario> buscarCupo(LocalDate fecha, Empleado empleado, Especialidad especialidad){
        // 1. Inicializar el conjunto correctamente (usando HashSet)
        Set<RangoHorario> cuposDisponibles = new HashSet<>();
        
        // Validación inicial opcional
        if (empleado == null || fecha == null || especialidad == null) {
            return cuposDisponibles; // Retorna vacío si faltan datos clave
        }
        
        return cuposDisponibles;
    }

    public Set<Cita> obtenerAgendaMedica(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFinal){

        Set<Cita> citas = new HashSet<>();

        return citas;
    }

    public boolean verificarDisponibilidadCupo(LocalDate fecha, RangoHorario rangoHorario, Empleado empleado){

        return true;
    }
    
}
