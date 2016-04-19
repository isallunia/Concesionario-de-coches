package concesionarioDeCoches;
/**
 * Excepci�n que se lanza cuando la matr�cula es inv�lida.
 * 
 * @author Isabel Mar�a G�mez Palomeque
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
