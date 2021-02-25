package smartGarage;

public class Puce
{
	private Vehicule vehiculeAssoc;
	private int numId;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public Puce(int numId, Vehicule v)
	{
		this.numId = numId;
		this.vehiculeAssoc = v;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	public String toString()
	{
		return "Puce(numId=" + this.numId + ")";
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public int getNumId()
	{
		return numId;
	}

	public void setNumId(int numId)
	{
		this.numId = numId;
	}

	public Vehicule getVehiculeAssoc()
	{
		return vehiculeAssoc;
	}

	public void setVehiculeAssoc(Vehicule vehiculeAssoc)
	{
		this.vehiculeAssoc = vehiculeAssoc;
	}
}