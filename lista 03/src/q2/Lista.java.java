import java.util.Scanner;
public class Lista{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiros: ");
        int x = input.nextInt();

        System.out.println("Digite o segundo numero inteiros: ");
        int y = input.nextInt();
        int soma = 0;

        if(x>y){ 
            for(int i = 1+y ; i < x ; i++){
                soma += i;
            }
            System.out.println("soma: "+soma);
            While(x<y){
                x++;
                int soma += x;
            }
        }
     

        soma = 0;
        if(x<y){ 
            for(int i = 1+x ; i < y ; i++){
                soma += i;
            }
            System.out.println("soma: "+soma);

        }
        
    } 
}