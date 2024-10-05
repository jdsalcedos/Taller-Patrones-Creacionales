package model;

public class Cuadrado {
	// Atributos privados
	private double lado1;
	private double lado2;
	private double area;

	// Instancia estática de la clase Cuadrado
	private static Cuadrado cuadro;

	// Constructor privado para evitar la creación de múltiples instancias
	private Cuadrado() {
		this.lado1 = 6.35;
		this.lado2 = 4.9;
	}

	// Método estático para obtener la instancia única
	public static Cuadrado getInsctance() {
		if (cuadro == null) {
			cuadro = new Cuadrado(); // Crea una nueva instancia si no existe
		}
		return cuadro;
	}

	// Método estático para establecer los lados de la instancia única
	public static void setInstance(double a, double b) {
		getInsctance().lado1 = a;
		getInsctance().lado2 = b;
	}

	// Método para calcular el área del cuadrado
	public double area() {
		area = getInsctance().lado1 * getInsctance().lado2;
		return area;
	}
}