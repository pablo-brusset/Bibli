package Bibli;

public class Livre {

	int id;
	Double prix;
	String titre;
	String Auteur;
	/**
	 * 
	 * @return
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String Auteur) {
		this.Auteur = Auteur;
	}
	/**
	 * 
	 * @param id
	 * @param prix
	 * @param titre
	 * @param Auteur
	 */
	Livre(int id, Double prix, String titre, String Auteur){
		this.id=id;
		this.prix=prix;
		this.titre=titre;
		this.Auteur=Auteur;
		id++;
	}
	
	@Override
	public String toString() {
		return "Livre [id=" + id + ", prix=" + prix + ", titre=" + titre + ", Auteur=" + Auteur + "]";
		
	}
	
}
