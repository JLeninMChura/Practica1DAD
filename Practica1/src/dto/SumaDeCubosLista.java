package dto;

public class SumaDeCubosLista extends Thread {
		double r = 0;
		@Override
		public void run() {
			for(int i = 1; i<=10; i++) {
				System.out.println(" "+i+"³ = "+Math.pow(i,3));
				r += Math.pow(i,3);
			}
			System.out.println("\n La suma total de cubos es de: "+r);
		}
	}

