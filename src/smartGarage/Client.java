package smartGarage;
import java.util.*;

/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class Client
{
	private String nom;
	private String prenom;
	private String mail;
	private ArrayList<Vehicule> vehicules;
	private int moyenPaiement; // -1 = non d�fini, 0 = Esp�ces, 1 = Carte Bancaire
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur unique de Client
	 * @param nom
	 * @param prenom
	 * @param mail
	 */
	public Client(String nom, String prenom, String mail)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.vehicules = new ArrayList<>();
		this.moyenPaiement = -1;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------

	/**
	 * M�thode permettant d'attribuer au client le ou les v�hicules qu'il poss�de et d'en rajouter si jamais.
	 * @param v
	 */
	public void ajouterVehiculeAClient(Vehicule v)
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
	
	/**
	 * M�thode permettant au client de recevoir une liste des r�parations faites sur un ou plusieurs de ses v�hicules avec leur �tat d'avancement.
	 * @return
	 */
	public String getAvancement()
	{
		String retourFinal = "";
		int i = 1;
		int j = 0;
		for(Vehicule v : this.vehicules)
		{
			retourFinal = retourFinal.concat("V�hicule n�" + i + ": " + v.toString() + "\n");
			
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
	
	/**
	 * Permet d'enregistrer un moyen de paiement et le transf�rer � la machine appropri�e
	 * 0 = Esp�ces, 1 = Carte bancaire
	 * @param a
	 * @throws IllegalStateException
	 */
	public void mettreMoyenPaiement(int a) throws IllegalStateException
	{
		switch(a)
		{
			case 1:
				this.moyenPaiement = 1;
				break;
			case 0:
				this.moyenPaiement = 0;
				break;
			default:
				throw new IllegalStateException("Une erreur innatendue est survenue. V�rifiez la validit� du moyen de paiement.");
		}
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

	public int getMoyenPaiement()
	{
		return moyenPaiement;
	}

	public void setMoyenPaiement(int moyenPaiement)
	{
		this.moyenPaiement = moyenPaiement;
	}
	
	
}