package concesionarioDeCoches;

/**
 * Representa los modelos. Según el enunciado del examen:
 * 
 * <pre>
 *  Se limitarán los modelos de coches a siete: Córdoba (marca Seat),
 *  Toledo (marca Seat),Ibiza (marca Seat), Serie 1 (marca BMW), Serie 2 (marca BMW),
 *  Serie 3 (marca BMW) y Serie 5 (marca BMW).
 * </pre>
 **/

public enum Modelo {
	/**
	 * Modelo Córdoba asociado a la marca Seat.
	 */
	CORDOBA(Marca.SEAT),

	/**
	 * Modelo Toledo asociado a la marca Seat.
	 */
	TOLEDO(Marca.SEAT),

	/**
	 * Modelo Ibiza asociado a la marca Seat.
	 */
	IBIZA(Marca.SEAT),

	/**
	 * Modelo Serie 1 asociado a la marca BMW.
	 */
	SERIE1(Marca.BMW),

	/**
	 * Modelo Serie 2 asociado a la marca BMW.
	 */
	SERIE2(Marca.BMW),

	/**
	 * Modelo Serie 3 asociado a la marca BMW.
	 */
	SERIE3(Marca.BMW),

	/**
	 * Modelo Serie 4 asociado a la marca BMW.
	 */
	SERIE4(Marca.BMW);

	/*
	 * private String contenido;
	 * 
	 * Modelo(String contenido){ this.contenido = contenido; }
	 * cpd.iesgrancapitan.org:9001
	 */
	

	/**
	 * Es un campo de la enumeración Modelo
	 */
	private Marca marca;

	Modelo(Marca marca) {
		setMarca(marca);
	}

	/**
	 * Realiza la asignación del campo marca de la enumeración Modelo.
	 * 
	 * @param marca
	 *            campo de la enumeración.
	 */
	private void setMarca(Marca marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve el campo marca para poder realizar operaciones posteriores con
	 * él.
	 * 
	 * @return marca devuelve un campo de la enumeración.
	 */
	Marca getMarca() {
		return marca;
	}

	/**
	 * Crea un vector "arrayModelos" que contiene la enumeración pasada a
	 * cadenas. Posibles usos: ser implementada en un menú, obtener la longitud
	 * de la enumeración.
	 * 
	 * @return arrayModelos devuelve un array de cadenas de la enumeración
	 *         Modelo.
	 */
	static String[] obtenerModelo() {
		String[] arrayModelos = new String[values().length]; // Modelo.values().length
		/*
		 * values(): valores de la ENUMERACIÓN contenidos en un array. Ej: new
		 * Modelo[]{CORDOBA, TOLEDO, IBIZA} //Modelo CORDOBA, Modelo TOLEDO,
		 * Modelo IBIZA
		 */

		/*
		 * length: longitud del array( Enumeración en este caso) new
		 * Modelo[values().length]{CORDOBA, TOLEDO, IBIZA}
		 */
		int i = 0;
		for (Modelo modelo : values()) { // Modelo.values()
			arrayModelos[i++] = modelo
					.name();
								/*
								 * name() es un método propio de
								 * la enumeración, que devuelve la enumeración
								 * convertida en String. Misma función que si pusiéramos:
								 * modelo.toString();
								 */
		}
		return arrayModelos;
	}
}
