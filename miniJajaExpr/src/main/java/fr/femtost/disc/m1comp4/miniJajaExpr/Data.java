package fr.femtost.disc.m1comp4.miniJajaExpr;

public class Data {
	private String identificateur;
	private MjType type;
	private int decalage ;
	private int taille;
    

    
	
	public Data(String identificateur, MjType type, int decalage, int taille) {
		this.identificateur = identificateur;
		this.type = type;
		this.decalage = decalage;
		this.taille = taille;
	}
	public String getIdentificateur() {
		return identificateur;
	}
	public void setIdentificateur(String identificateur) {
		this.identificateur = identificateur;
	}
	public MjType getType() {
		return type;
	}
	public void setType(MjType type) {
		this.type = type;
	}
	public int getDecalage() {
		return decalage;
	}
	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
    
    

}
