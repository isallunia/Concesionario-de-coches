package concesionarioDeCoches;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

public class TestConcesionario {
	static Concesionario concesionario = new Concesionario();

	private static Menu menuPrincipal = new Menu("Concesionario de Coches", new String[] { "Alta coche", "Baja Coche",
			"Mostrar Coche", "Mostrar Concesionario", "Contar Coches del Concesionario", "Mostrar Coche según Color" });
	private static Menu menuColor = new Menu("Color del coche.", Color.obtenerColor());
	private static Menu menuModelo = new Menu("Modelo del coche.", Modelo.obtenerModelo());

	public static void main(String[] args) {
		int num;

		do {
			num = menuPrincipal.gestionar();

			switch (num) {
			case 1:// Alta coche
				altaCoche();
				break;
			case 2:// Baja Coche
				bajaCoche();
				break;

			case 3:// Mostrar Coche
				mostrarCoche();
				break;

			case 4:// Mostrar Concesionario
				mostrarConcesionario();
				break;

			case 5:// Contar Coches del Concesionario
				contarCoches();
				break;

			case 6:// Mostrar Coche Según Color
				mostrarCochePorColor();
				break;

			}
		} while (num != menuPrincipal.SALIR);
	}

	private static void mostrarCochePorColor() {
		// Buscar en el array del toString
		// Creas un arrayList y comparas el color obtenido con el de los coches
		// que ya tienes getColor si son iguales, se añade al array.
		ArrayList<Coche> cocheColor = concesionario.buscarCochePorColor(menuColores());
		if(cocheColor == null) System.err.println("Error. No existe el coche de ese color.");
		System.out.println(cocheColor);
	}

	private static void contarCoches() {
		System.out.println("El número de coches es: " + concesionario.size());

	}

	private static void mostrarConcesionario() {
		System.out.println(concesionario);
	}

	private static void mostrarCoche() { //CocheNoExisteException, MatriculaNoValidaException
		try {
			System.out.println(concesionario.buscarCoche(Teclado.leerCadena("Introduce la matrícula: ")));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	private static void bajaCoche() {
		try {
			concesionario.borrar(Teclado.leerCadena("Introduce la matrícula: "));
		} catch (MatriculaNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void altaCoche() {

		try {
			concesionario.anadir(Teclado.leerCadena("Inserte la matrícula: "), menuColores(), menuModelo());
			System.out.println("Coche añadido");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Coche No añadido.");
		}	
	}

	 private static Modelo menuModelo() {
	 int num = menuModelo.gestionar(); // Recoge la opción
	 Modelo[] modelo = Modelo.values();
	 // Declara la clase Modelo en forma de vector y le pasa los valores de
	 // la enumeración
	
	 if (num == modelo.length + 1)
		 return null;
	 return modelo[num - 1];
	 // return Modelo[modelo.obtenerModelo(num-1)];
	 }

//	private static Modelo menuModelo() {
//		int num;
//		do {
//			num = menuModelo.gestionar();
//			switch (num) {
//			case 1: // Córdoba (marca Seat)
//				System.out.println("Seleccionado Córdoba (marca Seat)");
//				return Modelo.CORDOBA;
//			case 2: // Toledo (marca Seat)
//				System.out.println("Seleccionado Toledo (marca Seat)");
//				return Modelo.TOLEDO;
//			case 3: // Ibiza (marca Seat)
//				System.out.println("Seleccionado Ibiza (marca Seat)");
//				return Modelo.IBIZA;
//			case 4: // Serie 1 (marca BMW)
//				System.out.println("Seleccionado Serie 1 (marca BMW)");
//				return Modelo.SERIE1;
//			case 5: // Serie 2 (marca BMW)
//				System.out.println("Seleccionado Serie 2 (marca BMW)");
//				return Modelo.SERIE2;
//			case 6: // Serie 3 (marca BMW)
//				System.out.println("Seleccionado Serie 3 (marca BMW)");
//				return Modelo.SERIE3;
//			case 7: // Serie 5 (marca BMW)
//				System.out.println("Seleccionado Serie 5 (marca BMW)");
//				return Modelo.SERIE4;
//			}
//		} while (num != menuModelo.SALIR);
//		System.out.println("Seleccionado Null");
//		return null;
//	}

	/**
	 * Método que muestra el menú de colores, y permite seleccionar al usuario
	 * uno de ellos.
	 * 
	 * @return Color de Enumeración / null
	 */
	private static Color menuColores() {
		int num;

		do {
			num = menuColor.gestionar();
			switch (num) {
			case 1:
				System.out.println("Seleccionado Azul");
				return Color.AZUL;
			case 2:
				System.out.println("Seleccionado Plata");
				return Color.PLATA;
			case 3:
				System.out.println("Seleccionado Rojo");
				return Color.ROJO;
			}
		} while (num != menuColor.SALIR);
		System.out.println("Seleccionado Null");
		return null;
	}
}
