package fr.femtost.disc.m1comp4.miniJajaExpr;

public abstract class AbstractData {
	private Data data;

	public Data getData() {
		return data;
	}

	
	public void setData(Data data) {
		this.data = data;
	}
	
	public void setData(String identificateur,MjType type,int decalage,int taille) {
		this.data = new Data(identificateur,type,decalage,taille);
	}
	
	
}
