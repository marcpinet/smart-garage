package smartGarage;

public class Client
{
	private String nom;
	private String prenom;
	private String mail;
	private Vehicule[] vehicules;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public Client(String nom, String prenom, String mail)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.vehicules = new Vehicule[100];
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------

	public void ajouterVehiculeAClient(Vehicule v) // Afin d'attribuer au client le ou les véhicules qu'il possède et d'en rajouter si jamais.
	{
		int i = 0;
		while(this.vehicules != null) i++;
		this.vehicules[i] = v;
	}
	
	public String toString()
	{
		int i = 0;
		String retour = "Client(nom=" + this.nom + ", prenom=" + this.prenom + ", mail=" + this.mail + ", ";
		
		while(this.vehicules[i] != null)
		{
			retour = retour.concat(this.vehicules[i].toString());
			if(i+1 < this.vehicules.length)
				if(this.vehicules[i+1] != null)
					retour = retour.concat(", ");
			i++;
			
		}
		return retour + ")";
	}
	
	public String getAvancement() // Méthode permettant au client de recevoir une liste des réparations faites sur un ou plusieurs de ses véhicules avec leur état d'avancement.
	{
		String retourFinal = "";
		int i = 0;
		int j = 0;
		while(this.vehicules[i] != null)
		{
			retourFinal = retourFinal.concat("Véhicule n°" + i + ":\n");
			
			while(this.vehicules[i].getFicheSuiveuse().getReparations()[j] != null)
			{
				retourFinal = retourFinal.concat("Réparation n°" + j + ": ");
				
				if(this.vehicules[i].getFicheSuiveuse().getReparations()[j].getEtat() == 0)
					retourFinal = retourFinal.concat("En attente\n");
				
				else if(this.vehicules[i].getFicheSuiveuse().getReparations()[j].getEtat() == 1)
					retourFinal = retourFinal.concat("En cours\n");
				
				else if(this.vehicules[i].getFicheSuiveuse().getReparations()[j].getEtat() == 2)
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

	public Vehicule[] getVehicules()
	{
		return vehicules;
	}

	public void setVehicules(Vehicule[] vehicules)
	{
		this.vehicules = vehicules;
	}
}