import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Variáveis globais para uso em todo o programa
    private static Biblioteca biblioteca = new Biblioteca();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicialização dos dados
        inicializarDados();
        
        // Menu principal
        boolean executando = true;
        while (executando) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1: 
                    gerenciarLivros();
                    break;
                case 2: 
                    gerenciarUsuarios();
                    break;
                case 3: 
                    realizarEmprestimoDevolucao();
                    break;
                case 4: 
                    executando = false;
                    System.out.println("\nSaindo do sistema. Obrigado!");
                    break;
                default: 
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }
        
        // Fechar o scanner no final da execução
        scanner.close();
    }
    
    // Método para inicializar dados do sistema
    private static void inicializarDados() {
        // Cadastrar alguns livros iniciais
        biblioteca.cadastrar();
        biblioteca.cadastrar(); // Cadastra um segundo livro igual (apenas para exemplo)
        
        // Cadastrar usuários
        alunos.add(new Aluno("Carlos", "1243124", "Sistemas de Informação"));
        alunos.add(new Aluno("Maria", "987654", "Engenharia de Software"));
        
        bibliotecarios.add(new Bibliotecario("Cleyton", "123123", "Programação"));
        bibliotecarios.add(new Bibliotecario("Ana", "456789", "Literatura"));
        
        System.out.println("Sistema inicializado com sucesso!");
    }
    
    // Exibição do menu principal
    private static void exibirMenuPrincipal() {
        System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
        System.out.println("1 - Gerenciar Livros");
        System.out.println("2 - Gerenciar Usuários");
        System.out.println("3 - Empréstimos e Devoluções");
        System.out.println("4 - Sair do Sistema");
        System.out.print("Digite a opção desejada: ");
    }
    
    // Leitura de opções numéricas do usuário
    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Retorna opção inválida em caso de erro
        }
    }
    
    // Método para gerenciar operações com livros
    private static void gerenciarLivros() {
        boolean menuLivros = true;
        
        while (menuLivros) {
            System.out.println("\n===== GERENCIAMENTO DE LIVROS =====");
            System.out.println("1 - Cadastrar novo livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Excluir livro");
            System.out.println("4 - Voltar ao menu principal");
            System.out.print("Digite a opção desejada: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    biblioteca.cadastrar();
                    break;
                case 2:
                    System.out.println("\n--- Lista de Livros ---");
                    biblioteca.listar();
                    break;
                case 3:
                    biblioteca.excluir();
                    break;
                case 4:
                    menuLivros = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    
    // Método para gerenciar operações com usuários
    private static void gerenciarUsuarios() {
        boolean menuUsuarios = true;
        
        while (menuUsuarios) {
            System.out.println("\n===== GERENCIAMENTO DE USUÁRIOS =====");
            System.out.println("1 - Listar alunos");
            System.out.println("2 - Listar bibliotecários");
            System.out.println("3 - Cadastrar novo aluno");
            System.out.println("4 - Cadastrar novo bibliotecário");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("Digite a opção desejada: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Lista de Alunos ---");
                    for (Aluno aluno : alunos) {
                        aluno.exibirDados();
                    }
                    break;
                case 2:
                    System.out.println("\n--- Lista de Bibliotecários ---");
                    for (Bibliotecario bibliotecario : bibliotecarios) {
                        bibliotecario.exibirDados();
                    }
                    break;
                case 3:
                    cadastrarNovoAluno();
                    break;
                case 4:
                    cadastrarNovoBibliotecario();
                    break;
                case 5:
                    menuUsuarios = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    
    // Método para cadastrar novo aluno
    private static void cadastrarNovoAluno() {
        System.out.println("\n--- Cadastro de Novo Aluno ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        
        Aluno novoAluno = new Aluno(nome, matricula, curso);
        alunos.add(novoAluno);
        
        System.out.println("Aluno cadastrado com sucesso!");
        novoAluno.exibirDados();
    }
    
    // Método para cadastrar novo bibliotecário
    private static void cadastrarNovoBibliotecario() {
        System.out.println("\n--- Cadastro de Novo Bibliotecário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Setor: ");
        String setor = scanner.nextLine();
        
        Bibliotecario novoBibliotecario = new Bibliotecario(nome, matricula, setor);
        bibliotecarios.add(novoBibliotecario);
        
        System.out.println("Bibliotecário cadastrado com sucesso!");
        novoBibliotecario.exibirDados();
    }
    
    // Método para gerenciar empréstimos e devoluções
    private static void realizarEmprestimoDevolucao() {
        boolean menuEmprestimos = true;
        
        while (menuEmprestimos) {
            System.out.println("\n===== EMPRÉSTIMOS E DEVOLUÇÕES =====");
            System.out.println("1 - Emprestar livro");
            System.out.println("2 - Devolver livro (não implementado)");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("Digite a opção desejada: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    realizarEmprestimo();
                    break;
                case 2:
                    System.out.println("\nFuncionalidade de devolução não implementada.");
                    break;
                case 3:
                    menuEmprestimos = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    
    // Método para realizar empréstimo de livro
    private static void realizarEmprestimo() {
        System.out.println("\n--- Empréstimo de Livro ---");
        System.out.print("Digite o título do livro a ser emprestado: ");
        String titulo = scanner.nextLine();
        
        try {
            biblioteca.emprestarLivro(titulo);
        } catch (LivroNaoEncontradoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}