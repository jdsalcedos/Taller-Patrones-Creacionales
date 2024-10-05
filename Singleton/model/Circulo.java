package model;

public class Circulo {
	private double radio;
	private double area;
	private static Circulo circulo;
	
	private Circulo() {
		this.radio=1;
	}
	
	public static Circulo getInsctance(){
		if(circulo==null) {
			circulo= new Circulo();
		}
		return circulo;
	}
	
	public static void setInstance(double a) {
		getInsctance().radio=a;
	}
	
	public double area() {
		area=Math.PI*Math.pow(radio, 2);
		return area;
	}
	

}
