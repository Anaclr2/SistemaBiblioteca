import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;

        System.out.println("Bem-vindo ao sistema de Biblioteca!");

        while (opcao != 6) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Buscar Livro por Título");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ISBN (código único): ");
                    String isbn = scanner.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, isbn);
                    biblioteca.cadastrarLivro(novoLivro);
                    break;

                case 2:
                    biblioteca.listarLivro();
                    break;

                case 3:
                    System.out.print("Digite o ISBN do livro que deseja pegar emprestado: ");
                    String isbnBusca = scanner.nextLine();
                    Livro livroEncontrado = biblioteca.buscarPorIsbn(isbnBusca);

                    if (livroEncontrado != null) {
                        if (livroEncontrado.isDisponivel()) {
                            livroEncontrado.setDisponivel(false);
                            System.out.println("Empréstimo realizado com sucesso: " + livroEncontrado.getTitulo());
                        } else {
                            System.out.println("Desculpe, este livro já está emprestado.");
                        }
                    } else {
                        System.out.println("Livro não encontrado com o ISBN informado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ISBN para devolução: ");
                    String isbnDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDevolucao);
                    break;

                case 5:
                    System.out.print("Digite o título do livro que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroPorTitulo = biblioteca.buscarPorTitulo(tituloBusca);

                    if (livroPorTitulo != null) {
                        System.out.println("Livro encontrado: " + livroPorTitulo);
                    } else {
                        System.out.println("Nenhum livro encontrado com esse título.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
