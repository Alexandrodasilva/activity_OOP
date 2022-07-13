
import java.util.Scanner;
public class Nadador {
	public void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a Idade do Nadador: ");
		int altura = input.nextInt();
		if(0<=altura&&altura<=10){
			System.out.println("Infatil");
		}
		if(10<altura&&altura<=15){
			System.out.println("jovem");
		}
		if(15<altura&&altura<=30){
			System.out.println("Adolecente");
		}
		if(30<altura&&altura<=45){
			System.out.println("Adulto");
		}
		if(45<altura){
			System.out.println("S�nior");
		}
	}
}
