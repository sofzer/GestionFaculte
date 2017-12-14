import java.util.ArrayList;
import java.util.Scanner;


public class Faculte {
	ArrayList<Departement> departement;
	Administration administration;
	String nom;
	public Faculte( String nom) {
		super();
		this.departement = new ArrayList<Departement>();
		this.nom = nom;
	}
	void ajoutEnseignant(){
		administration.ajoutEnseignant();
	}
	void ajoutDepartement()	
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez le nom du departement à ajouter...: : "); String nom=sc.nextLine();	
		departement.add(new Departement(nom));
	}
	
	 void 	ajoutSection()
	 { Scanner sc=new Scanner(System.in);
		 System.out.println("Dans quel departement voulez vous ajouter cette section?...: : ");String nom=sc.nextLine();	
		 for(int i=0;i<departement.size();i++)
		 {
			if(departement.get(i).nom.equals(nom))
			{
				departement.get(i).ajoutSection(); return;
			}
		 }
		 System.out.println("ce departement n'existe pas voulez vous l'ajouter?\n1:  oui\n2:  non"); int choix= new Scanner(System.in).nextInt();
		 if(choix==1){
			 ajoutDepartement(); departement.get(departement.size()-1).ajoutSection(); return;
		 }else return;
	 }
	 
	 void 	ajoutEtudiant() 
	 { Scanner sc=new Scanner(System.in);
		 System.out.println("Dans quel departement voulez vous ajouter cette etudiant?...: : ");String nom=sc.nextLine();	
		 for(int i=0;i<departement.size();i++)
		 {
			if(departement.get(i).nom.equals(nom))
			{
				departement.get(i).ajoutEtudiant(); return;
				 
			}
		 }
		 System.out.println("ce departement n'existe pas voulez vous l'ajouter?\n1:  oui\n2:  non"); int choix= new Scanner(System.in).nextInt();
		 if(choix==1){
			 ajoutDepartement(); departement.get(departement.size()-1).ajoutEtudiant(); 
			 return;
		 }else return;
	 }
	 
	 void 	ajoutMatiere()
	 { Scanner sc=new Scanner(System.in);
		 System.out.println("Dans quel departement voulez vous ajouter cette matiere?...: : ");String nom=sc.nextLine();	
		 for(int i=0;i<departement.size();i++)
		 {
			if(departement.get(i).nom.equals(nom))
			{
				departement.get(i).ajoutMatiere(); return;
			}
		 }
		 System.out.println("ce departement n'existe pas voulez vous l'ajouter?\n1:  oui\n2:  non"); int choix= new Scanner(System.in).nextInt();
		 if(choix==1){
			 ajoutDepartement(); departement.get(departement.size()-1).ajoutMatiere(); return;
		 }else return;
	 }
	 
}
