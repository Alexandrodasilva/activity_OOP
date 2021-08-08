package q16;
import java.util.Scanner;
public class semana { 
	public void main(String aargs[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite o dia do mês");
		int x = input.nextInt();
		
		//s  t  q  q  s  s  d
		//1  2  3  4  5  6  7 
		//8  9  10 11 12 13 14
		//15 16 17 18 19 20 21
		//22 23 24 25 26 27 28
		//29 30
		
		if(1 == x || 8 == x || 15 == x || 22 == x || 29 == x){
			System.out.println("segunda");
		}
		if(2 == x || 9 == x || 16 == x || 23 == x || 30 == x){
			System.out.println("terça");
		}
		if(3 == x || 10 == x || 17 == x || 24 == x){
			System.out.println("quarta");
		}
		if(4 == x || 11 == x || 18 == x || 25 == x){
			System.out.println("quinta");
		}
		if(5 == x || 12 == x || 19 == x || 26 == x){
			System.out.println("sexta");
		}
		if(6 == x || 13 == x || 20 == x || 27 == x){
			System.out.println("sabado");
		}
		if(7 == x || 14 == x || 21 == x || 28 == x){
			System.out.println("sexta");
		}
		else{
			System.out.println("vc digitou o numero errado que não consta numa em um calendario,"
					+ " por favor digite um numero novamente de 1 até 30");
		}
	}
}
