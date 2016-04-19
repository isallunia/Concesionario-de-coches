package concesionarioDeCoches;

import java.util.ArrayList;
import java.util.ListIterator;

public class Concesionario {
	private ArrayList<Coche> arrayList = new ArrayList<Coche>();

	void anadir(Coche coche) throws Exception {
		if (arrayList.contains(coche))
			throw new CocheYaExisteException("Error. El coche ya existe.");
		arrayList.add(coche);
	}

	void anadir(String matricula, Color color, Modelo modelo) throws Exception {
		/*
		 * Es mejor este añadir porque no es necesario implementar el
		 * constructor de coche en el test
		 */
		Coche coche = new Coche(matricula, color, modelo);
		if (arrayList.contains(coche))
			throw new CocheYaExisteException("Error. El coche ya existe.");
		arrayList.add(coche); // Faltan excepciones de coche
	}

	boolean borrar(String matricula)
			throws MatriculaNoValidaException { /*
												 * (Coche coche, String
												 * matricula)
												 */
		/*
		 * return arrayList.remove(arrayList.get(arrayList.indexOf(new
		 * Coche(matricula)))); equals indexOf
		 */
		return arrayList.remove(
				new Coche(matricula)); /*
										 * El coche no se crea en el método, se
										 * invoca junto con sus excepciones
										 */
	}

	int size() {
		return arrayList.size();
	}

	Coche get(int index) {
		try {
			return arrayList.get(index);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Error. Índice no válido.");
			return null;
		}
	}

	Coche buscarCoche(String matricula) throws CocheNoExisteException, MatriculaNoValidaException {
		try {
			Coche coche = new Coche(matricula);
			return arrayList.get(arrayList.indexOf(coche));
		} catch (IndexOutOfBoundsException e) {
			throw new CocheNoExisteException("Error. El coche de esa matrícula no existe.");
		}
	}

	ArrayList<Coche> buscarCochePorColor(Color color) {
		ArrayList<Coche> cocheColor = new ArrayList<Coche>();
		for (Coche coche : arrayList) {
			if (coche.getColor().equals(color))
				/*
				 * No necesitamos comparar con el obtenerColor() porque ya lo
				 * controlaremos en el switch/case que estará en el
				 * TestConcesionario. En el que también controlaremos con un
				 * try{}catch si el usuario introduce una opción "nulo"
				 */
				// cocheColor =
				// //arrayList.get(arrayList.indexOf(coche.getColor())) es un
				// objeto coche;
				// cocheColor.add(//arrayList.get(arrayList.indexOf(coche)
				// añadimos el objeto coche dentro de un add));
				cocheColor.add(coche);
		}
		return cocheColor;
	}

//	@Override
//	public String toString() {
//		return "Concesionario: " + arrayList;
//	}
	
	@Override
	public String toString(){
		ListIterator<Coche> listIterator = arrayList.listIterator();
		String msj = "";
		while(listIterator.hasNext()){
			msj += listIterator.next().toString();
		}
		return "Concesionario: "+msj;
	}
}
