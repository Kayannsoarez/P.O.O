import java.util.Scanner;

public class Livro {

    String titulo;
    String autor;
    String editora;
    int ano_publication;
    int ISBN;

    public Livro() {

    }

    public Livro(String titulo, String autor, String editora, int ano_publication, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' + ", ano_publication=" + ano_publication +
                ", ISBN=" + ISBN + '}';
    }

    public static void main(String[] args) {

        Livro livro1, livro2;

        livro1 = new Livro();
        livro2 = new Livro("Uma Breve História do Tempo", "Stephen Hawking ", "Intrínseca", 1988, 858057646);

        // Imprimindo valor do Atributo Titulo de Livro1 e Livro2
        System.out.println(livro1.titulo);
        System.out.println(livro2.titulo);

        // Imprimindo Valores dos atributos de Livro2
        System.out.println(livro2.toString());

        Livro livro3;
        livro3 = new Livro();
        livro3 = livro2;

        // Imprimindo Valores dos atributos de Livro2 e Livros3
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());

        // Atribuindo o valor de Livro1 A lIVRO 2.
        // E verificando os atributos de Livro2 e Livros3
        livro2 = livro1;
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());


    }
}
