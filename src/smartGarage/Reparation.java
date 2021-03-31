package smartGarage;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public abstract class Reparation implements InterfaceCout
{
	private String description;
	private String keyword;
	private int etat; // 0 = En attente | 1 = En cours | 2 = TerminÃ©e/AbandonnÃ©e
	private LocalTime dateDebutRepar;
	private LocalTime dateFinRepar;
	private Commentaire commentaire;
	private ArrayList<Mecanicien> mecaniciens;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur pour un seul mécanicien, sans commentaire
	 * @param d
	 * @param k
	 * @param m
	 */
	public Reparation(String d, String k, Mecanicien m)
	{
		this.description = d;
		this.keyword = k;
		this.etat = 0;
		this.dateDebutRepar = LocalTime.now();
		this.dateFinRepar = null;
		this.commentaire = null;
		this.mecaniciens = new ArrayList<>();
		this.mecaniciens.add(m);
	}
	
	/**
	 * Constructeur pour un seul mécanicien, avec commentaire
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 */
	public Reparation(String d, String k, Mecanicien m, Commentaire c)
	{
		this(d, k, m);
		this.commentaire = c;
	}
	
	/**
	 * Constructeur pour plusieurs mécaniciens, sans commentaire
	 * @param d
	 * @param k
	 * @param m
	 */
	public Reparation(String d, String k, ArrayList<Mecanicien> m)
	{
		this.description = d;
		this.keyword = k;
		this.etat = 0;
		this.dateDebutRepar = LocalTime.now();
		this.dateFinRepar = null;
		this.commentaire = null;
		this.mecaniciens = m;
	}
	
	/**
	 * Constructeur pour plusieurs mécaniciens, avec commentaire
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 */
	public Reparation(String d, String k, ArrayList<Mecanicien> m, Commentaire c)
	{
		this(d, k, m);
		this.commentaire = c;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	@Override
	public String toString()
	{
		String retour;
		if(this.commentaire != null)
		{
			if(this.dateFinRepar != null)
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
					+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=" + this.dateFinRepar + ", commentaire="
					+ commentaire.toString() + ", mecaniciens=";
			else
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
				+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=non-termine, commentaire="
				+ commentaire.toString() + ", mecaniciens=";
		}
		else
			if(this.dateFinRepar != null)
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
					+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=" + this.dateFinRepar + ", mecaniciens=";
			else
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
				+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=non-termine, mecaniciens=";
		
		for(Mecanicien m : this.mecaniciens)
		{
			retour = retour.concat(m.toString());
			retour = retour.concat(", ");
		}
		return retour.substring(retour.length() - 1) + ")";
	}
	
	/**
	 * Méthode permettant de calculer la durée totale de toutes les réparations entreprises sur la voiture
	 * @return
	 */
	public long calculDuree()
	{
		LocalTime now = LocalTime.now();
		if(this.dateFinRepar == null)
			return Duration.between(this.dateDebutRepar,now).toMinutes();
		return Duration.between(this.dateDebutRepar,this.dateFinRepar).toMinutes();
	}
	
	/**
	 * Lancement d'une réparation
	 */
	public void startReparation()
	{
		this.dateDebutRepar = LocalTime.now();
		this.etat = 1;
	}
	
	/**
	 * Arrêt d'une réparation
	 */
	public void stopReparation()
	{
		this.dateFinRepar = LocalTime.now();
		this.etat = 2;
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public int getEtat()
	{
		return etat;
	}

	public void setEtat(int etat)
	{
		this.etat = etat;
	}

	public LocalTime getDateDebutRepar()
	{
		return dateDebutRepar;
	}

	public void setDateDebutRepar(LocalTime dateDebutRepar)
	{
		this.dateDebutRepar = dateDebutRepar;
	}

	public LocalTime getDateFinRepar()
	{
		return dateFinRepar;
	}

	public void setDateFinRepar(LocalTime dateFinRepar)
	{
		this.dateFinRepar = dateFinRepar;
	}

	public Commentaire getCommentaire()
	{
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire)
	{
		this.commentaire = commentaire;
	}

	public ArrayList<Mecanicien> getMecaniciens()
	{
		return mecaniciens;
	}

	public void setMecaniciens(ArrayList<Mecanicien> mecaniciens)
	{
		this.mecaniciens = mecaniciens;
	}
	
	
}