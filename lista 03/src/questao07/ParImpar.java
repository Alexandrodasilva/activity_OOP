import java.util.Scanner;
public class ParImpar{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n;
    int i;
    n = input.nextInt();
    for(i=0; i <= n; i++){
      if( (i % 2) == 0){
        System.out.println("par:");
        System.out.println(i);
      }
      if((i%2) != 0){
        System.out.println("impar:");
        System.out.println(i);
      }
    }
  }
}