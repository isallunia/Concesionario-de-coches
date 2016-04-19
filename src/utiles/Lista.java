package utiles;

import java.util.*;

public class Lista<T> {
	private ArrayList<T> arrayList = new ArrayList<T>();
	/*
	 * Debemos cambiar String por T(generérico para que nos capte el objeto que
	 * queramos pasarle)
	 */

	boolean add(T element) {
		// Por defecto añadirá al final los nuevos elementos añadidos
		return arrayList.add(element);
	}

	/**
	 * Inserta un elemento en la posición indicada.
	 * 
	 * @param index
	 *            Índice donde insertar el eleento
	 * @param element
	 *            Elemento a introducir
	 * @return true si se inserta correctamente. false en otro caso
	 */
	boolean add(int index, T element) {
		if (index < 0 || index > arrayList.size())
			return false;
		arrayList.add(index, element);
		return true;
	}

	boolean reemplazar(int index,
			T element) {/*
						 * T element: No hace falta comprobación porque es
						 * genérico. Jugador element Si fuese Jugador se
						 * comprobaría solo.
						 */
		if (index < 0 || index > arrayList.size())
			return false;
		arrayList.set(index, element);
		return true;
	}

	T remove(int index) {
		return arrayList.remove(index);
	}

	boolean remove(T element) {
		return arrayList.remove(element);
	}

	int size() {
		if (arrayList.isEmpty())
			return 0;
		return arrayList.size();
	}

	// Retocar
	T buscar(T o) {
		if (arrayList.contains(o))
			return o; // Como hemos creado un equals con los campos que
							// deseamos comparar, retocamos el contains de java
							// por defecto a los campos del equals
		return null;
	}
	
	Iterator<T> iterator(){
		return arrayList.iterator();
	}

	@SuppressWarnings("unchecked")
	ArrayList<T> copiar() {
		return (ArrayList<T>) arrayList.clone();
	}

	@Override
	public String toString() {
		return "\nLista [arrayList=" + arrayList + "]";
	}
}
