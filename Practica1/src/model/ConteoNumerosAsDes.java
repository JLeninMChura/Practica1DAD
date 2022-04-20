package model;

import dto.ConteoAscendente;
import dto.ConteoDescendente;

public class ConteoNumerosAsDes {
public static void main (String []args) throws Exception {
	Thread tha = new ConteoAscendente();
	 System.out.println("Conteo de números Ascendentes Y Descendentes: ");
	 	tha.start();
	 	Thread.sleep(100);
	 Thread thd = new ConteoDescendente();
	 	thd.start();
	 	Thread.sleep(500);
}
	
}
