package q1;

import java.util.Scanner;

public class AppLivros {
	public static void main(String args[]){
		Livros livros1 = new Livros("ar seco",10,1234);
		Livros livros2 = new Livros("diluvio dos robos",8,5678);
		Livros livros3 = new Livros("vikings",5,9876);
		
		System.out.println("EXEMPLARES 01 : "+livros1.getExemplares());
		System.out.println("Modificado para menos dois: "+(livros1.getExemplares()-2));
		
		System.out.println("EXEMPLARES 02 :  "+livros2.getExemplares());
		System.out.println("Modificado para mais dois:  "+(livros2.getExemplares()+2));
		
		System.out.println("EXEMPLARES 03 : "+livros3.getExemplares());
		System.out.println("Modifado para mais cinco "+(livros3.getExemplares()+5));
	
	}

}
