package br.com.generation.Exercicio02;

import java.util.Scanner;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Cachorro dog = new Cachorro();
		Preguica preg = new Preguica();
		Cavalo cav = new Cavalo();
		
		System.out.println("Qual o nome do Cachorro?");
		String nomeDog = read.nextLine();
		dog.setNome(nomeDog);
		System.out.println();
		
		System.out.println("Qual o nome do Cavalo?");
		String nomeCav = read.nextLine();
		cav.setNome(nomeCav);
		System.out.println();
		
		System.out.println("Qual o nome da Preguiça?");
		String nomePreg = read.nextLine();
		preg.setNome(nomePreg);
		System.out.println();
		
		System.out.println("Qual a idade do Cachorro?");
		int idadeDog = read.nextInt();
		dog.setIdade(idadeDog);
		System.out.println();
		
		System.out.println("Qual a idade do Cavalo?");
		int idadeCav = read.nextInt();
		cav.setIdade(idadeCav);
		System.out.println();
		
		System.out.println("Qual a idade da Preguiça?");
		int idadePreg = read.nextInt();
		preg.setIdade(idadePreg);
		System.out.println();
		
		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade());
		System.out.println();
		
		System.out.println("Nome da Preguiça: " + preg.getNome());
		System.out.println("Idade da Preguiça: " + preg.getIdade());
		System.out.println();
		
		System.out.println("Nome do Cavalo: " + cav.getNome());		
		System.out.println("Idade do Cavalo: " + cav.getIdade());
		System.out.println();
		
		dog.emitirSom();
		preg.emitirSom();
		cav.emitirSom();
		
		
		read.close();
	}
}
