package ejer2;
import java.util.Random;
import java.util.Scanner;
public class Programa {
	Random azar= new Random();
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
		
		
		
		do{
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
			
		}while(resul!=0);
		System.out.println("Felicitaciones acertaste!!");
	}
	
	//devuelve un numero aleatorio entre 1 y 100
	int generarAleatorio(){

		int aleatorio= azar.nextInt();
	}
	
	//pide un nro por pantalla
	 int pedirNumero(){
		 Scanner entrada=new Scanner(System.in);
		 
		////completar aqu�
		 
	 }
	
	 //compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
	 int compararNumeros(int a, int b){
		 //completar aqu�
	 }
	


}
}
}
