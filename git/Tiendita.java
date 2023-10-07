 package helloworld;

import java.util.Scanner;

public class Tiendita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(Agregar, modificar, buscar y vender)==(nombre, precio, categoría, código)
	String arrProd[][] = new String [4][5];
	int opc = 0, F = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		
		System.out.println("1) Agregar producto");
		System.out.println("2) Modificar producto");
		System.out.println("3) Buscar producto");
		System.out.println("4) Vender producto");
		System.out.println("5) Salir");
		opc = sc.nextInt();
		switch(opc) {
		
			case 1:
				System.out.println("Dime el nombre del producto");
				arrProd[F][0] = sc.next();
				System.out.println("Dime el precio del producto");
				arrProd[F][1] = sc.next();
				System.out.println("Dime la categoría del producto");
				arrProd[F][2] = sc.next();
				System.out.println("Dime el código del producto");
				arrProd[F][3] = sc.next();
				F++;
				break;
			case 2:
				System.out.println("Escribe el nombre del producto que quieres modificar");
				String modif = sc.next(); int e = 0;
				for (int i=0; i<arrProd.length;i++) {
				if(arrProd[i][0]!=null){
					if (arrProd[i][0].equals(modif)){
						e++;
						System.out.println("encontrado");
						
					}
				if (e>0) {
					System.out.println("¿Qué quieres modificar?");
					System.out.println("Nombre?");
					System.out.println("Precio");
					System.out.println("Categoría");
					System.out.println("Código");
					}
					
				}
				}
		}//Switch
		
		
		
	
		
	
    }while (opc != 5);
}}