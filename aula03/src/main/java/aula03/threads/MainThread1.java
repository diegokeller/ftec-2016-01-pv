package aula03.threads;

public class MainThread1 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
			
				int cont = 0;
				while(true){
					System.out.println("T1 - " + cont);
					cont++;
					// Espera 1 segundo
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
