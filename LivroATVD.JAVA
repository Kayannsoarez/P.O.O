import java.util.Scanner;

public class Livro {
	
	String titulo; 
	String autor;
	String editor;
	int ano_publication;
	int ISBN;
	

	public Livro(){
		
	}
	
	public Livro(String titulo, String autor, String editor,
			int ano_publication, int ISBN){
		
		this.titulo = titulo;
		this.autor = autor;
		this.editor = editor;
		this.ano_publication = ano_publication;
		this.ISBN = ISBN;
		
	}



	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}



	public int getAno_publication() {
		return ano_publication;
	}
	public void setAno_publication(int ano_publication) {
		this.ano_publication = ano_publication;
	}



	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	@Override
	public String toString() {
		
		return getAutor()+getAno_publication();
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Livro livro1, livro2, livro3;
		
		livro1 = new Livro();
		livro2 = new Livro("SIM", "SIM","SIM", 1998, 3141592);
		livro3 = new Livro();
		
		String aut = ler.next();
		livro3.setAutor(aut);
		
		
		System.out.println(livro1.getTitulo());
		System.out.println(livro2.getTitulo());
		System.out.println(livro3.getAutor());
		System.out.println(livro2.toString());
		
		
		
	}
	

}
