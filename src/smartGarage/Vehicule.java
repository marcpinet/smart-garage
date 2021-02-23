package smartGarage;
import java.awt.Color;

public class Vehicule
{
	private String marque;
	private String modele;
	private Color couleur;
	private int nbCylindre;
	private double contenanceCylindre;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public Vehicule(String marque, String modele, Color couleur, int nbCylindre, double contenanceCylindre)
	{
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.nbCylindre = nbCylindre;
		this.contenanceCylindre = contenanceCylindre;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------

	public String toString()
	{
		return "Vehicule(marque=" + this.marque + ", modele=" + this.modele + ", couleur=" + this.couleur + ", nbCylindre="
				+ this.nbCylindre + ", contenanceCylindre=" + this.contenanceCylindre + ")";
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
}
