package model;

public class RegistroEventos {
	private int counter;
	private static RegistroEventos registro;
	
	private RegistroEventos() {
		//iniciar el programa conlleva un registro de usuario
		this.counter=1;
	}
	
	public static RegistroEventos getInsctance() {
		if(registro==null) {
			registro= new RegistroEventos();
		}
		return registro;
	}
	
	public static void setInstance() {
		getInsctance().counter+=1;
	}
	
	public static void mostrarEventos() {
		System.out.println(getInsctance().counter);
	}
	
}
