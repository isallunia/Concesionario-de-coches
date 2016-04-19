package concesionarioDeCoches;
/**
 * Excepción que se lanza cuando el color es inválido.
 * 
 * @author Isabel María Gómez Palomeque
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
