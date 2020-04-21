import java.util.*;

public class Prenda {
	Tipo tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;	
	
	/*public void validarPrenda() {
		//todos los campos deben estar completos
		if (tipo == null || categoria == null || material == null || colorPrimario == null) {
			throw new Error("Hay campos sin completar"); 
		}
		//el color primario no puede ser nocolor
		if(colorPrimario == Color.NOCOLOR) {
			throw new Error("El color principal es invalido");
		}
		//el color primario debe ser distinto al secndario
		if(colorPrimario == colorSecundario) {
			throw new Error("El color secundario debe ser distinto al primario");
		}
		//el tipo de prenda debe ser de la categoria de la prenda
		if(tipo.verCategoria() != categoria) {
			throw new Error("El tipo de prenda no corresponde con su categoria");
		}
	}
	*/
	
	Prenda (Tipo tipo){
		this.tipo = Objects.requireNonNull(tipo,"el tipo es obligatorio");
	}
	
	public void ingresarDatosMaterial(Material material,Color colorPrimario,Color colorSecundario,Trama trama) {
		this.material = Objects.requireNonNull(material,"el material es obligatorio");
		this.colorPrimario = Objects.requireNonNull(colorPrimario,"el color primario es obligatorio");
		this.colorSecundario = colorSecundario;
		this.trama = Objects.requireNonNull(trama,"la trama es obligatorio");
		if(colorPrimario == colorSecundario) {
			throw new Error("El color secundario debe ser distinto al primario");
		}
	}
	
	public PrendaInvalidaException extends Exception{
		public PrendaInvalidaException(String causa) {
			super("La prenda es invalida porque: " + causa)
		}
		
	}
	
	
	

}
