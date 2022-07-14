import java.util.Scanner;
public class Data{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int[] data1 = new int[4];
      int[] data2 = new int[6];
      int[] data3 = new int[10];
      int i;
      int j;
      System.out.println("DIGITE data1 ");
      for(i=0 ; i < data1.length ; i++){
        data1[i] = input.nextInt();   
        data3[i] += data1[i];
      }

      System.out.println("DIGITE data2");
      for(i= 4 ; i < data3.length ; i++){
        data2[i-4] = input.nextInt();
        data3[i] += data2[i-4];
      }

      System.out.println("\n");

      System.out.println("data3");
      for(i = 0 ; i < data3.length ; i++){
      System.out.print( " "+data3[i] );
      }
  }  
}