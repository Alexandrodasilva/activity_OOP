import java.util.Scanner;
public class Main{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    int i;
    int []numero = new int [10];
    for(i=0; i < 10; i++){

      System.out.println("Digite "+i+" valor ");

      numero[i] = input.nextInt();

    }
    for(i=0; i < 10; i++){

      if( (numero[i])/2 == 0){

        System.out.println("numero par: "+i);

      }else{
        
        System.out.println("numero impar: "+i);

      }
    }
    
  }
}