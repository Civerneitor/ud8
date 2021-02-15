
public class Electrodomestico {
	final protected static double DEF_PRECIO = 100;
	final protected static String DEF_COLOR = "blanco";
	final protected static char DEF_CLASE = 'F';
	final protected static int DEF_PESO = 5;
	
	protected double precio;
	protected String color;
	protected char clase;
	protected int peso;
	
	
	public Electrodomestico() {
		super();
		this.precio = DEF_PRECIO;
		this.color = DEF_COLOR;
		this.clase = DEF_CLASE;
		this.peso = DEF_PESO;
	}

	public Electrodomestico(double precio, String color, char clase, int peso) {
		super();
		this.precio = precio;
		this.color = comprobarColor(color);
		this.clase = comprobarConsumoEnergetico(clase);
		this.peso = peso;
	
	}

	public Electrodomestico(double precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.color = DEF_COLOR;
		this.clase = DEF_CLASE;
	}
	private char comprobarConsumoEnergetico(char clase) {
		// Comprueba si el carácter de la clase es válido, en caso contrario devuelve el valor por defecto.
		if(clase != 'A' && clase != 'B' && clase != 'C' && clase != 'D' && clase != 'E' && clase != 'F' ) clase = DEF_CLASE;
		return clase;
	}

	private String comprobarColor(String color) {
		// Comprueba si el color es válido, en caso contrario devuelve el valor por defecto.
		if(!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) color= DEF_COLOR; 
        return color;
	}
}
