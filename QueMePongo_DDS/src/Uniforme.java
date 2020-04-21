import java.util.Objects;

public class Uniforme {
	String nombreColegio;
	Prenda prendaInferior;
	Prenda prendaSuperior;
	Prenda calzado;
	
	Uniforme(Prenda prendaInferior,Prenda prendaSuperior,Prenda calzado){
		this.prendaInferior = Objects.requireNonNull(prendaInferior,"La prenda inferior es obligatoria");
		this.prendaSuperior = Objects.requireNonNull(prendaSuperior,"La prenda superior es obligatoria");
		this.calzado = Objects.requireNonNull(calzado,"El calzado es obligatorio");
		if(prendaInferior.tipo.categoria() != Categoria.PARTE_INFERIOR) {
			UniformeInvalidaException("La prenda inferior ingresada no es una prenda inferior valida");
		}
		if(prendaSuperior.tipo.categoria() != Categoria.PARTE_SUPERIOR) {
			UniformeInvalidaException("La prenda superior ingresada no es una prenda superior valida");
		}
		if(calzado.tipo.categoria() != Categoria.CALZADO) {
			UniformeInvalidaException("El calzado ingresado no es un calzado valido");
		}
	}
	
	public UniformeInvalidaException extends RuntimeException {
		  public UniformeInvalidaException(String causa){
		    super("La prenda es invalida porque: " + causa)
		  }
		}
	
	public void darSugerencia() {
		this.prendaInferior = new Prenda(PANTALON);
		this.prendaInferior.ingresarDatosMaterial(Material.NYLON, /*...*/);
	}
}
