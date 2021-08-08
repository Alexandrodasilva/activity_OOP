import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      Aluno[] aluno = new Aluno[5];
      int i;
      int j;
      double aux = 0;
      String aux1 = null;
      String aux3 = " ";
      double aux2 = 0;

      for( i = 0 ; i < 5 ; i++){
          aluno[i] = new Aluno();
        System.out.println("Digite o nome do aluno "+(i+1)+" : ");
        aluno[i].nome = input.next();

        System.out.println("Digite a média dele: ");
        aluno[i].media = input.nextDouble();

        if(aux < aluno[i].media){
          aux = aluno[i].media;
          aux1 = aluno[i].nome; 
        }
        if(aluno[i].media < 5.0){
           aux3 += "  "+aluno[i].nome;
        }
      }

      System.out.println(aux1+" Tem a maior media que é :"+aux);
      System.out.println("\n");
      System.out.print(" Aluno(s) que estão abaixos da média: "+aux3);
  }  
}