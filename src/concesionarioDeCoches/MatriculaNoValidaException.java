package concesionarioDeCoches;
/**
 * Excepción que se lanza cuando la matrícula es inválida.
 * 
 * @author Isabel María Gómez Palomeque
 */
public class MatriculaNoValidaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MatriculaNoValidaException(String message) {
		super(message);
	}
}
