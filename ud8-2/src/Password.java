import java.util.Random;

public class Password {
	
	final private static int DEF_LONGITUD = 8;
	
	private int longitud;
	private String contra;
	public Password() {
		super();
		this.longitud = DEF_LONGITUD;
		String res = "";
		for(int i =0;i<longitud;i++) {
			int a= new Random().nextInt(93);//caracteres ascii para contraseñas
			char b = (char)a;
			b+=33;//quitamos los 33 primeros caracteres que no nos sirven para contraseñas
			System.out.println(b);
			res+=b;
		}
		
		this.contra = res;
	}
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		String res = "";
		for(int i =0;i<longitud;i++) {
			int a= new Random().nextInt(93);
			char b = (char)a;
			b+=33;
			System.out.println(b);
			res+=b;
		}
		this.contra = res;
	}
	
	public static void main(String[] args) {
		Password a = new Password(27);
	}
}
