package concesionarioDeCoches;

/**
 * Enumeraci�n acerca del color de un coche.
 * 
 * @author Isabel Mar�a G�mez Palomeque
 */
public enum Color {
	/**
	 * Coche de color azul.
	 */
	AZUL,

	/**
	 * Coche de color plata.
	 */
	PLATA,

	/**
	 * Coche de color rojo.
	 */
	ROJO;

	static String[] obtenerColor() {
		String[] arrayColor = new String[Color.values().length];
		int i = 0;
		for (Color color : values()) {
			arrayColor[i++] = color.name();
		}
		return arrayColor;
	}
}