package sv.gob.salud.CitasService.modelos.excepciones;

public class CitaNoDisponibleException extends RuntimeException{
    public CitaNoDisponibleException(String mensaje) {
        super(mensaje);    
    }
    
}
