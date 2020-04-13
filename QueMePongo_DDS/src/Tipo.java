 

public enum Tipo {
	ZAPATOS{
		public Categoria verCategoria() {
			return Categoria.CALZADO;
		}
	},
	PANTALON{
		public Categoria verCategoria() {
			return Categoria.PARTE_INFERIOR;
		}
	},
	REMERA_CORTA{
		public Categoria verCategoria() {
			return Categoria.PARTE_SUPERIOR;
		}
	},
	REMERA_LARGA{
		public Categoria verCategoria() {
			return Categoria.PARTE_SUPERIOR;
		}
	},
	SHORT{
		public Categoria verCategoria() {
			return Categoria.PARTE_INFERIOR;
		}
	},
	CAMPERA{
		public Categoria verCategoria() {
			return Categoria.PARTE_SUPERIOR;
		}
	},
	ANTEOJOS{
		public Categoria verCategoria() {
			return Categoria.ACCESORIO;
		}
	},
	RELOJ{
		public Categoria verCategoria() {
			return Categoria.ACCESORIO;
		}
	};

}
