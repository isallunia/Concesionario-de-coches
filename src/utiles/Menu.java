package utiles;

public class Menu {
	public int SALIR;
	private String nombreMenu;
	private String[] opciones;
	
	

	public Menu(String nombreMenu, String[] opciones) {
		this.nombreMenu = nombreMenu;
		setOpciones(opciones);
	}
	
	public Menu(String[] opciones, String nombreMenu) {
		this.nombreMenu = nombreMenu;
		setOpciones2(opciones);
	}

	private void setOpciones(String[] opciones) {
		this.opciones = new String[opciones.length + 1];
		int i = 0;
		for (String string : opciones) {
			this.opciones[i++] = string;
		}
		this.opciones[i] = "Salir"; // this.opciones[opciones.length]= "Salir";
		SALIR = getOpciones(); //Al invocar la constante estática SALIR se sale del menú
	}
	
	private void setOpciones2(String[] opciones) {
		this.opciones = new String[opciones.length];
		int i = 0;
		for (String string : opciones) {
			this.opciones[i++] = string;
		}
		//SALIR = -1;
	}
	
	/**
	 * @return opciones.lenght
	 */
	public int getOpciones() {
		return opciones.length;
	}

	private void mostrar() {
		int i=0;
		System.out.println("**"+nombreMenu);
		for (String string : opciones/* vector/matriz */) {
			System.out.println("("+(++i)+")"+string);
		}
	}
	private int recogerOpcionValida(){
		int num=Teclado.leerEntero("Inserte el número asociado a la opción: ");
		while(num<1 || num>opciones.length) num=Teclado.leerEntero("Error opcion incorrecta. Inserte el número asociado a la opción: ");
		return num;
	}
	public int gestionar(){
		int num;
		do{
			mostrar();
			num=recogerOpcionValida();
			return num;
		}while(num!=opciones.length);
		//return num;
	}
	public int gestionarSinSalidaSinRepetir(){
		mostrar();
		return recogerOpcionValida();
	}
}