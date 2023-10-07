package projects;

import java.util.Scanner;

public class ADAU2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//En arreglos dobles registrar los puntos de 3 equipos de basketball (bulls, hits, uady)
		//Imprimir el que acumuló más y el que menos
		
		String [][]arrEq ={ {"Bulls", "0"}, 
							{"Hits", "0"},
							{"Uady", "0"}};
		int opc = 0, i = 0;
		String a = "";
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Selecciona el equipo que al que se le sumará +1 punto:");
		System.out.println();
		System.out.println("1)Bulls");
		System.out.println("2)Hits");
		System.out.println("3)Uady");
		System.out.println("4)Revisar puntos");		
		System.out.println();
		System.out.println("5)Opción finalizar");
		
		while (opc !=4) {
		opc = sc.nextInt();
			if(opc==1){
				i++;
				String n = Integer.toString(i);
				arrEq[0][1] = n;
				System.out.println("Productos disponibles");
						for(int c = 0; c<arrEq.length;c++ ) {
							for(int d = 0; d<arrEq[c].length;d++) {
							 System.out.print(arrEq[c][d]+" ");
						}
						System.out.println();
						}
				System.out.println("+1 a los Bulls");
				System.out.println("Presione:1, 2, 3 para continuar");
				System.out.println("Presione 4 para finalizar");
			}	
			if(opc==2){
				i++;
				String n = Integer.toString(i);
				arrEq[0][2] = n;
				System.out.println("+1 a los Hits");
				System.out.println("Presione:1, 2, 3 para continuar");
				System.out.println("Presione 4 para finalizar");
			}
			if(opc==3){
				i++;
				String n = Integer.toString(i);
				arrEq[1][3] = n;
				System.out.println("+1 a la Uady");
				System.out.println("Presione:1, 2, 3 para continuar");
				System.out.println("Presione 4 para finalizar");
			}
			if(opc==4){
				i++;
				String n = Integer.toString(i);
				arrEq[1][3] = n;
				System.out.println("+1 a la Uady");
				System.out.println("Presione:1, 2, 3 para continuar");
				System.out.println("Presione 4 para finalizar");
			}
		}//Fin While
	
	}
}