import java.util.Scanner;


public class Main {
	static void menu(Faculte f){
		System.out.println("****************************************************************");
		System.out.println("***Pour ajouter    un departement            tapez 1:      *****");
		System.out.println("***Pour ajouter    une section               tapez 2:      *****");
		System.out.println("***Pour ajouter    un etudiant               tapez 3:      *****");
		System.out.println("***Pour ajouter    une matiere               tapez 4:      *****");
		System.out.println("***Pour ajouter    un enseignant             tapez 5:      *****");
		System.out.println("***Pour afficher la liste des departements   tapez 6:      *****");
		System.out.println("***Pour afficher la liste des etudiants      tapez 7:      *****");
		System.out.println("***Pour afficher la liste des sections       tapez 8:      *****");
		System.out.println("***Pour afficher la liste des matieres       tapez 9:      *****");
		System.out.println("***Pour afficher l'administration            tapez 10:     *****");
		System.out.println("***Pour supprimer    un departement          tapez 11:     *****");
		System.out.println("***Pour supprimer    une section             tapez 12:     *****");
		System.out.println("***Pour supprimer    un etudiant             tapez 13:     *****");
		System.out.println("***Pour supprimer    un enseignant           tapez 14:     *****");
		System.out.println("***Pour supprimer    une matiere             tapez 15:     *****");
		System.out.println("***Pour rechercher   un etudiant             tapez 16:     *****");		
		System.out.println("***                      QUITTER                           *****");
		System.out.println("****************************************************************");
		Scanner sc=new Scanner(System.in); int choix=sc.nextInt();
		switch(choix){
		case 1:		f.ajoutDepartement(); menu(f); break;
		case 2:		f.ajoutSection(); menu(f);break;
		case 3:		f.ajoutEtudiant(); menu(f);break;
//		case 4:		f.affichageDepartement(); menu(f);break;
//		case 6:		f.affichageSection(); menu(f);break;
//		case 5:		f.affichageEtudiant(); menu(f);break;	
		case 7:		return;

		}
	}
	public static void main(String[] h){
		Faculte fst = new Faculte("fst");
		menu(fst);
	}
}
