import java.util.ArrayList;

//aqui eu criei a classe biblioteca e implementei a interface ICadastros
// para que ela possa ser usada em outras classes, usei @Override para sobescrever os métodos da interface.
public class Biblioteca implements ICadastros{
    private ArrayList<Livro> livros = new ArrayList<>();

    @Override
    public void cadastrar(){
        livros.add(new Livro("Java básico", "autor Fulano"));
        System.out.println("Livro cadastrado");
    }

    @Override
    public void excluir(){
    if (!livros.isEmpty()){
        livros.remove(0);
        System.out.println("Livro removido");
    } else {
        System.out.println("Nenhum livro para remover");
    }
    }

    @Override
    public void listar(){
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Emprestado: " + livro.isDisponivel());
        }
    }

    //e criei uma exceção caso eu tente emprestar um livro e não encontre o mesmo
    public void emprestarLivro(String titulo) throws LivroNaoEncontradoException{
        boolean encontrado = false;

        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                if(!livro.isDisponivel()) {
                    System.out.println("Livro já está emprestado!");
                    return;
                }
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso!");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            throw new LivroNaoEncontradoException("Livro '" + titulo + "' não encontrado");
        }
    }

    }
