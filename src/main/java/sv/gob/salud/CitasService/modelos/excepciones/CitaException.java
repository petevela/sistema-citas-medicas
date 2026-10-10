package sv.gob.salud.CitasService.modelos.excepciones;

public class CitaException extends RuntimeException {    // Constructor que recibe un mensaje personalizado
    public CitaException(String mensaje) {
        super(mensaje);    
    }
    
}
