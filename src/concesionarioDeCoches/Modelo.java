package concesionarioDeCoches;

/**
 * Representa los modelos. Seg�n el enunciado del examen:
 * 
 * <pre>
 *  Se limitar�n los modelos de coches a siete: C�rdoba (marca Seat),
 *  Toledo (marca Seat),Ibiza (marca Seat), Serie 1 (marca BMW), Serie 2 (marca BMW),
 *  Serie 3 (marca BMW) y Serie 5 (marca BMW).
 * </pre>
 **/

public enum Modelo {
	/**
	 * Modelo C�rdoba asociado a la marca Seat.
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
	 * Es un campo de la enumeraci�n Modelo
	 */
	private Marca marca;

	Modelo(Marca marca) {
		setMarca(marca);
	}

	/**
	 * Realiza la asignaci�n del campo marca de la enumeraci�n Modelo.
	 * 
	 * @param marca
	 *            campo de la enumeraci�n.
	 */
	private void setMarca(Marca marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve el campo marca para poder realizar operaciones posteriores con
	 * �l.
	 * 
	 * @return marca devuelve un campo de la enumeraci�n.
	 */
	Marca getMarca() {
		return marca;
	}

	/**
	 * Crea un vector "arrayModelos" que contiene la enumeraci�n pasada a
	 * cadenas. Posibles usos: ser implementada en un men�, obtener la longitud
	 * de la enumeraci�n.
	 * 
	 * @return arrayModelos devuelve un array de cadenas de la enumeraci�n
	 *         Modelo.
	 */
	static String[] obtenerModelo() {
		String[] arrayModelos = new String[values().length]; // Modelo.values().length
		/*
		 * values(): valores de la ENUMERACI�N contenidos en un array. Ej: new
		 * Modelo[]{CORDOBA, TOLEDO, IBIZA} //Modelo CORDOBA, Modelo TOLEDO,
		 * Modelo IBIZA
		 */

		/*
		 * length: longitud del array( Enumeraci�n en este caso) new
		 * Modelo[values().length]{CORDOBA, TOLEDO, IBIZA}
		 */
		int i = 0;
		for (Modelo modelo : values()) { // Modelo.values()
			arrayModelos[i++] = modelo
					.name();
								/*
								 * name() es un m�todo propio de
								 * la enumeraci�n, que devuelve la enumeraci�n
								 * convertida en String. Misma funci�n que si pusi�ramos:
								 * modelo.toString();
								 */
		}
		return arrayModelos;
	}
}
