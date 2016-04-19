package utiles;

/**
 * Implementa la clase Menu que sirva para gestionar un menú.
 *
 * @author Isabel María Gómez Palomeque
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