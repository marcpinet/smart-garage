package smartGarage;

public class FicheSuiveuse
{
	private Vehicule vehicule;
	private Reparation[] reparations;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public FicheSuiveuse(Vehicule v, Reparation r) // Si une seule et unique réparation est associée à un véhicule
	{
		this.vehicule = v;
		this.reparations = new Reparation[1];
		this.reparations[0] = r;
	}
	
	public FicheSuiveuse(Vehicule v, Reparation[] r) // Si plusieurs réparations sont associées au même véhicule
	{
		this.vehicule = v;
		this.reparations = r.clone();
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	public String toString()
	{
		int i = 0;
		String retour = "FicheSuiveuse(" + this.vehicule.toString() + ", " ;
		
		while(this.reparations[i] != null)
		{
			retour = retour.concat(this.reparations[i].toString());
			i++;
		}
		return retour + ")";
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public Vehicule getVehicule()
	{
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule)
	{
		this.vehicule = vehicule;
	}

	public Reparation[] getReparations()
	{
		return reparations;
	}

	public void setReparations(Reparation[] reparations)
	{
		this.reparations = reparations;
	}
}
