import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
     int[][] num = new int[5][8];
     int i = 0 , j = 0 ;
     int aux;
     int[] n = new int[1];

	System.out.println("digite o elementos da matriz numerica");
	for (  i = 0 ; i < 5 ; i++){
     for( j = 0 ; j < 8 ; j++){
        num[i][j] = input.nextInt();
     }   	
	}
  System.out.println("Matriz prenchida");

   System.out.println("digite um numero");
   n[i] = input.nextInt();
   if(n[i] == num[i][j] ){
       System.out.println("numero esta"+num[i][j]+"na posicao "+i+"X"+j); 
      }
      else{
           System.out.println("o NUMERO QUE VC DIGITOU NÃO CONSTA NA MATRIX");
      }
 System.out.println("Matriz");
	for (  i = 0; i < 5 ; i++){
     for(j = 0 ; j < 8 ; j++){
      System.out.print(num[i][j]);
     } 
     System.out.println("\n");  	
	}
     
  }
}