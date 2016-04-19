package concesionarioDeCoches;

import java.util.regex.Pattern;

public class Coche {
	Pattern patternMatricula = Pattern.compile("^(?i)(\\d{4}[\\s\\-]?[B-Z&&[^EIOU]]{3})$");

	private String matricula;
	private Color color;
	private Modelo modelo;

	public Coche(String matricula, Color colorCoche, Modelo modeloCoche) throws Exception {
		setMatricula(matricula);
		setColor(colorCoche);
		setModelo(modeloCoche);
	}

	public Coche(String matricula) throws MatriculaNoValidaException {
		setMatricula(matricula);
	}

	String getMatricula() {
		return matricula;
	}

	private void setMatricula(String matricula) throws MatriculaNoValidaException {
		matricula = matricula.trim().toUpperCase();
		if (!patternMatricula.matcher(matricula).matches())
			throw new MatriculaNoValidaException("Error. La matrícula es inválida.");
		this.matricula = matricula;
	}

	Modelo getModelo() {
		return modelo;
	}

	private void setModelo(Modelo modelo) throws ModeloNoValidoException {
		if (modelo == null)
			throw new ModeloNoValidoException("Error. El modelo es inválido.");
		this.modelo = modelo;
	}

	Color getColor() {
		return color;
	}

	private void setColor(Color color) throws ColorNoValidoException {
		if (color == null)
			throw new ColorNoValidoException("Error. El color es inválido.");
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "\nCoche [Matricula=" + matricula + ", color=" + color + ", modeloCoche=" + modelo + "]";
	}
}
