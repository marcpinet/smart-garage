package smartGarage;

public class ReparationComplexe extends Reparation
{
	private int coefReduc;
	private Reparation[] reparations;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public ReparationComplexe(String d, String k, int e, Mecanicien m, int cr, Reparation r) // Un seul mécanicien, sans commentaire, une réparation
	{
		super(d, k, e, m);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien m, Commentaire c, int cr, Reparation r) // Un seul mécanicien, avec commentaire, une réparation
	{
		super(d, k, e, m, c);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien[] m, int cr, Reparation r) // Plusieurs mécaniciens, sans commentaire, une réparation
	{
		super(d, k, e, m);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien[] m, Commentaire c, int cr, Reparation r) // Plusieurs mécaniciens, avec commentaire, une réparation
	{
		super(d, k, e, m, c);
		this.coefReduc = cr;
		this.reparations = new Reparation[100];
		this.reparations[0] = r;
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien m, int cr, Reparation[] r) // Un seul mécanicien, sans commentaire, plusieurs réparations
	{
		super(d, k, e, m);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien m, Commentaire c, int cr, Reparation[] r) // Un seul mécanicien, avec commentaire, plusieurs réparations
	{
		super(d, k, e, m, c);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien[] m, int cr, Reparation[] r) // Plusieurs mécaniciens, sans commentaire, plusieurs réparations
	{
		super(d, k, e, m);
		this.coefReduc = cr;
		this.reparations = r.clone();
	}
	
	public ReparationComplexe(String d, String k, int e, Mecanicien[] m, Commentaire c, int cr, Reparation[] r) // Plusieurs mécaniciens, avec commentaire, plusieurs réparations
	{
		super(d, k, e, m, c);
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
		while(this.reparations[i] != null)
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
	
	public double calculCout()
	{
		double coutTotal = 0;
		for(Reparation r : this.reparations)
			coutTotal += r.calculCout();
		return coutTotal * this.coefReduc;
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
