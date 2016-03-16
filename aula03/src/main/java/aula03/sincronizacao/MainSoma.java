package aula03.sincronizacao;

public class MainSoma {

	public static void main(String[] args) {

		ThreadSomar t1 = new ThreadSomar(0d, 50000d);
		ThreadSomar t2 = new ThreadSomar(50001d, 100000d);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.getSoma());
		System.out.println(t2.getSoma());
		
	}

}
