package dto;

public class LeopardoAlans extends Thread{

	@Override
	public void run() {
		int i = 0;
		long km = 0;
		
		while(i<5) {
			try {
				km = (long)(Math.random()*5+1);
				Thread.sleep(km);
				System.out.println("Leopardo Alans corriendo " + km + "km");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("Termina el Leopardo Alans");
	}
}