import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Jogo> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Jogo jogo) {
        itens.add(jogo);
    }

    public void removerItem(Jogo jogo) {
        itens.remove(jogo);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Jogo::getPreco).sum();
    }

    //ainda precisa da biblioteca ww
    public boolean comprar(Usuario usuario, Biblioteca biblioteca) {
        double total = calcularTotal();

        // tenta debitar da carteira do usuario
        if (usuario.getCarteira().debitar(total)) {
            for (Jogo jogo : itens) {
                biblioteca.adicionarJogo(jogo);
            }
            itens.clear(); // limpa carrinho depois da compra
            return true;
        }
        return false; // saldo insuficiente
    }

    // achei que seria uma boa ter
    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Jogo jogo : itens) {
                System.out.printf("- %s (R$ %d)%n", jogo.getNome(), jogo.getPreco());
            }
        }
    }
}
