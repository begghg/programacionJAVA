package operaciones;
//autor: by bhg
import java.util.Scanner;

public class AppMain {
	static Scanner sc = new Scanner(System.in);
	public static double pedirNumero(){
		double num;
		System.out.print("Introduce numero: ");
		num = sc.nextDouble();
		return num;
		
	}

	public static void main(String[] args) {
			
		Operaciones op = new Suma();
				
		//doy valor a los atributos x,y 
		op.setX(pedirNumero());
		op.setY( pedirNumero());
		
		//getX, getY recupero el valor del atributo
		
		Suma c= new Suma(op.getX(),op.getY());
		 c.ver();
		
		Operaciones f= new Producto(op.getX(),op.getY());
		f.ver();
	
		if(op.getY()!=0){
			Operaciones f1= new Division(op.getX(),op.getY());
			f1.ver();
		}
		else
			System.out.println("No se puede dividir entre cero");

	}

}
