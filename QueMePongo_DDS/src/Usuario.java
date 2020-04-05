import java.util.List;

public  class Usuario {
List<Prenda> prendas;
	
	void cargarPrenda(Prenda prenda) {
		prenda.validarPrenda();
		prendas.add(prenda);
	}
}
