package aula15.criptografia;

import java.security.NoSuchAlgorithmException;

public class MainCriptografia {

	public static void main(String[] args) {
		String senhaCriptografada = "";
		try {
			senhaCriptografada = Criptografia.sha1("teste");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Criptografia SHA1 não disponível.");
		}
		System.out.println(senhaCriptografada);
	}

}
