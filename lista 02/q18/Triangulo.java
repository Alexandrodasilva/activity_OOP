package q18;

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
			System.out.println("O comprimento de qualquer lado do triângulo é menor que a soma dos dois comprimentos");
		}
		if( (x == y) || (x == z) || (z == y) ){
			
			
			System.out.println("o triângulo tem dois comprimentos iguais, logo é um triâgulo Isósceles");
		}
		if(x==y & x==z & z==y){
			System.out.println("Todos os comprimentos do triângulo são iguais,por tanto é um triângulo equilátero");
		}
		else if(x != y & x != z & y != z){
			System.out.println("os comprimetos do triângulo é diferente, logo é um triângulo escaleno");
		}
	}
}
