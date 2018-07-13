package exemplo_004_ClasseInterna;

import exemplo_004_ClasseInterna.ClasseExterna.ClasseInterna;

/**
 * 
 * @author Diego Munhoz
 */
public class TestaClasseInterna {
	
	public static void main(String[] args) {
		ClasseExterna externa = new ClasseExterna();
		externa.somar(2.5, 3.5);
		externa.exibirResultado();
		ClasseInterna interna = externa.new ClasseInterna();
		interna.somar(35.16, 0);
		interna.exibirResultado();
		
	}

}