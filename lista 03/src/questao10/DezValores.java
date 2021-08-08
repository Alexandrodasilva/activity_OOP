import java.util.Scanner;
public class DezValores{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double x;
    int i;
    double y = 0.0;
    double soma = 0;
    double media=0;
    for( i = 1 ; i <= 10 ; i++ ){
      System.out.println("digite o numero "+i+":");
       x = input.nextDouble();
      if(x > 0 ){
       soma +=x;
       media = soma/10;
       if(y < x){
          y = x;
       }
      }
      if( x < 0 ){
        System.out.println("Digite um numero positivo");
      }
     
    }
    System.out.println("maior valor: "+y);
     System.out.println("soma: "+soma);
     System.out.println("media: "+media);
  }
}