package Libros;

public class Libro {
	private long ISBN;
	private String Título;
	private String Autor;
	private int Año;
	private int NumPaginas;
	private boolean prestado;

	//constructor vacio//
			public Libro () {
				this.ISBN=0;
				this.Título="";
				this.Autor="";
				this.Año=0;
				this.NumPaginas=1;
				this.prestado=false;
				
			}		
		//constructor con parametros//
				
			public Libro(int ISBN,String Título, String Autor, int Año, int NumPaginas) {
				if (NumPaginas>0 && ISBN>0) {
				this.ISBN=ISBN;
				this.Título=Título;
				this.Autor=Autor;
				this.Año=Año;
				this.NumPaginas=NumPaginas;
				this.prestado=false;
				}
					
			}

			public long getISBN() {
				return this.ISBN;
			}

			public void setISBN(long ISBN) {
				if(ISBN<999999999999 && ISBN>1000000000000) {
					this.ISBN=ISBN;
				}
				
			}

			public String getTítulo() {
				return this.Título;
			}

			public void setTítulo(String título) {
				this.Título = título;
			}

			public String getAutor() {
				return this.Autor;
			}

			public void setAutor(String autor) {
				this.Autor = autor;
			}

			public int getAño() {
				return this.Año;
			}

			public void setAño(int año) {
				this.Año = año;
			}

			public int getNumPaginas() {
				return this.NumPaginas;
			}

			public void setNumPaginas(int numPaginas) {
				this.NumPaginas = numPaginas;
			}

			public boolean isPrestado() {
				return this.prestado;
			}

			public void setPrestado(boolean prestado) {
				this.prestado = prestado;
			}
			
			
		//metodos especificos//
			public boolean Prestado() {
				boolean correcto=true;
				if (this.prestado) {
					correcto=false;
				}else {
					this.prestado=true;
				}
				return correcto;
			}
			public boolean Devolver() {
				boolean correcto=true;
				if(this.prestado) {
					correcto=false;
				}else {
					this.prestado=false;
				}
				return correcto;
			}
			public boolean comparar(Libro librocomp) {
				return this.NumPaginas>librocomp.getNumPaginas();
			}
}
