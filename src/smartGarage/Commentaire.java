package smartGarage;
import java.io.File;
/**
 * 
 * @author PINET Marc S2TG5
 *
 */
public class Commentaire
{
	private File photo;
	private String description;
	
	// Constructors ----------------------------------------------------------------------------------------------------------
	
	/**
	 * Constructeur pour un commentaire sans photo
	 * @param d
	 */
	public Commentaire(String d)
	{
		this.photo = null;
		this.description = d;
	}
	
	/**
	 * Constructeur pour un commentaire avec photo
	 * @param d
	 * @param p
	 */
	public Commentaire(String d, File p)
	{
		this(d);
		this.photo = p;
	}
	
	// Methods ---------------------------------------------------------------------------------------------------------------
	
	public String toString()
	{
		if(this.photo != null)
			return "Commentaire(description=" + this.description + ", picturePath=" + photo.getAbsolutePath() + ")";
		return "Commentaire(description=" + this.description + ")";
	}
	
	// Getters and Setters ---------------------------------------------------------------------------------------------------
	
	public File getPhoto()
	{
		return photo;
	}

	public void setPhoto(File photo)
	{
		this.photo = photo;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}