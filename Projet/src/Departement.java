import java.util.ArrayList;
import java.util.Scanner;


public class Departement {
	ArrayList<Section> section;
	ChefDepartement chef;
	String nom;
	public Departement(	String nom) {
		super();
		this.section = new ArrayList<Section>();
		this.nom = nom;
	}
	
	void ajoutChefDep()	
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez son nom...: : "); String nome=sc.nextLine();						
		System.out.println("Donnez son prenom...: : "); String prenom=sc.nextLine();
		System.out.println("Donnez son cin...: : "); long cin=sc.nextLong();
		chef=new ChefDepartement(nome,prenom,cin);
	}
	
	void ajoutSection()	
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez le nom du section à ajouter...: : "); String nom=sc.nextLine();	
		section.add(new Section(nom));
	}
	
	void 	ajoutEtudiant() 
	 { Scanner sc=new Scanner(System.in);
		 System.out.println("Dans quel section voulez vous ajouter cet etudiant?...: : ");String nom=sc.nextLine();	
		 try{
			 for(int i=0;i<section.size();i++)
			 {
				if(section.get(i).nom.equals(nom))
				{
					section.get(i).ajoutEtudiant(); return;
				}
				
			 }
			 throw new ExceptionIntrouvable();
		 }catch(ExceptionIntrouvable e){
			 System.out.println("cette section n'existe pas voulez vous l'ajouter?\n1:  oui\n2:  non");
				int choix;
				try{
					choix= new Scanner(System.in).nextInt();
					if(choix!=1&&choix!=2) throw new InvalidException();
					if(choix==1){
						 ajoutSection(); section.get(section.size()-1).ajoutEtudiant(); return;
					 }else return;
					
				} catch(InvalidException t ){

					 System.out.println("votre choix est invalide");return;
				}
					
					
		 }
						 
		}
	 
	
	void 	ajoutMatiere()
	 { Scanner sc=new Scanner(System.in);
		 System.out.println("Dans quel section voulez vous ajouter cette matiere?...: : ");String nom=sc.nextLine();
		
			 for(int i=0;i<section.size();i++)
			 {
				if(section.get(i).nom.equals(nom))
				{
					section.get(i).ajoutMatiere(); return;
				}
			 }
		
		 
		 System.out.println("cette section n'existe pas voulez vous l'ajouter?\n1:  oui\n2:  non"); int choix= new Scanner(System.in).nextInt();
		 int choix1;
			try{
				choix1= new Scanner(System.in).nextInt();
				if(choix1!=1&&choix1!=2)throw new InvalidException();
				if(choix1==1){
			 ajoutSection(); section.get(section.size()).ajoutMatiere(); return;
				 }else return;
			} catch(InvalidException t){
				System.out.println("Votre choix est invalide(il faut choisir 1 ou 2)...");
			}
	 }
	
	
	
}
