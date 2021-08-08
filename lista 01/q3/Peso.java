package q3;
import java.util.Scanner;
public class Peso {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite a sua massa??");
		double m = input.nextDouble();
		double p;
		p = m*1.7;
		System.out.println("peso:" +p+ " "+"N");
	}
}
