package aula15.singleton;

public class MainSingleton {
	
	public static void main(String[] args) {
		//CarrinhoDeCompras c = new CarrinhoDeCompras(); // Não funciona, construtor privado
		CarrinhoDeCompras.getInstancia();
	}
}
