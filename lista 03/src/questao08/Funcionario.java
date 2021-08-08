import java.util.Scanner;
public class Funcionario{
  public static void main(String[]args){
    int i;
    double j;
    double porc =19;
    double din;
    double dinheiro;
    for( i = 2005, j = 0  ; i <= 2016 && j <= porc ; i++, j = j+1.5 ){
      din =  (1000*j)/100;
      dinheiro = 1000+din;

      System.out.println("mês " +i+ ", $: " +dinheiro);
    
    }
  }
}