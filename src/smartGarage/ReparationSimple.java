package smartGarage;
import java.util.*;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class ReparationSimple extends Reparation
{
	
	private double cout;
	private double coutHoraire;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Un seul mécanicien, sans commentaire
	 * @param d
	 * @param k
	 * @param m
	 * @param ch
	 */
	public ReparationSimple(String d, String k, Mecanicien m, double ch)
	{
		super(d, k, m);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	/**
	 * Un seul mécanicien, avec commentaire
	 */
	public ReparationSimple(String d, String k, Mecanicien m, Commentaire c, double ch)
	{
		super(d, k, m, c);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	/**
	 * Plusieurs mécaniciens, sans commentaire
	 * @param d
	 * @param k
	 * @param m
	 * @param ch
	 */
	public ReparationSimple(String d, String k, ArrayList<Mecanicien> m, double ch)
	{
		super(d, k, m);
		this.cout = 0;
		this.coutHoraire = ch;
	}
	
	/**
	 * Plusieurs mécaniciens, avec commentaire
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 * @param ch
	 */
	public ReparationSimple(String d, String k, ArrayList<Mecanicien> m, Commentaire c, double ch)
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
	
	/**
	 * Calcul le coût de la réparation simple
	 */
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