package smartGarage;
import java.util.*;
public class Client
{
	private String nom;
	private String prenom;
	private String mail;
	private ArrayList<Vehicule> vehicules;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public Client(String nom, String prenom, String mail)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.vehicules = new ArrayList<>();
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------

	public void ajouterVehiculeAClient(Vehicule v) // Afin d'attribuer au client le ou les véhicules qu'il possède et d'en rajouter si jamais.
	{
		this.vehicules.add(v);
	}
	
	public String toString()
	{
		String retour = "Client(nom=" + this.nom + ", prenom=" + this.prenom + ", mail=" + this.mail + ", vehicules=";
		
		for(Vehicule v : this.vehicules)
		{
			retour = retour.concat(v.toString());
			retour = retour.concat(", ");
		}
		return retour.substring(retour.length() - 1) + ")";
	}
	
	public String getAvancement() // Méthode permettant au client de recevoir une liste des réparations faites sur un ou plusieurs de ses véhicules avec leur état d'avancement.
	{
		String retourFinal = "";
		int i = 1;
		int j = 0;
		for(Vehicule v : this.vehicules)
		{
			retourFinal = retourFinal.concat("Véhicule n°" + i + ": " + v.toString() + "\n");
			
			for(Reparation r : this.vehicules.get(j).getFicheSuiveuse().getReparations())
			{
				retourFinal = retourFinal.concat("Réparation n°" + j + ": ");
				
				if(r.getEtat() == 0)
					retourFinal = retourFinal.concat("En attente\n");
				
				else if(r.getEtat() == 1)
					retourFinal = retourFinal.concat("En cours\n");
				
				else if(r.getEtat() == 2)
					retourFinal = retourFinal.concat("Achevée\n");
					
				j++;
			}
			i++;
		}
		return retourFinal;
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public ArrayList<Vehicule> getVehicules()
	{
		return vehicules;
	}

	public void setVehicules(ArrayList<Vehicule> vehicules)
	{
		this.vehicules = vehicules;
	}
}