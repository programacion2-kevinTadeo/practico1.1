package ejer1;

import java.util.Scanner;
import java.util.Random;

public class Programa {
	
	
	Scanner sc = new Scanner(System.in);
	Random azar = new Random();

	String apellido;
	int edad;
	double altura;
	int cedula;
	
	
	public void iniciar() {
		cargar();
		imprimir();
	}
	
	
	private void cargar(){
		
		System.out.println("Ingrese su apellido: ");
		apellido= sc.nextLine();
		System.out.println("Ingrese su edad: ");
		edad=sc.nextInt();
		System.out.println("Ingrese su altura: ");
		altura=sc.nextDouble();
		System.out.println("Ingrese su cedula: ");
		cedula=sc.nextInt();
	}
	
	private void imprimir(){
		System.out.println("su apellido es:" + apellido);
		System.out.println("su edad es:" + edad);
		System.out.println("su altura es:" + altura);
		System.out.println("su cedula es:" + cedula);
	}
	
	

}
