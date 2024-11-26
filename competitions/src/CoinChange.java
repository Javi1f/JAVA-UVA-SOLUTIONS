
public class CoinChange {

	static class Moneda {

		private int moneda;
		private String nombre_moneda;

		public Moneda(String nombre, int moneda) {
			this.moneda = moneda;
			this.nombre_moneda = nombre;
		}

		public int getMoneda() {
			return moneda;
		}

		public void setMoneda(int moneda) {
			this.moneda = moneda;
		}

		public String getNombre_moneda() {
			return nombre_moneda;
		}

		public void setNombre_moneda(String nombre_moneda) {
			this.nombre_moneda = nombre_moneda;
		}
	}

}
