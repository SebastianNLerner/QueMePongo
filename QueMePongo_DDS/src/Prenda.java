
public class Prenda {
	Tipo tipo;
	Categoria categoria;
	Material material;
	Color colorPrimario;
	
public void validarPrenda() {
		if (tipo == null || categoria == null || material == null || colorPrimario == null) {
			throw new Error("Hay campos sin completar"); 
		}
		if(tipo.verCategoria() != categoria) {
			throw new Error("El tipo de prenda no corresponde con su categoria");
		}
	}

}
