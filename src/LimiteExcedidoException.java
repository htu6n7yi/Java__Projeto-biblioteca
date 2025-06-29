//exceção criada para disparar caso o limite de livros emprestados seja excedido
public class LimiteExcedidoException extends Exception{
    public LimiteExcedidoException(String message){
        super(message);
    }
}
