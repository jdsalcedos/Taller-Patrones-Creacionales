package model;

public class Circulo {
	// Atributos privados
	private double radio;
	private double area;

	// Instancia estática de la clase Circulo
	private static Circulo circulo;

	// Constructor privado para evitar la creación de múltiples instancias
	private Circulo() {
		this.radio = 1;
	}

	// Método estático para obtener la instancia única
	public static Circulo getInsctance() {
		if (circulo == null) {
			circulo = new Circulo(); // Crea una nueva instancia si no existe
		}
		return circulo; // Retorna la instancia única
	}

	// Método estático para establecer el radio de la instancia única
	public static void setInstance(double a) {
		getInsctance().radio = a;
	}

	// Método para calcular el área del círculo
	public double area() {
		area = Math.PI * Math.pow(radio, 2);
		return area;
	}
}