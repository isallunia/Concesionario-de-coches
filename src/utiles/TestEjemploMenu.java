package utiles;

/**
 * Implementa la clase Menu que sirva para gestionar un men�.
 *
 * @author Isabel Mar�a G�mez Palomeque
 *
 */
public class TestEjemploMenu {

	public static void main(String[] args) {

		Menu menu = new Menu("Matrices",
				new String[] { "Crear Matriz", "Sumar", "Restar", "Multiplicar", "Trasponer" });
		@SuppressWarnings("unused")
		int num = menu.gestionar();

	}
}