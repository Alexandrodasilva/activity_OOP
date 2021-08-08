import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    int i;
    double potencia = 0;
    for( i=0 ; i < 9 ; i++ ){
      potencia = Math.pow(3,i);
      System.out.println(potencia);
    } 
  }
}