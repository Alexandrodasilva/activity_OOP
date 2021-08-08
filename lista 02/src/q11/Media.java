package q11;
import java.util.Scanner;
public class Media {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite a primeira nota: ");
		double n1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double n3 = input.nextDouble();
		double media = (n1+n2+n3)/3;
		System.out.println("media: "+media);
		if(0<=media&&media<3){
			System.out.println("Reprovado");
		}
		if(3<=media&&media<7 ){
			System.out.println("prova final");
		}
		else if(7<=media&&media<=10){
			System.out.println("aprovado");
		}
	}
}
