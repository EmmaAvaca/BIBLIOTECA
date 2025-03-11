package biblioteca.demo.run;

public class Libro {       


      private int isbn; //asociada a clave primaria en la tabla de 08
      private String titulo;
      private String autor;
      private int edicion;
	public int getEdicion() { // el  metodo get devuelve el valor del atributo edicion de la clase libro 
		                      // la ser publico, se puede invocar o llamar desde fuera de la clase
		                      // al definir el metodo tiene que devolver un tipo int por que el atributo edicion esta definido como entero
		
		return edicion;  // la sentencia return me devuelve el rsultado de la llamada al metodo
	}
	public void setEdicion(int edicion) { // al poner tipo void no me hace falta poner la sentencia return
		
		this.edicion = edicion;   //asigna al atributo edicion, e valor que le paso como argumento en la llamada al metodo
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {  //devuelve el valor del atributo autor de la clase libro
		return autor;
	}
	public void setAutor(String autor) { //
		this.autor = autor;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	} 
}
