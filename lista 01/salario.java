
import java.util.Scanner;
public class salario {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("digite o salrio do funcionario? ");
		double sal_func = input.nextDouble();
		double salario = 998;
		double sal_min = (sal_func)/(salario);
		System.out.println("salario minimo do funciionario: " +sal_min);
		
	}
}
