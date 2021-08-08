import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int [][]numero = new int[4][4];
    int i;
    int j;
    int aux = 0;

    System.out.println("Digite os Numeros da matriz 4x4: ");
    for(i = 0 ; i < 4 ; i ++){
       for(j = 0 ; j < 4 ; j++){
         numero[i][j] = input.nextInt();
         if(aux < numero[i][j]){
            aux = numero[i][j];
         }
      }
    }

    System.out.println("Matriz 4x4");
    for(i = 0 ; i < 4 ; i ++){
       for(j = 0 ; j < 4 ; j++){
         System.out.print(numero[i][j]+" ");
      }
       System.out.println("\n");
    }

     System.out.println("maior numero da matriz: "+aux);

     System.out.println("Matriz 4x4 multiplicada pelo maior numero da matriz");
     for(i = 0 ; i < 4 ; i ++){
       for(j = 0 ; j < 4 ; j++){
         System.out.print(numero[i][j]*aux+" ");
      }
       System.out.println("\n");
    }
  }
}