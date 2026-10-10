package sv.gob.salud.CitasService.modelos.excepciones;

public class DatosPersonaInvalidosException extends RuntimeException {
    public DatosPersonaInvalidosException(String mensaje) {
        super(mensaje); 
    }    
}
