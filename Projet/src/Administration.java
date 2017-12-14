import java.util.ArrayList;
import java.util.Scanner;


public class Administration {

	ArrayList<Enseignant> enseignant;

	public Administration() {
		super();
		this.enseignant =new ArrayList<Enseignant>() ;
	}
	
	void ajoutEnseignant(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez son nom...: : "); String nome=sc.nextLine();						
		System.out.println("Donnez son prenom...: : "); String prenom=sc.nextLine();
		System.out.println("Donnez son cin...: : "); long cin=sc.nextLong();
		enseignant.add(new Enseignant(nome,prenom,cin));
	}
	
	
}
