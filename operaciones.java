//clase abstracta operaciones con dos atributos de tipo entero y 
//un metodo que va a ser calcular y otro ver resultado.
//clase producto,suma,division

package operaciones;

public abstract class Operaciones {
	
		protected double x;
		protected double y;
		public Operaciones(){}
		public Operaciones(double x,double y){
			this.x=x;
			this.y=y;
		}
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		
		
		public abstract double calcular();
		
		public abstract void ver();
	

}

