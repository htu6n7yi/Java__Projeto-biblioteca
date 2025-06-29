//aqui eu criei a classe aluno e extendi da classe usuário para ganhar atributois e métodos, foi adicionada um atributo
//para classe aluno e agora ele tem os atributos da clase pai e os seus atributos próprios

public class Aluno  extends Usuario{
    private  String curso;

    //construtor para aluno
    public Aluno(String nome, String matricula, String curso){

        super(nome, matricula);
        this.curso = curso;

    }
    // foi adicionado ainda o @Override para sobescrever o método exibirDados() da classe pai
    @Override
    public void exibirDados(){
        System.out.println("\nAluno: "+ getNome()+ "\ncurso: "+ curso);
    }
}