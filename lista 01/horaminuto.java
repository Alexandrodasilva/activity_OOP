
import java.util.Scanner;
public class horaminuto {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("digite a hora?");
		int hora = input.nextInt();
		System.out.println("e os minutos?");
		double min =input.nextInt();
		System.out.println(hora+":"+min);
		double hora_min = hora*60;
		double novo_min = hora_min+min;
		System.out.println("transformado hora em  minuto e somado com minutos:"+ novo_min);
		double seg = novo_min*60;
		System.out.print("transformado os minutos em segundos:"+ seg);
	}
}
