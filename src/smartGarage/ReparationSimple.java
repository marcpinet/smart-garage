package smartGarage;
import java.util.*;

public class ReparationSimple extends Reparation
{
	
	private double cout;
	private double coutHoraire;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public ReparationSimple(String d, String k, Mecanicien m, double ch) // Un seul mécanicien, sans commentaire
	{
		super(d, k, m);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	public ReparationSimple(String d, String k, Mecanicien m, Commentaire c, double ch) // Un seul mécanicien, avec commentaire
	{
		super(d, k, m, c);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	public ReparationSimple(String d, String k, ArrayList<Mecanicien> m, double ch) // Plusieurs mécaniciens, sans commentaire
	{
		super(d, k, m);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	public ReparationSimple(String d, String k, ArrayList<Mecanicien> m, Commentaire c, double ch) // Plusieurs mécaniciens, avec commentaire
	{
		super(d, k, m, c);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	@Override
	public String toString()
	{
		String retour;
		retour = super.toString();
		retour = retour.concat(", cout=" + this.cout + ", coutHoraire=" + this.coutHoraire);
		return retour; 
	}
	
	public double calculCout()
	{
		return this.coutHoraire * (this.calculDuree() / 60.0);
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public double getCout()
	{
		return cout;
	}

	public void setCout(double cout)
	{
		this.cout = cout;
	}
}