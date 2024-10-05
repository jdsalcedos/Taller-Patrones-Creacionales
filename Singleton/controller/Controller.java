package controller;

import view.VistaConsola;
import model.*;

public class Controller {
	private VistaConsola vista;

	public Controller() {
		vista = new VistaConsola();
	}

	// Método principal que ejecuta el programa
	public void run() {
		double c1;
		double c2;
		double radio;
		double lado1;
		double lado2;
		int op = 0;
		int cerrar = 0;
		System.out.println("Bienvenido al cálculo de áreas");
		do {
			menu();
			op = vista.leerDatoInt("Por favor seleccione una de las siguientes opciones:");
			RegistroEventos.setInstance(); // Registra el evento
			// Validación de la opción seleccionada
			while (op != 1 & op != 2 & op != 3 & op != 4 & op != 5) {
				op = vista.leerDatoInt("Seleccione una opción válida:");
				RegistroEventos.setInstance(); // Registra el evento
			}
			switch (op) {
				case 1:
					System.out.println("Hipotenusa de un triángulo rectángulo");
					c1 = vista.leerDatoDouble("Ingrese el valor del cateto 1");
					RegistroEventos.setInstance(); // Registra el evento
					// Validación del valor del cateto 1
					while (c1 <= 0) {
						c1 = vista.leerDatoDouble("Ingrese un valor mayor a 0");
						RegistroEventos.setInstance(); // Registra el evento
					}
					c2 = vista.leerDatoDouble("Ingrese el valor del cateto 2");
					RegistroEventos.setInstance(); // Registra el evento
					// Validación del valor del cateto 2
					while (c2 <= 0) {
						c2 = vista.leerDatoDouble("Ingrese un valor mayor a 0");
						RegistroEventos.setInstance(); // Registra el evento
					}
					Triangulo.getInsctance(); // Obtiene la instancia del triángulo
					Triangulo.setInstance(c1, c2); // Establece los valores de los catetos
					System.out.println("La hipotenusa es: " + Triangulo.getInsctance().calculoH());
					break;
				case 2:
					System.out.println("Cálculo del área de un círculo");
					radio = vista.leerDatoDouble("Ingrese el valor del radio");
					RegistroEventos.setInstance(); // Registra el evento
					// Validación del valor del radio
					while (radio <= 0) {
						radio = vista.leerDatoDouble("Ingrese un valor mayor a 0");
						RegistroEventos.setInstance(); // Registra el evento
					}
					Circulo.getInsctance(); // Obtiene la instancia del círculo
					Circulo.setInstance(radio); // Establece el valor del radio
					System.out.println("El área es de: " + Circulo.getInsctance().area());
					break;
				case 3:
					System.out.println("Cálculo del área de un rectángulo");
					lado1 = vista.leerDatoDouble("Ingrese el valor del lado 1");
					RegistroEventos.setInstance(); // Registra el evento
					// Validación del valor del lado 1
					while (lado1 <= 0) {
						lado1 = vista.leerDatoDouble("Ingrese un valor mayor a 0");
						RegistroEventos.setInstance(); // Registra el evento
					}
					lado2 = vista.leerDatoDouble("Ingrese el valor del lado 2");
					RegistroEventos.setInstance(); // Registra el evento
					// Validación del valor del lado 2
					while (lado2 <= 0) {
						lado2 = vista.leerDatoDouble("Ingrese un valor mayor a 0");
						RegistroEventos.setInstance(); // Registra el evento
					}
					Cuadrado.getInsctance(); // Obtiene la instancia del cuadrado
					Cuadrado.setInstance(lado1, lado2); // Establece los valores de los lados
					System.out.println("El área es de: " + Cuadrado.getInsctance().area());
					break;
				case 4:
					System.out.print("La cantidad de registros hasta el momento es de: ");
					RegistroEventos.mostrarEventos(); // Muestra el número de eventos registrados
					break;
				case 5:
					System.out.println(
							"Gracias por usar el programa\nEl número total de registros de eventos durante esta ejecución fue de: ");
					RegistroEventos.mostrarEventos(); // Muestra el número total de eventos registrados
					System.exit(0);
			}
			cerrar = vista.leerDatoInt("¿Desea hacer otro cálculo? 1 para SI 0 para NO");
			RegistroEventos.setInstance(); // Registra el evento
		} while (cerrar != 0);
		System.out.println(
				"Gracias por usar el programa\nEl número total de registros de eventos durante esta ejecución fue de: ");
		RegistroEventos.mostrarEventos(); // Muestra el número total de eventos registrados
	}

	// Método que muestra el menú de opciones
	public void menu() {
		System.out.println("1. Calcular la hipotenusa de un triángulo rectángulo");
		System.out.println("2. Calcular área de un círculo");
		System.out.println("3. Calcular área de un rectángulo");
		System.out.println("4. Mostrar el número de registros de eventos durante esta ejecución");
		System.out.println("5. Salir del programa");
	}
}