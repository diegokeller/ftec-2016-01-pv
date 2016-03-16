package aula03.threads;

public class Thread2 extends Thread implements Runnable {

	@Override
	public void run() {
		super.run();
		int cont = 0;
		while(true){
			System.out.println("T2 - " + cont);
			cont++;
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
