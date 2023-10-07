package helloworld;

import java.util.Scanner;
	
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char OPC = 'p';
		
		System.out.println("Seleccione su rango de edad");
		
		System.out.println("a) De 0 a 3 años");
		System.out.println("b) De 4 a 12 años");
		System.out.println("c) De 13 a 17 años");
		System.out.println("d) De 18 a 19 años");
		System.out.println("s) Salir");
		
		while (OPC != 's') {//inicio del while
		Scanner opc = new Scanner (System.in); 
		 OPC = opc.next().charAt(0);
		
		switch(OPC) {//inicio switch
		case 'a': System.out.println("Bebé"); break;
		case 'b': System.out.println("Niño"); break;
		case 'c': System.out.println("Joven"); break;
		case 'd': System.out.println("Adulto"); break;
		case 's': System.out.println("Adiós"); break;
		default: System.out.println("Opción inválida");
		}//fin del switch
		}//fin del while
		}}
