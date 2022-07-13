import java.util.Scanner;
public class circulo {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("digite o raio do circulo?");
		double raio = input.nextDouble();
		double area = raio*raio*3.14;
		System.out.println("area d circulo:" +area);
	}
}
