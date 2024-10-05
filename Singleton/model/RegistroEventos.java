package model;

public class RegistroEventos {
	// Atributo privado
	private int counter;

	// Instancia estática de la clase RegistroEventos
	private static RegistroEventos registro;

	// Constructor privado para evitar la creación de múltiples instancias
	private RegistroEventos() {
		this.counter = 1;
	}

	// Método estático para obtener la instancia única de la clase RegistroEventos
	public static RegistroEventos getInsctance() {
		if (registro == null) {
			registro = new RegistroEventos(); // Crea una nueva instancia si no existe
		}
		return registro;
	}

	// Método estático para incrementar el contador de eventos
	public static void setInstance() {
		getInsctance().counter += 1;
	}

	// Método estático para mostrar el número de eventos registrados
	public static void mostrarEventos() {
		System.out.println(getInsctance().counter);
	}
}
