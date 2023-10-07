package helloworld;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número 1");
		int num1 = sc.nextInt();
		
		System.out.println("Dame un número 2");
		int num2 = sc.nextInt();
		
		if(num1>num2)
			System.out.println("El número 1 es mayor que el número 2");
		else 
			System.out.println("El número 2 es mayor");
		
		
		
	}

}
