
import java.util.Scanner;
public class media {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite a primeira nota?");
		double n1 = input.nextDouble();
		System.out.println("digite a segunda nota?");
		double n2 = input.nextDouble();
		System.out.println("digite a terceira nota?");
		double n3 = input.nextDouble();
		double media = (n1+n2+n3)/3;
		System.out.println("media do aluno:" +media);
		
	}
}
