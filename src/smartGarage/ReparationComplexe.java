package smartGarage;
import java.util.*;

public class ReparationComplexe extends Reparation
{
	private int coefReduc;
	private Reparation[] reparations;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Un seul m�canicien, sans commentaire, une r�paration
	 * @param d
	 * @param k
	 * @param m
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, Mecanicien m, int cr, Reparation r)
	{
		super(d, k, m);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	/**
	 * Un seul m�canicien, avec commentaire, une r�paration
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, Mecanicien m, Commentaire c, int cr, Reparation r)
	{
		super(d, k, m, c);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	/**
	 * Plusieurs m�caniciens, sans commentaire, une r�paration
	 * @param d
	 * @param k
	 * @param m
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, ArrayList<Mecanicien> m, int cr, Reparation r)
	{
		super(d, k, m);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	/**
	 * Plusieurs m�caniciens, avec commentaire, une r�paration
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, ArrayList<Mecanicien> m, Commentaire c, int cr, Reparation r)
	{
		super(d, k, m, c);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	/**
	 * Un seul m�canicien, sans commentaire, plusieurs r�parations
	 * @param d
	 * @param k
	 * @param m
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, Mecanicien m, int cr, Reparation[] r)
	{
		super(d, k, m);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	/**
	 * // Un seul m�canicien, avec commentaire, plusieurs r�parations
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, Mecanicien m, Commentaire c, int cr, Reparation[] r) 
	{
		super(d, k, m, c);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	/**
	 * Plusieurs m�caniciens, sans commentaire, plusieurs r�parations
	 * @param d
	 * @param k
	 * @param m
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, ArrayList<Mecanicien> m, int cr, Reparation[] r)
	{
		super(d, k, m);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	/**
	 * Plusieurs m�caniciens, avec commentaire, plusieurs r�parations
	 * @param d
	 * @param k
	 * @param m
	 * @param c
	 * @param cr
	 * @param r
	 */
	public ReparationComplexe(String d, String k, ArrayList<Mecanicien> m, Commentaire c, int cr, Reparation[] r)
	{
		super(d, k, m, c);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	@Override
	public String toString()
	{
		int i = 0;
		String retour;
		retour = super.toString();
		retour = retour.concat(", reparations=");
		while(this.reparations[i] != null && i < this.reparations.length)
		{
			retour = retour.concat(this.reparations[i].toString());
			if(i+1 < this.reparations.length)
				if(this.reparations[i+1] != null)
					retour = retour.concat(", ");
			i++;
			
		}
		
		retour = retour.concat(", coefReduc=" + this.coefReduc);
		return retour + ")";
	}
	
	/**
	 * Calcul le co�t de toutes les r�parations de la r�paration complexe
	 */
	public double calculCout()
	{
		double coutTotal = 0.0;
		for(Reparation r : this.reparations)
			coutTotal += r.calculCout();
		return coutTotal / this.coefReduc;
	}
	
	/**
	 * Ajoute une r�paration � la liste des r�parations
	 * @param r
	 */
	public void ajouterReparation(Reparation r)
	{
		int i = 0;
		while(this.reparations[i] != null && i < this.reparations.length)
			i++;
		if(i == this.reparations.length)
			System.err.println("Erreur: Impossible d'effectuer cette action. Le nombre de réparations associée à cette réparation complexe dépasse le nombre prévu pour celle-ci.");
		else
			this.reparations[i] = r;
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public int getCoefReduc()
	{
		return coefReduc;
	}

	public void setCoefReduc(int coefReduc)
	{
		this.coefReduc = coefReduc;
	}
}