import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
		System.out.println("escriba el numero de cual es el salario que desea conocer, 1:desarrolladorfront o 2: desarrolladorback");
		int respuesta = sc.nextInt();
		String cargo; 
		
	if (respuesta == 1) {
		
		cargo = "desarrolladorfront";
		OperacionEmpleado desarrolladorfront = new DesarrolladorFrontend();
		System.out.println(desarrolladorfront.devolverSalario());
		
	}else if(respuesta == 2){
		cargo = "desarrolladorback";
		OperacionEmpleado desarrolladorback = new DesarrolladorBackend();
		System.out.println(desarrolladorback.devolverSalario());
		
		
	}else {
		System.out.println("ingrese nuevamente el numero");
		
	}
 
	}

}
