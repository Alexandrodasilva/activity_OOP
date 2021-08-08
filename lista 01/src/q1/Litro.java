package q1;
import java.util.Scanner;
public class Litro{
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int galao = input.nextInt();
        double litro;
        litro=galao*3.7854;
        System.out.println(" " + litro);
    }
}