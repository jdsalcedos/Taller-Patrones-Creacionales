package controller;

import view.VistaConsola;
import model.*;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista= new VistaConsola();
	}
	
	public void run(){
		double c1;
		double c2;
		double radio;
		double lado1;
		double lado2;
		int op=0;
		int cerrar=0;
		System.out.println("bienvenido al cálculo de áreas");
		do {
			menu();
			op=vista.leerDatoInt("Por favor seleccione una de las siguientes opciones:");
			RegistroEventos.setInstance();
			while(op!=1 & op!=2 & op!=3 & op!=4 & op!=5) {
				op=vista.leerDatoInt("Seleccione una opción válida:");
				RegistroEventos.setInstance();
			}
			switch(op) {
				case 1:
					System.out.println("Hipotenusa de un triángulo rectángulo");
					c1=vista.leerDatoDouble("Ingrese el valor del cateto 1");
					RegistroEventos.setInstance();
					while(c1<=0) {
						c1=vista.leerDatoDouble("ingrese un valor mayor a 0");
						RegistroEventos.setInstance();
					}
					c2=vista.leerDatoDouble("Ingrese el valor del cateto 2");
					RegistroEventos.setInstance();
					while(c2<=0) {
						c2=vista.leerDatoDouble("ingrese un valor mayor a 0");
						RegistroEventos.setInstance();
					}
					Triangulo.getInsctance();
					Triangulo.setInstance(c1, c2);
					System.out.println("La hipotenusa es: "+ Triangulo.getInsctance().calculoH());
					break;
				case 2:
					System.out.println("Cálculo del área de un círculo");
					radio=vista.leerDatoDouble("Ingrese el valor del radio");
					RegistroEventos.setInstance();
					while(radio<=0) {
						radio=vista.leerDatoDouble("ingrese un valor mayor a 0");
						RegistroEventos.setInstance();
					}
					Circulo.getInsctance();
					Circulo.setInstance(radio);
					System.out.println("El área es de: "+ Circulo.getInsctance().area());
					break;
				case 3:
					System.out.println("Cálculo del área de un rectángulo");
					lado1=vista.leerDatoDouble("Ingrese el valor del lado 1");
					RegistroEventos.setInstance();
					while(lado1<=0) {
						lado1=vista.leerDatoDouble("ingrese un valor mayor a 0");
						RegistroEventos.setInstance();
					}
					lado2=vista.leerDatoDouble("Ingrese el valor del lado 2");
					RegistroEventos.setInstance();
					while(lado2<=0) {
						lado2=vista.leerDatoDouble("ingrese un valor mayor a 0");
						RegistroEventos.setInstance();
					}
					Cuadrado.getInsctance();
					Cuadrado.setInstance(lado1,lado2);
					System.out.println("El área es de: "+ Cuadrado.getInsctance().area());
					break;
				case 4:
					System.out.print("La cantidad de registros hasta el momento es de: ");
					RegistroEventos.mostrarEventos();
					break;
				case 5:
					System.out.println("Gracias por usar el programa\nEl número total de registros de eventos durante esta ejecución fue de: ");
					RegistroEventos.mostrarEventos();
					System.exit(0);
			}
			cerrar=vista.leerDatoInt("¿Desea hacer otro cálculo? 1 para SI 0 para NO");
			RegistroEventos.setInstance();
		}while(cerrar!=0);
		System.out.println("Gracias por usar el programa\nEl número total de registros de eventos durante esta ejecución fue de: ");
		RegistroEventos.mostrarEventos();
	}
	
	public void menu() {
		System.out.println("1. cálcular la hipotenusa de un triángulo resctángulo");
		System.out.println("2. cálcular área de un círculo");
		System.out.println("3. cálcular área de un rectángulo");
		System.out.println("4. Mostrar el número de registros de eventos durante esta ejecución");
		System.out.println("5. Salir del programa");
	}
}
