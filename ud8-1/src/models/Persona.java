/**
 * 
 */
package models;

/**
 * @author Civerneitor
 *
 */
public class Persona {

	final private static String DEF_NOMBRE = "";
	final private static int DEF_EDAD = 0;
	final private static char DEF_SEXO = 'H';
	final private static double DEF_PESO = 0;
	final private static double DEF_ALTURA = 0;
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	
	
	public Persona() {
		super();
		this.nombre = DEF_NOMBRE;
		this.edad = DEF_EDAD;
		this.sexo = DEF_SEXO;
		this.peso = DEF_PESO;
		this.altura = DEF_ALTURA;
	}



	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = DEF_PESO;
		this.altura = DEF_ALTURA;
	}



	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
}
