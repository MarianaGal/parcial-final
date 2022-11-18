
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado {
	
	//se declaran las variables de la clase objeto
	private String texto;
	private String listaLenguajes;
	private double aumento_variable = 5;
	
// metodos getter and setter

	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(String listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	
// constructor con ambas variables
	public DesarrolladorBackend(String texto, String listaLenguajes) {
		super();
		this.texto = texto;
		this.listaLenguajes = listaLenguajes;
	}
	
//constructor por defecto
   public DesarrolladorBackend() {
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
