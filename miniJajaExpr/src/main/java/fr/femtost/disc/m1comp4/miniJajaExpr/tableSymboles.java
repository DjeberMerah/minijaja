package fr.femtost.disc.m1comp4.miniJajaExpr;

public class tableSymboles {
/*La Capacité maximale du tableau de la tableau  des Symboles */
private	int nombreCase;
/*Le nombre d'elements insérés dns le Tableau*/
private	int nombreElements;
/* Le tableau */
private	TableauSym tableau[];

public tableSymboles(int nombreCase) {
	this.nombreCase = nombreCase;
	this.nombreElements = 0;
	this.tableau = new TableauSym[nombreCase];
}

public int getNombreCase() {
	return nombreCase;
}

public void setNombreCase(int nombreCase) {
	this.nombreCase = nombreCase;
}

public int getNombreElements() {
	return nombreElements;
}

public void setNombreElements(int nombreElements) {
	this.nombreElements = nombreElements;
}

private int fonctionHachage(String id){
	int temp=0,hashcode=0;
	/*somme des codes asci de l'identificateur */
	for(int i=0; i<id.length();i++){
		
		temp+=(int)id.charAt(i);
	}
	hashcode = temp % tableau.length;
	return hashcode;
}

public void ajouter(String id,MjType type, int decalage, int taille,int porte){
	int index = fonctionHachage(id);
	//System.out.println("voici l'index : "+index);
	if(tableau[index]==null){
		
		//System.out.println("premier element existant");
		tableau[index]= new TableauSym(id,type,decalage,taille,porte);
		nombreElements++;
	}
	else{
		//System.out.println("non premier element existant");
		TableauIterator it=(TableauIterator) tableau[index].iterator();
		TableauSym courant = tableau[index];
		while(it.hasNext()){
			courant=it.next();
			if(courant.getData().getIdentificateur().equals(id) && courant.getPorte() == porte && courant.getData().getDecalage()== decalage){
			System.out.println("cet element "+id+" existe deja dans la table ");
			}
		}
		courant.setNextData(new TableauSym(id,type,decalage,taille,porte));
		nombreElements++;
	}	
}


public void affichage(){
	for(int i=0;i<tableau.length;i++){
		if(tableau[i]!=null){
			tableau[i].affichage();
			System.out.println();
		}
	}
}

}
