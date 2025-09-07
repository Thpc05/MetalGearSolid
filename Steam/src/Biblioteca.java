import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Jogo> jogos;

    public Biblioteca() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        if (!jogos.contains(jogo)) {
            jogos.add(jogo);
        }
    }

    public void iniciarJogo(Jogo jogo) {
        if (jogos.contains(jogo)) {
            System.out.println("Iniciando jogo: " + jogo.getNome());
        } else {
            System.out.println("Jogo não encontrado na biblioteca.");
        }
    }

    public void baixarJogo(Jogo jogo) {
        if (jogos.contains(jogo)) {
            System.out.println("Baixando: " + jogo.getNome());
        }
    }

    public void desinstalarJogo(Jogo jogo) {
        if (jogos.contains(jogo)) {
            System.out.println("Desinstalando: " + jogo.getNome());
        }
    }
}
