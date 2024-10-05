package model;

public class Triangulo {
	// Atributos privados
	private double c1;
	private double c2;
	private double h;

	// Instancia estática de la clase Triangulo
	private static Triangulo triangulo;

	// Constructor privado
	private Triangulo() {
		this.c1 = 6;
		this.c2 = 12;
	}

	// Método estático para obtener la instancia única
	public static Triangulo getInsctance() {
		if (triangulo == null) {
			triangulo = new Triangulo(); // Crea una nueva instancia si no existe
		}
		return triangulo;
	}

	// Método estático para establecer los catetos de la instancia única
	public static void setInstance(double a, double b) {
		getInsctance().c1 = a;
		getInsctance().c2 = b;
	}

	// Método para calcular la hipotenusa del triángulo
	public double calculoH() {
		h = Math.sqrt(Math.pow(getInsctance().c1, 2) + Math.pow(getInsctance().c2, 2));
		return h;
	}
}