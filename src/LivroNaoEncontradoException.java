//exceção criada para disparar caso o limite de livros emprestados seja excedido
public class LivroNaoEncontradoException extends Exception{
    public LivroNaoEncontradoException(String message){
        super(message);
    }
}
