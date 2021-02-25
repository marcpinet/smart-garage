package smartGarage;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class FicheSuiveuse
{
	private Vehicule vehicule;
	private Reparation[] reparations;
	private static int nbFicheSuiveusesTotal = 0;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	public FicheSuiveuse(Vehicule v, Reparation r) // Si une seule et unique réparation est associée à un véhicule
	{
		this.vehicule = v;
		this.reparations = new Reparation[1];
		this.reparations[0] = r;
		nbFicheSuiveusesTotal++;
	}
	
	public FicheSuiveuse(Vehicule v, Reparation[] r) // Si plusieurs réparations sont associées au même véhicule
	{
		this.vehicule = v;
		this.reparations = r.clone();
		nbFicheSuiveusesTotal++;
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
	
	public void saveFicheSuiveuse()
	{
		String nomFichier = "fichesuivese" + nbFicheSuiveusesTotal + "-" + LocalTime.now().toString() + ".txt";
		
		String finalString = nomFichier.replace(":", "-"); // Car Windows ne peut pas créer de fichiers avec des ':' dedans.
				
		try {
		      File fichier = new File(finalString);
		      if (fichier.createNewFile()) 
		    	  System.out.println("Fichier crée avec succès au chemin : " + fichier.getAbsolutePath());
		      else 
		    	  System.out.println("Fichier déjà existant..");
		} 
		catch (IOException e) {
		      System.out.println("Une erreur s'est produite");
		      e.printStackTrace();
		}
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