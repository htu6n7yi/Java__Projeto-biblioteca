//aqui foi criada uma classe abstrata chamada usuário, ela tem 2 atributos, e também tem 2 métodos 'get' e um método para
//exibirDados() quando a classe for extendida

public abstract class Usuario {
    private String nome;
    private String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public abstract void exibirDados();
}
