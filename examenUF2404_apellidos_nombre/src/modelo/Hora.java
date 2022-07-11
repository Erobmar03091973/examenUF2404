package modelo;

public class Hora {

	      private int horas;
	      private int minutos;
	      private int segundos;
	      
	      
		  public Hora() {
			super();
			this.horas=00;
			this.minutos=00 ;
			this.segundos=00;
			
								
		}


		public Hora(int horas, int minutos, int segundos) {
			super();
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		}
		


		public Hora(Hora h) {
			super();
			this.horas = h.horas;
			this.minutos = h.minutos;
			this.segundos = h.segundos;
		}
         
		
		
		public int getHoras() {
			return horas;
		}


		public void setHoras(int horas) {
			this.horas = horas;
		}


		public int getMinutos() {
			return minutos;
		}


		public void setMinutos(int minutos) {
			this.minutos = minutos;
		}


		public int getSegundos() {
			return segundos;
		}


		public void setSegundos(int segundos) {
			this.segundos = segundos;
		}
	      
		@Override
		public String toString() {
			return "Hora [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
		
		     
}
}
