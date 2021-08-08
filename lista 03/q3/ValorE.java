import java.util.Scanner;
public class ValorE{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n;
        float i;
        float E;

        System.out.println("digite um numero inteiro e positivo: ");

        n = input.nextFloat();
        
        for( i=1 ; i <= n ; i++ ){
          E = (1/i);
          System.out.println(E);
        }
    }
}