package sv.gob.salud.CitasService.modelos.excepciones;

public class DatosCitaInvalidosException extends RuntimeException {
    public DatosCitaInvalidosException(String mensaje) {
        super(mensaje);
    }
}
