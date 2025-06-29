//aqui eu extendi a classe usuário para pegar os atributos da mesma e adicionar ao bibliotecário, foi ainda
//adicionado um atributo para classe bibliotecario
public class Bibliotecario extends Usuario {
    String setor;

    public Bibliotecario(String nome, String matricula, String setor){
        super(nome, matricula);
        this.setor = setor;
    }

    //e aqui mais uma vez @Override sobescrevendo o método exibirDados.
    @Override
    public void exibirDados(){
        System.out.println("\nProfessor "+ getNome()+ "\nsetor: "+ setor);
    }
}

