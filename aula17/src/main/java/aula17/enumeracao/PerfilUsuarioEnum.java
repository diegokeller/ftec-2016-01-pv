package aula17.enumeracao;

public enum PerfilUsuarioEnum {
	Administrador(1), Cliente(2);
	
	private Integer codigo;

	private PerfilUsuarioEnum(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	
}
