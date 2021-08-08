package q10;

import java.util.Scanner;

public class main {
	public static void main(String args[]){
		Scanner dado = new Scanner(System.in);
		
		String nome;
		String sexo;
		int idade;
		int peso;
		int altura;
		
		System.out.println("digite o Nome: ");
		nome = dado.next();
		System.out.println("Digite o Sexo: ");
		sexo = dado.next();
		System.out.println("Digite a idade: ");
		idade = dado.nextInt();
		System.out.println("digite o peso");
		peso = dado.nextInt();
		System.out.println("Digite a altura: ");
		altura = dado.nextInt();
		
		
		
		Paciente p = new Paciente(nome, sexo, idade, peso, altura);
		
		
		System.out.println("nome: "+p.getNome());
		System.out.println("sexo: "+p.getSexo());
		System.out.println("idade: "+p.getIdade()+ " anos");
		System.out.println("peso: "+p.getPeso() +" N");
		System.out.println("altura: "+p.getAltura()+ " cm");
		
		System.out.println("valor da consulta: "+p.valorConsulta());
		
	}
}
