//aqui foi criada uma classe pubçica chamada livro para gerenciar nome do livro, autor, etc. métodos para
//emprestar e devolver o livro.
public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public  void emprestar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }
}
