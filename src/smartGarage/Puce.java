package smartGarage;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class Puce
{
	private Vehicule vehiculeAssoc;
	private int numId;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur unique de la classe Puce
	 * @param numId
	 * @param v
	 */
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