package q9;
import java.util.Scanner;
public class energia {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite o salario minimo: ");
		double sal = input.nextDouble();
		System.out.println("digite a quantidade de Kw:");
		double kw = input.nextDouble();
		double valor_kw = sal*(0.2);
		double valor_total_kw = valor_kw*kw;
		System.out.println("valor total de kw: " +valor_total_kw);
		double desconto = valor_total_kw - (valor_total_kw)*0.15;
		System.out.println("valor atualizado do kw em 15%:"+desconto);
		
	}
}
