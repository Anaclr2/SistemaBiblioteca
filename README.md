# Sistema de Gerenciamento de Biblioteca 📚

Projeto prático desenvolvido em **Java**, criado do zero com o objetivo de consolidar os fundamentos da **Lógica de Programação** e os pilares da **Programação Orientada a Objetos (POO)**.

O projeto faz parte da minha jornada na graduação de **Engenharia de Software**, servindo como base de portfólio para demonstrar a aplicação prática de conceitos de arquitetura de código, encapsulamento e manipulação de coleções em memória.

## 🚀 Funcionalidades

O sistema roda diretamente no terminal/console através de um menu interativo e permite:
* **Cadastrar novos livros** com título, autor e código único (ISBN).
* **Listar o acervo completo** exibindo de forma clara o status atual de cada livro.
* **Realizar empréstimos de livros** validando automaticamente a sua disponibilidade.
* **Efetuar devoluções** alterando o status do livro para disponível novamente instantaneamente.
* **Validação de entrada** impedindo o fechamento inesperado do sistema caso o usuário insira caracteres inválidos no menu principal.

## 🛠️ Tecnologias Utilizadas

* **Java SE (JDK 17 ou superior)**
* **IntelliJ IDEA** (Ambiente de Desenvolvimento)
* **Git & GitHub** (Controle de versão)

## 📐 Conceitos Aplicados (Engenharia de Software)

* **Encapsulamento:** Atributos protegidos por modificadores de acesso `private` e manipulados com segurança via métodos `getters` e `setters`.
* **Abstração e Modelagem:** Separação clara de responsabilidades em classes distintas (`Livro`, `Biblioteca` e `Main`).
* **Estruturas de Dados:** Uso de coleções dinâmicas (`ArrayList` e `List`) para gerenciamento dinâmico de objetos na memória RAM.
* **Manipulação de Fluxo:** Implementação de loops estruturados (`while`) e condicionais (`switch-case` e `if/else`) para navegação no menu.

## 💻 Como Rodar o Projeto

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/Anaclr2/SistemaBiblioteca
   ```
3. Abra o projeto na sua IDE de preferência (como IntelliJ ou Eclipse).
4. Execute o arquivo `Main.java`.