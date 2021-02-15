package models;

public class Serie {
	private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    //CONSTANTES
    final private static int DEF_NTEMPORADAS = 3;
    final private static boolean DEF_ENTREGADO = false;
    
    
    /**
     * Generamos constructor por defecto
     */
    public Serie() {
    	this.temporadas = DEF_NTEMPORADAS;
    	this.entregado = DEF_ENTREGADO;
    }

    /**
     * Hacemos el constructor de los dos parametros titulo y creador
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.temporadas = DEF_NTEMPORADAS;
    	this.entregado = DEF_ENTREGADO;
    }

    /**
     * @param titulo
     * @param temporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int NumTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas=NumTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = DEF_ENTREGADO;
    }
}
