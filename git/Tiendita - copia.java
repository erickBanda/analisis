 package helloworld;

import java.util.Scanner;

public class Tiendita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(Agregar, modificar, buscar y vender)==(nombre, precio, categoría, código)
	String arrProd[][] = new String [10][4];
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
		
			case 1://agregar
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
			case 2://Modificar
					System.out.println("Productos disponibles");
					for(int x = 0; x<arrProd.length;x++ ) {
						for(int y = 0; y<arrProd[x].length;y++) {
						 System.out.print(arrProd[x][y]+" ");
					}
					System.out.println();	
					}
					
				System.out.println("Escribe el nombre del producto que quieres modificar");
				int e = 0, cs2 = 0, colum = 0;			
				String modif = sc.next(); 
				for (int i=0; i<arrProd.length;i++) {
					if(arrProd[i][0]!=null){
						if (arrProd[i][0].equals(modif)){
							e++; colum = i;
						}
					
						if (e>0) {
							String case2 = "";
							System.out.println("¿Qué quieres modificar?");
							System.out.println("1) Nombre");
							System.out.println("2) Precio");
							System.out.println("3) Categoría");
							System.out.println("4) Código");
								cs2 = sc.nextInt();
								switch(cs2){
									case 1:
										System.out.println("Escribe el nombre");
										case2 = sc.next();
										arrProd[colum][0] = case2; 
										break;
									case 2:
										System.out.println("Escribe el precio");
										case2 = sc.next();
										arrProd[colum][1] = case2;
										break;
									case 3:
										System.out.println("Escribe la categoría");
										case2 = sc.next();
										arrProd[colum][2] = case2;
										break;
									case 4:
										System.out.println("Escribe el código");
										case2 = sc.next();
										arrProd[colum][3] = case2;
										System.out.println(arrProd[0][3]);
										
								}
									System.out.println("Producto modificado");
								}
							}
				}
				break;
			case 3://Buscar
				System.out.println("Productos encontrados:");
				for(int c = 0; c<arrProd.length;c++ ) {
					for(int d = 0; d<arrProd[c].length;d++) {
					 System.out.print(arrProd[c][d]+" ");
				}
				System.out.println();	
				}
				break;
			case 4://vender
				System.out.println("Productos disponibles");
					for(int c = 0; c<arrProd.length;c++ ) {
						for(int d = 0; d<arrProd[c].length;d++) {
						 System.out.print(arrProd[c][d]+" ");
					}
					System.out.println();	
					}
					System.out.println("Escriba el nombre del producto que quiere vender");
					
					int e1 = 0, cs21 = 0, colum1 = 0;			
					String modif1 = sc.next(); 
					for (int i=0; i<arrProd.length;i++) {
						if(arrProd[i][0]!=null){
							if (arrProd[i][0].equals(modif1)){
								e1++; colum1 = i;
							}
							if (e1>0) {
								arrProd[i][0]=null;
								arrProd[i][1]=null;
								arrProd[i][2]=null;
								arrProd[i][3]=null;
							}
						}}
					System.out.println("El producto se vendio");
		}//Switch
    }while (opc != 5);			System.out.println("Salir");
	
}}