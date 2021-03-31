package smartGarage;
import java.awt.Color;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class Vehicule
{
	private String marque;
	private String modele;
	private Color couleur;
	private int nbCylindre;
	private double contenanceCylindre;
	private FicheSuiveuse ficheSuiveuse;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur unique d'un véhicule
	 * @param marque
	 * @param modele
	 * @param couleur
	 * @param nbCylindre
	 * @param contenanceCylindre
	 * @param ficheSuiveuse
	 */
	public Vehicule(String marque, String modele, Color couleur, int nbCylindre, double contenanceCylindre, FicheSuiveuse ficheSuiveuse)
	{
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.nbCylindre = nbCylindre;
		this.contenanceCylindre = contenanceCylindre;
		this.ficheSuiveuse = ficheSuiveuse;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------

	public String toString()
	{
		return "Vehicule(marque=" + this.marque + ", modele=" + this.modele + ", couleur=" + this.couleur + ", nbCylindre="
				+ this.nbCylindre + ", contenanceCylindre=" + this.contenanceCylindre + ", ficheSuiveuse=" + this.ficheSuiveuse.toString() + ")";
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------

	public String getMarque()
	{
		return marque;
	}

	public void setMarque(String marque)
	{
		this.marque = marque;
	}

	public String getModele()
	{
		return modele;
	}

	public void setModele(String modele)
	{
		this.modele = modele;
	}

	public Color getCouleur()
	{
		return couleur;
	}

	public void setCouleur(Color couleur)
	{
		this.couleur = couleur;
	}

	public int getNbCylindre()
	{
		return nbCylindre;
	}

	public void setNbCylindre(int nbCylindre)
	{
		this.nbCylindre = nbCylindre;
	}

	public double getContenanceCylindre()
	{
		return contenanceCylindre;
	}

	public void setContenanceCylindre(double contenanceCylindre)
	{
		this.contenanceCylindre = contenanceCylindre;
	}

	public FicheSuiveuse getFicheSuiveuse()
	{
		return ficheSuiveuse;
	}

	public void setFicheSuiveuse(FicheSuiveuse ficheSuiveuse)
	{
		this.ficheSuiveuse = ficheSuiveuse;
	}
	
	
}