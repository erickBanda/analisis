package helloworld;

import java.util.Scanner;

public class pancho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cómo te llamas?");
		Scanner nom = new Scanner (System.in);
		String nombre = nom.next();
		
		System.out.println("¿Cuántos años tienes?");
		Scanner ed = new Scanner (System.in);
		String edad = ed.next();
		
		System.out.println("¿De dónde eres?");
		Scanner ori = new Scanner (System.in);
		String origen = ori.next();
		 System.out.println("Hola "+nombre+ " de " +edad+" y proveniente de "+origen+"");
		 
		 
		
		

	}

}
