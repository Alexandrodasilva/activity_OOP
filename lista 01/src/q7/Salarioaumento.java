package q7;
import java.util.Scanner;
public class Salarioaumento {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite o salario do fucuionario?");
		double sal = input.nextDouble();
		double aumento= 0.25;
		double novo_salario= (sal*aumento)+sal;
		System.out.println("novo salario:" +novo_salario);
	}
}
