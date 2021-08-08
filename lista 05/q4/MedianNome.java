import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      String []nome = new String[5];
      double []media = new double[5];
      int i;
      int j;
      double aux = 0;
      String aux1 = null;
      String aux3 = " ";
      double aux2 = 0;

      for( i = 0 ; i < 5 ; i++){

        System.out.println("Digite o nome do aluno "+(i+1)+" : ");
        nome[i] = input.next();

        System.out.println("Digite a média dele: ");
        media[i] = input.nextDouble();

        if(aux < media[i]){
          aux = media[i];
          aux1 = nome[i]; 
        }
        if(media[i]< 5.0){
           aux3 += " , "+nome[i];
        }
      }

      System.out.println(aux1+" Tem a maior media que é :"+aux);
      System.out.println("\n");
      System.out.print(" Aluno(s) que estão abaixos da média: "+aux3);
  }  
}