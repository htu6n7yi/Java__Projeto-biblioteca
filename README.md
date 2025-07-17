
## 📚 Sistema de Gerenciamento de Biblioteca – Java

Este projeto foi desenvolvido como parte da verificação de aprendizagem da disciplina de **Programação 2**, utilizando a linguagem **Java**. Seu objetivo é simular o funcionamento básico de uma biblioteca, com foco em operações de cadastro, empréstimo e devolução de livros.

---

## 🛠 Funcionalidades

- Cadastro de **livros** e **usuários** (alunos e bibliotecários).
- Controle de **empréstimos** e **devoluções** de livros.
- Validação de regras como:
- Limite de empréstimos por aluno.
- Verificação de disponibilidade de livros.
- Interface via terminal com menus interativos.

---

## 🗂 Estrutura do Projeto

📁 src/

┣ 📄 Main.java → Ponto de entrada do programa

┣ 📄 Biblioteca.java → Lógica principal de cadastro e operações

┣ 📄 Livro.java → Classe que representa os livros

┣ 📄 Usuario.java → Classe base para Aluno e Bibliotecário

┣ 📄 Aluno.java → Extende Usuario com regras específicas

┣ 📄 Bibliotecario.java → Extende Usuario com permissões de cadastro

┣ 📄 ICadastros.java → Interface com operações comuns

┣ 📄 LimiteExcedidoException.java → Exceção personalizada

┣ 📄 LivroNaoEncontradoException.java → Exceção personalizada

yaml
Copiar
Editar

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
Compile os arquivos:

bash
javac src/*.java
Execute o programa:

bash
java -cp src Main
📌 Observações
- O projeto foi desenvolvido com fins educacionais.
- Não há persistência de dados em banco de dados ou arquivos externos (dados são mantidos apenas em tempo de execução).
- A estrutura segue conceitos de orientação a objetos e boas práticas com tratamento de exceções.

👨‍💻 Autor
José Carlos
Projeto acadêmico — Programação 2
