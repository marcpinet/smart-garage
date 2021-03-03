package smartGarage;
import java.time.Duration;
import java.time.LocalTime;

public abstract class Reparation implements InterfaceCout
{
	private String description;
	private String keyword;
	private int etat; // 0 = En attente | 1 = En cours | 2 = Terminée/Abandonnée
	private LocalTime dateDebutRepar;
	private LocalTime dateFinRepar;
	private Commentaire commentaire;
	private Mecanicien[] mecaniciens;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public Reparation(String d, String k, Mecanicien m) // Un seul mécanicien, sans commentaire
	{
		this.description = d;
		this.keyword = k;
		this.etat = 0;
		this.dateDebutRepar = LocalTime.now();
		this.dateFinRepar = null;
		this.commentaire = null;
		this.mecaniciens = new Mecanicien[1];
		this.mecaniciens[0] = m;
	}
	
	public Reparation(String d, String k, Mecanicien m, Commentaire c) // Un seul mécanicien, avec commentaire
	{
		this(d, k, m);
		this.commentaire = c;
	}
	
	public Reparation(String d, String k, Mecanicien[] m) // Plusieurs mécaniciens, sans commentaire
	{
		this.description = d;
		this.keyword = k;
		this.etat = 0;
		this.dateDebutRepar = LocalTime.now();
		this.dateFinRepar = null;
		this.commentaire = null;
		this.mecaniciens = m.clone();
	}
	
	public Reparation(String d, String k, Mecanicien[] m, Commentaire c) // Plusieurs mécaniciens, avec commentaire
	{
		this(d, k, m);
		this.commentaire = c;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	@Override
	public String toString()
	{
		int i = 0;
		String retour;
		if(this.commentaire != null)
		{
			if(this.dateFinRepar != null)
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
					+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=" + this.dateFinRepar + ", commentaire="
					+ commentaire.toString() + ", mecaniciens=";
			else
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
				+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=non-terminé, commentaire="
				+ commentaire.toString() + ", mecaniciens=";
		}
		else
			if(this.dateFinRepar != null)
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
					+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=" + this.dateFinRepar + ", mecaniciens=";
			else
				retour = "Reparation(description=" + this.description + ", keyword=" + this.keyword + ", etat=" + this.etat
				+ ", dateDebutRepar=" + this.dateDebutRepar + ", dateFinRepar=non-terminé, mecaniciens=";
		
		while(this.mecaniciens[i] != null)
		{
			retour = retour.concat(this.mecaniciens[i].toString());
			if(i+1 < this.mecaniciens.length)
				if(this.mecaniciens[i+1] != null)
					retour = retour.concat(", ");
			i++;
			
		}
		return retour + ")";
	}
	
	public long calculDuree()
	{
		LocalTime now = LocalTime.now();
		if(this.dateFinRepar == null)
			return Duration.between(this.dateDebutRepar,now).toMinutes();
		return Duration.between(this.dateDebutRepar,this.dateFinRepar).toMinutes();
	}
	
	public void startReparation()
	{
		this.dateDebutRepar = LocalTime.now();
		this.etat = 1;
	}
	
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

	public Mecanicien[] getMecaniciens()
	{
		return mecaniciens;
	}

	public void setMecaniciens(Mecanicien[] mecaniciens)
	{
		this.mecaniciens = mecaniciens;
	}
}