import java.util.Scanner;
public class Tabuada{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x;
    int i;
    System.out.println("Digite a tabauada que deseja: ");
    x = input.nextInt();
    if(x>0){
      for( i=0 ; i<=10 ; i++ ){
        System.out.println("10 * "+i+ " = "+(i*x) );
      }
    }
    if( x < 0 ){
      System.out.println("Não pode, tente com um numero inteiro positivo");
    }
  }
}