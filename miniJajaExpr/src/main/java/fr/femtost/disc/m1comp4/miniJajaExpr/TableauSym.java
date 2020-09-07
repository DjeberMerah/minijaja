package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.Iterator;

public class TableauSym extends AbstractData implements Iterable <TableauSym>{
	private int porte; //portée de l variable 
	//référence vers la cellule suivante
	
	private TableauSym nextData;
	
	
	
	public TableauSym(int porte, TableauSym nextData) {
		this.porte = porte;
		this.nextData = nextData;
	}
	public TableauSym(String identificateur, MjType type, int decalage, int taille,int porte){
		this.setData(new Data(identificateur,type,decalage,taille));
		this.porte=porte;
		setNextData(null);
	}
	
	public int getPorte() {
		return porte;
	}
	public void setPorte(int porte) {
		this.porte = porte;
	}
	public TableauSym getNextData() {
		return nextData;
	}
	public void setNextData(TableauSym nextData) {
		this.nextData = nextData;
	}
	
	
	
	public TableauSym recherche(String id){
		TableauIterator tab=(TableauIterator)iterator();
		TableauSym courant;
		while(tab.hasNext()){
			courant=tab.next();
			if(courant.getData().getIdentificateur().equals(id)){
				return courant;
			}
		}
		return null;
	}

	@Override
	public Iterator<TableauSym> iterator() {
		// TODO Auto-generated method stub
		TableauIterator tab = new TableauIterator(this);
		return tab;
	}
	
	public boolean egualite(TableauSym tableau){
		return this.getData().equals(tableau.getData()) && this.porte==tableau.porte;
	}

	public void affichage(){
		TableauIterator tab=(TableauIterator)iterator();
		while(tab.hasNext()){
			TableauSym courant=tab.next();
			System.out.print("id: "+courant.getData().getIdentificateur()+" -> ");
		}
	}

}


