package calculadora;

public class Calculadora {

	public Float somar(Float a, Float b){
		if(a == null){
			a = 0f;
		}
		if(b == null){
			b = 0f;
		}
		return a + b;
	}

	public Float media(Float a, Float b, Float c){
		return (a + b + c) / 3f;
	}
	
	public Float dividir(Float a, Float b){
		return a / b;
	}

	public Float subtrair(Float a, Float b){
		return null;
	}
	
}
