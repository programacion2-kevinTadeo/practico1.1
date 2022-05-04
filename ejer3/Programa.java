package ejer3;
import java.util.Scanner;
import java.util.Random;
public class Programa {
Scanner teclado=new Scanner(System.in);

	void iniciar(){
		String or1, or2;
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
		
	}
	
	//carga de teclado dos String
	String cargarString(){
		System.out.println("ingrese una palabra:");
		String str1=teclado.next();
		return str1;
		//completar aquí
			 
	}
	
	//despliega menu
	void menu(String a, String b){
		int cadena1= a.length();
		int cadena2 = b.length();
		int opcion;
	do {
			System.out.println("Elija una opcion:");
			System.out.println("1-Imprimir ambas cadenas y su largo");
			System.out.println("2-Comparar igualdad y cual es menor");
			System.out.println("3-Cambiar una cadena a todo mayúsculas y otra a todo minúsculas.");
			System.out.println("4-Cargar nuevamente ambos Strings");
			System.out.println("0-Salir");
			opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println((a)+" el largo de la cadena es : "+(cadena1));
			System.out.println((b)+"el largo de la cadena es : "+(cadena2));
			break;
		case 2:
			if(cadena1==cadena2) {
				System.out.println("Ambas cadenas tienen misma cantidad de caracteres");
			}
			else if(cadena1>cadena2) {
				System.out.println("La primera frase es mas larga que la segunda");
			}
			else if(cadena1<cadena2) {
					System.out.println("La primera frase es mas corta que la segunda");
				}
			break;
			
		case 3:
			Random azar=new Random();
			int num2=azar.nextInt(2);
			if (num2==1) {
				System.out.println(a.toLowerCase());
				System.out.println(b.toUpperCase());
			}
			else {
				System.out.println(b.toLowerCase());
				System.out.println(a.toUpperCase());
			}
			break;
		case 4:
			iniciar();
			break;
		}
		
		
		}while(opcion!=0);
			//completar aquí				
					
	}
	

	}


