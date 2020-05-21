
public class Uniforme {
	Prenda prendaInferior;
	Prenda prendaSuperior;
	Prenda calzado;
	
	Uniforme(ClimaService servicioClimatico, Prenda prendaInferior,Prenda prendaSuperior,Prenda calzado){
		this.calzado = calzado;
		this.prendaInferior = prendaInferior;
		this.prendaSuperior = prendaSuperior;
		
		void recibirSugerencia(){
			int climaActual = servicioClimatico.obtenerTemperatura();
			
		}
	}
}
