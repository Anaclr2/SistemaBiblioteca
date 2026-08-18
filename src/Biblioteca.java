import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " cadastrado com sucesso!");
    }

    public void listarLivro() {
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
            return;
        }

        System.out.println("\n--- ACERVO DA BIBLIOTECA ---");
        for (Livro livro : acervo) {
            System.out.println(livro);
        }
    }

    public Livro buscarPorIsbn(String isbn) {
        for (Livro livro : acervo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarPorIsbn(isbn);
        if (livro != null) {
            if (!livro.isDisponivel()) {
                livro.setDisponivel(true);
                System.out.println("Devolução realizada com sucesso: " + livro.getTitulo());
            } else {
                System.out.println("Este livro já está disponível na biblioteca.");
            }
        } else {
            System.out.println("Livro não encontrado com o ISBN informado.");
        }
    }
}
