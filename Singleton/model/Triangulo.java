package model;

public class Triangulo {
	private double c1;
	private double c2;
	private double h;
	private static Triangulo triangulo;
	
	private Triangulo() {
		this.c1=6;
		this.c2=12;
	}
	
	public static Triangulo getInsctance(){
		if(triangulo==null) {
			triangulo= new Triangulo();
		}
		return triangulo;
	}
	
	public static void setInstance(double a, double b) {
		getInsctance().c1=a;
		getInsctance().c2=b;
	}
	
	public double calculoH(){
		h=Math.sqrt(Math.pow(getInsctance().c1, 2)+Math.pow(getInsctance().c2, 2));
		return h;
	}
	
}
