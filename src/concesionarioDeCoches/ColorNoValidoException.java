package concesionarioDeCoches;
/**
 * Excepci�n que se lanza cuando el color es inv�lido.
 * 
 * @author Isabel Mar�a G�mez Palomeque
 */
public class ColorNoValidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColorNoValidoException(String message) {
		super(message);
	}

}
