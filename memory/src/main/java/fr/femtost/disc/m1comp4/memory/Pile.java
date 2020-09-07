package fr.femtost.disc.m1comp4.memory;

import java.util.LinkedList;


/* Class Pile represents the structure of our stack*/

public class Pile extends LinkedList <Quadruple> {

	private static final long serialVersionUID = 1L;
	//Constructor of an empty stack
	public Pile() {
		super();
	}
	
	//Function toString to show our stack
	public String toString() {

		StringBuffer stringBuffer = new StringBuffer("");

		for(int i = 0 ; i < size() ; i++ ) {

			stringBuffer.append(get(i).toString());
			stringBuffer.append("\n");

		}

		return  stringBuffer.toString();
	}

	//Stack management axioms
	//Push an element Quadruple in the top of the stack
	public void push(Quadruple quad) { addFirst(quad); }

	//Return the element in the top of the stack and delete it from the stack
	public Quadruple pop() { return removeFirst(); }

	public void swap() {

		Quadruple q1 = pop();
		Quadruple q2 = pop();

		push(q1);
		push(q2);

	}
	

	public void decl(String id, Object val, EObjectNature obj, EType sorte) {
		push(new Quadruple(id, val, obj, sorte));
	}

	public void declVar(String id, Object val, EType type) {
		decl(id, val, EObjectNature.VAR, type);
	}

	public void declCst(String id, Object val, EType type) {

		if (val != null) decl(id, val, EObjectNature.CST, type);
		else decl(id, null, EObjectNature.VCST, type);

	}
	
	public EObjectNature val(String id) {
		if (this.size()==0) {
			return null;
		}
		else {
			Quadruple tempo = pop();
			if(id.equals(tempo.getId())) {
				return tempo.getObj();
			}
			else {
				return val(id);
			}
		}
	}


	public void declTab(String id, Object val, EType type) {} //TODO R2

	public void declMeth(String id, Object val, EType type) {
		decl(id, val, EObjectNature.METH, type);
	}

	public void affectVal(String id, Object val){
		Quadruple tmp = this.getFirst();
		String idMem = "null";

		if (tmp == null){ return;}

		while(!idMem.equals(id)){

			idMem=tmp.getId();

			if(idMem.equals(id)){

				if(tmp.getObj().equals(EObjectNature.VCST)){

					tmp.val=val;
					tmp.setObj(EObjectNature.CST);

				}else{

					if(tmp.getObj().equals(EObjectNature.CST)){ return; } //TODO R2 faire la condition ou le type object est tab

				}
			}

			tmp = this.get(this.indexOf(tmp)+1);


		}


	}
}
