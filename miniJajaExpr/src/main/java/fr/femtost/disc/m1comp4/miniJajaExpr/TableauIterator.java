package fr.femtost.disc.m1comp4.miniJajaExpr;

import java.util.Iterator;

public class TableauIterator implements Iterator<TableauSym> {
private TableauSym  tableau;
	@Override
	
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return tableau != null;
	}

	public TableauIterator(TableauSym tableau) {
		// TODO Auto-generated constructor stub
		this.tableau = tableau;
	}

	@Override
	public TableauSym next() {
		// TODO Auto-generated method stub
		TableauSym courant = this.tableau;
		this.tableau = this.tableau.getNextData();
		return courant;
	}

}
