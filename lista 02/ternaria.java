
import java.util.Scanner;
public class ternaria {
	public void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Dgite o primeiro numero");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo numero");
		int n2 = input.nextInt();
		if(n1>n2){
			System.out.println("o primeiro numero � o maior!!!");
		}
		if(n1<n2){
			System.out.println("O segundo numero � maior!!!");
		}
	}
}
