import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int i;
      char[] caracter = new char[5];
      System.out.println("digite 5 caracteres");
      for(i=0; i < 5; i++){
           caracter[i] = input.next().charAt(0); 
      }
      for(i=0; i < 5; i++){
          if(caracter[0] == caracter[5] && caracter[5-1] == caracter[1]){
           System.out.println("é um polindromo");
           System.out.println(caracter[i]);
          }
          else{
              System.out.println("Não é um polindromo");
              System.out.println(caracter[i]);
          }
      }


  }  
}