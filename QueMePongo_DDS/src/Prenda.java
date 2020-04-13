
public class Prenda {
	Tipo tipo;
	Categoria categoria;
	Material material;
	Color colorPrimario;
	Color colorSecundario = Color.NOCOLOR;
		
	public void validarPrenda() {
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

}
