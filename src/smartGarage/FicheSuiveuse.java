package smartGarage;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.*;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class FicheSuiveuse
{
	private ArrayList<Reparation> reparations;
	private static int nbFichesSuiveusesTotal = 0;
	private int id;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Si une seule et unique r�paration est associ�e � un v�hicule
	 * @param r
	 */
	public FicheSuiveuse(Reparation r)
	{
		this.id = nbFichesSuiveusesTotal;
		this.reparations = new ArrayList<>();
		this.reparations.add(r);
		nbFichesSuiveusesTotal++;
	}
	
	/**
	 * Si plusieurs r�parations sont associ�es au m�me v�hicule
	 * @param r
	 */
	public FicheSuiveuse(ArrayList<Reparation> r)
	{
		this.id = nbFichesSuiveusesTotal;
		this.reparations = r;
		nbFichesSuiveusesTotal++;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	public String toString()
	{
		String retour = "FicheSuiveuse(";
		
		for(Reparation r : this.reparations)
		{
			retour = retour.concat(r.toString());
		}
		return retour + ")";
	}
	
	/**
	 *  Enregistrer une copie de la fiche suiveuse avec toutes les informations li�es � celle-ci + nom personnalis� selon la date et l'heure
	 */
	public void saveFicheSuiveuse()
	{
		String nomFichier = "fichesuivese" + this.id + "-" + LocalTime.now().toString() + ".txt";
		
		String finalString = nomFichier.replace(":", "-"); // Car Windows ne peut pas cr�er de fichiers avec des ':' dedans.
				
		try {
		      File fichier = new File(finalString);
		      if (fichier.createNewFile()) 
		    	  System.out.println("Fichier cr�e avec succ�s au chemin : " + fichier.getAbsolutePath());
		      else 
		    	  System.out.println("Fichier d�j� existant..");
		} 
		catch (IOException e) {
		      System.out.println("Une erreur s'est produite");
		      e.printStackTrace();
		}
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------

	public ArrayList<Reparation> getReparations()
	{
		return reparations;
	}

	public void setReparations(ArrayList<Reparation> reparations)
	{
		this.reparations = reparations;
	}

	public static int getNbFicheSuiveusesTotal()
	{
		return nbFichesSuiveusesTotal;
	}

	public static void setNbFicheSuiveusesTotal(int nbFicheSuiveusesTotal)
	{
		FicheSuiveuse.nbFichesSuiveusesTotal = nbFicheSuiveusesTotal;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}