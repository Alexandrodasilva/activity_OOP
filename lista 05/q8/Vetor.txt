import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int i;
      int[] vetor = new int[10];
      System.out.println("digite dez elementos do vetor  ");
      for(i=0 ; i < 10 ; i++){
           vetor[i] = input.nextInt();
      } 
      for(i=0; i < 10; i++){
          if(vetor[i]%2 != 0){
            System.out.println("vetor primo "+vetor[i]+" e posição: "+(i+1) );
           }
      }


  }  
}



