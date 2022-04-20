package dto;

public class ConteoDescendente extends Thread{
	@Override
	public void run() {
		for (int j = 10; j>0; j--) {
			System.out.print(" "+j+" ");
		}
		System.out.println();
	}
}
				