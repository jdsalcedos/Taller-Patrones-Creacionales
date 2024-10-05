package model;

public class Cuadrado {
	private double lado1;
	private double lado2;
	private double area;
	private static Cuadrado cuadro;
	
	private Cuadrado() {
		this.lado1=6.35;
		this.lado2=4.9;
	}
	
	public static Cuadrado getInsctance(){
		if(cuadro==null) {
			cuadro= new Cuadrado();
		}
		return cuadro;
	}
	
	public static void setInstance(double a, double b) {
		getInsctance().lado1=a;
		getInsctance().lado2=b;
	}
	
	public double area() {
		area=getInsctance().lado1*getInsctance().lado2;
		return area;
	}

}
