

import java.util.Scanner;

public class Triangulo {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o lado x");
		int x = input.nextInt();
		System.out.println("Digite o lado y");
		int y = input.nextInt();
		System.out.println("Digite o lado z");
		int z = input.nextInt();
		
		if(x < y+z || y < x+z || z < x+y){
			System.out.println("O comprimento de qualquer lado do tri�ngulo � menor que a soma dos dois comprimentos");
		}
		if( (x == y) || (x == z) || (z == y) ){
			
			
			System.out.println("o tri�ngulo tem dois comprimentos iguais, logo � um tri�gulo Is�sceles");
		}
		if(x==y & x==z & z==y){
			System.out.println("Todos os comprimentos do tri�ngulo s�o iguais,por tanto � um tri�ngulo equil�tero");
		}
		else if(x != y & x != z & y != z){
			System.out.println("os comprimetos do tri�ngulo � diferente, logo � um tri�ngulo escaleno");
		}
	}
}
