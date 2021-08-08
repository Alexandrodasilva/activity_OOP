package q14;
import java.util.Scanner;
public class Crescente_descrescente {
	public void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite o prieiro numero: ");
		int n1 = input.nextInt();
		System.out.println("digite o segundo numero: ");
		int n2 = input.nextInt();
		System.out.println("digite o terceiro numero: ");
		int n3 = input.nextInt();
		
		if(n1>n2&&n2>n3){
			System.out.println("crescente"+n1+n2+n3);
			System.out.println("descrente"+n3+n2+n1);
		}
		
		if(n2>n1&&n1>n3){
			System.out.println("crescente"+n2+n1+n3);
			System.out.println("descrencente"+n3+n1+n2);
		}
		
		if(n3>n2&&n2>n1){
			System.out.println("crescente"+n3+n2+n1);
			System.out.println("descrente"+n1+n2+n3);
		}
		
		if(n2>n3&&n3>n1){
			System.out.println("crescente"+n2+n3+n1);
			System.out.println("descrecente"+n1+n3+n2);
		}
		
		if(n1>n3&&n3>n2){
			System.out.println("crescente"+n1+n3+n2);
			System.out.println("descrente"+n2+n3+n1);
		}
	}
}