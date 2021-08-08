import java.util.Scanner;
public class InteracaoFor{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int i;
    int n = 32 ;
    for( i = 1 ; i <= n ; i = i*2 ){
      System.out.println(i);
    } 
  }
}