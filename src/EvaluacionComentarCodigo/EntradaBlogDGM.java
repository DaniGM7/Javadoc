package EvaluacionComentarCodigo;

/**
 * Clase para manejar las entradas de un blog.
 * @since 27/2/2022
 * @author Daniel García Martínez
 * @version 2.3
 */
public class EntradaBlogDGM {
	/**
	 * separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor
	 */
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase. recibe el número de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el número de entrada
	 * es negativo, lanza una excepción.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogDGM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id>0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Método que devuelve el número de la entrada
	 * @return número de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * Método que devuelve el texto completo de la entrada
	 * @return texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * Método que devuelve el nombre del autor de la entrada en mayúsculas
	 * @return nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * Método que devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * 	Método main
	 * @param args No tiene porqué tener argumentos. 
	 */
	public static void main(String[] args) {
		EntradaBlogDGM e1=new EntradaBlogDGM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}

