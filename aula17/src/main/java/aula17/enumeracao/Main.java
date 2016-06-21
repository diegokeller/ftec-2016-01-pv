package aula17.enumeracao;

public class Main {

	public static void main(String[] args) {
		Usuario joao = new Usuario();
		joao.setPerfil(PerfilUsuarioEnum.Administrador);
		joao.setPerfil(PerfilUsuarioEnum.Cliente);
		
		// Converter para String
		System.out.println(joao.getPerfil().toString());
		
		// Converter de String
		joao.setPerfil(PerfilUsuarioEnum.valueOf("Administrador"));
		System.out.println(joao.getPerfil().toString());
		
		PerfilUsuarioEnum[] valores = PerfilUsuarioEnum.values();
		for (PerfilUsuarioEnum valor : valores) {
			System.out.println(valor.getCodigo());
			System.out.println(valor.toString());
		}
	}

}
