package smartGarage;
import java.util.*;

public class ReparationComplexe extends Reparation
{
	private int coefReduc;
	private Reparation[] reparations;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Un seul mécanicien, sans commentaire, une réparation
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
	 * Un seul mécanicien, avec commentaire, une réparation
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
	 * Plusieurs mécaniciens, sans commentaire, une réparation
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
	 * Plusieurs mécaniciens, avec commentaire, une réparation
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
	 * Un seul mécanicien, sans commentaire, plusieurs réparations
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
	 * // Un seul mécanicien, avec commentaire, plusieurs réparations
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
	 * Plusieurs mécaniciens, sans commentaire, plusieurs réparations
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
	 * Plusieurs mécaniciens, avec commentaire, plusieurs réparations
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
	 * Calcul le coût de toutes les réparations de la réparation complexe
	 */
	public double calculCout()
	{
		double coutTotal = 0.0;
		for(Reparation r : this.reparations)
			coutTotal += r.calculCout();
		return coutTotal / this.coefReduc;
	}
	
	/**
	 * Ajoute une réparation à la liste des réparations
	 * @param r
	 */
	public void ajouterReparation(Reparation r)
	{
		int i = 0;
		while(this.reparations[i] != null && i < this.reparations.length)
			i++;
		if(i == this.reparations.length)
			System.err.println("Erreur: Impossible d'effectuer cette action. Le nombre de rÃ©parations associÃ©e Ã  cette rÃ©paration complexe dÃ©passe le nombre prÃ©vu pour celle-ci.");
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