package q19;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Data data = new Data(1,30);
		int getMinuto = 0;
		int getHora = 0;
		data.segundo = (getHora*3600 + getMinuto*60);
		System.out.println("segundo: "+data.segundo);
	}

}
