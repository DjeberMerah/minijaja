package fr.femtost.disc.m1comp4.memory;

/* La classe representant les quadruples qui seront des entrées
 *  dans notre pile*/

public class Quadruple {
	
	private String id;
	public Object val;
	private EObjectNature obj;
	private EType sorte;
	
	/*Constructeur*/
	public Quadruple(String id, Object val, EObjectNature obj, EType sorte) {

		this.id = id;
		this.val = val;
		this.obj = obj;
		this.sorte = sorte;

	}
	
	/*Les accesseurs*/
	
	/*Les getters*/
	
	public String getId() {
		return id;
	}
	public EObjectNature getObj() {
		return obj;
	}
	public EType getSorte() {
		return sorte;
	}
	
	/*Les setters*/
	
	public void setId(String id) {
		this.id = id;
	}
	public void setObj(EObjectNature obj) {
		this.obj = obj;
	}
	public void setSorte(EType sorte) {
		this.sorte = sorte;
	}
	
	/*Redifinition de la méthode toString pour afficher correctement notre quadruple*/
	
	public String toString(){

		StringBuffer stringBuffer = new StringBuffer("<");

		stringBuffer.append(id != null ? id : "/");
		stringBuffer.append(", ");

		stringBuffer.append(val != null ? val.toString() : "/");
		stringBuffer.append(", ");

		stringBuffer.append(obj != null ? obj.toString() : "/");
		stringBuffer.append(", ");

		stringBuffer.append(sorte != null ? sorte.toString() : "/");

		stringBuffer.append(">");

		return stringBuffer.toString();
	}
	
	

}
