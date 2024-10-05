package view;

import java.util.Scanner;

public class VistaConsola {
	private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }
    
    public int leerDatoInt(String msj) {
        int dato;
        System.out.println(msj);
        dato = sc.nextInt();
        return dato;
    }
    
    public double leerDatoDouble(String msj) {
        double dato;
        System.out.println(msj);
        dato = sc.nextDouble();
        return dato;
    }

}
