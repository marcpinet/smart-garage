package smartGarage;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class Mecanicien
{
	private String nom;
	private String prenom;
	private String numBadge; // String dans le cas o� son nom�ro commence par un 0 car int retire les 0 en d�but de nombres.
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur unique de la classe M�canicien
	 * @param n
	 * @param p
	 * @param nb
	 */
	public Mecanicien(String n, String p, String nb)
	{
		this.nom = n;
		this.prenom = p;
		this.numBadge = nb;
	}

	// Methods ---------------------------------------------------------------------------------------------------------------
	
	public String toString()
	{
		return "Mecanicien(nom=" + this.nom + ", numbadge=" + this.numBadge + ")";
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

	public String getNumBadge()
	{
		return numBadge;
	}

	public void setNumBadge(String numBadge)
	{
		this.numBadge = numBadge;
	}
}