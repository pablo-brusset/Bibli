package Bibli;

import java.util.Scanner;

public class MainBibli {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int id;
		Double prix;
		String titre;
		String Auteur;
		
		System.out.println("Donner l'id du livre en chiffre. ");
		id=sc.nextInt();
		System.out.println("L'id du livre: "+id);
		System.out.println("Donner le prix du livre. ");
		prix=sc.nextDouble();
		System.out.println("Le prix du livre: "+prix+" euros et l'id: "+id);
		System.out.println("Donner le titre du livre. ");
		sc.nextLine();	
		titre=sc.nextLine();
		System.out.println("Le titre du livre: "+titre+", le prix: "+prix+" euros et l'id: "+id);
		System.out.println("Donner l'auteur du livre.");
		Auteur=sc.nextLine();
		System.out.println("L'auteur du livre: "+Auteur+", le titre: "+titre+", le prix: "+prix+" euros, et l'id: "+id);
		Livre book= new Livre(id, prix,titre,Auteur);
		System.out.println(book.toString());
		
	}
	
}
