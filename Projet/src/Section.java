import java.util.ArrayList;
import java.util.Scanner;


public class Section {
	ArrayList<Etudiant> etudiant;
	ArrayList<Matiere> matiere;
	String nom;
	public Section(String nom) {
		super();
		this.etudiant =new ArrayList<Etudiant>();
		this.matiere =new ArrayList<Matiere>();
		this.nom = nom;
	}
	
	void ajoutEtudiant()	
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez son nom...: : "); String nome=sc.nextLine();						
		System.out.println("Donnez son prenom...: : "); String prenom=sc.nextLine();
		System.out.println("Donnez son cin...: : "); long cin=sc.nextLong();
		etudiant.add(new Etudiant(nome,prenom,cin));
	}
	
	void ajoutMatiere()	
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez son nom...: : "); String nom=sc.nextLine();						
		System.out.println("Donnez sa coeffecient...: : "); float coeff=sc.nextFloat();
		matiere.add(new Matiere(nom,coeff));
	}
	

}
