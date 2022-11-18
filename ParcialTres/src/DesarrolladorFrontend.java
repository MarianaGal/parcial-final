
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado { 

	private int aniosExperienciaBootsrap;
	private boolean experienciaCloud;
	private double aumento_variable = 3;
	
//getter and setter
	public int getAniosExperienciaBootsrap() {
		return aniosExperienciaBootsrap;
	}
	public void setAniosExperienciaBootsrap(int aniosExperienciaBootsrap) {
		this.aniosExperienciaBootsrap = aniosExperienciaBootsrap;
	}
	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}
	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	
	
	
	public DesarrolladorFrontend(int aniosExperienciaBootsrap, double aumento_variable) {
		super();
		this.aniosExperienciaBootsrap = aniosExperienciaBootsrap;
		this.aumento_variable = aumento_variable;
	}
	
	
	public DesarrolladorFrontend() {
		super();
	}
	
	
	@Override
	public double devolverSalario() {
	  this.salario_minimo = salario_minimo;
	  this.aumento_variable = aumento_variable;
	  this.descuento_eps = descuento_eps;
	  this.descuento_fp = descuento_fp;
	  double resultado;
	  
	  resultado = (salario_minimo + aumento_variable) * (descuento_eps + descuento_fp/100);
		return resultado;
	}
	

	
}
