
public class Empleado {
	
	// se declaran las variables con su respectivo tipo de dato
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private double salario;
	private char sexo;
	protected double salario_minimo = 980000;
	protected double descuento_eps = 4;
	protected double descuento_fp = 4;
	
	//constructor con todas las variables
	public Empleado(String nombre, String apellido, String direccion, int dni, double salario, char sexo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}

    //constructor con variables nombre, apellido, dirección, dni y salario
	public Empleado(String nombre, String apellido, String direccion, int dni, double salario) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.salario = salario;
	}

	// constructor con las variables dirección, dni, salario y sexo
	public Empleado(String direccion, int dni, double salario, char sexo) {
		
		this.direccion = direccion;
		this.dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}

	//constructor con las variables nombre, apellido, dni, salario y sexo
	public Empleado(String nombre, String apellido, int dni, double salario, char sexo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}
	
	
    // constructor por defecto
	public Empleado() {
		
	}

	
// se crearon los metodos getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
}
