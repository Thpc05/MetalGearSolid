public class App {
    public static void main(String[] args) {
        // Criar usuário
        Usuario usuario = new Usuario(1, "Player1", "player1@email.com", "Brasil");
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar saldo na carteira do usuário
        usuario.getCarteira().adicionarSaldo(100.0);

        // Criar alguns jogos
        Jogo jogo1 = new Jogo(101, "The Witcher 3", 59);
        jogo1.setDescricao("RPG de mundo aberto com história rica.");
        jogo1.setMarcadores(new String[]{"RPG", "Aventura", "Mundo Aberto"});

        Jogo jogo2 = new Jogo(102, "Minecraft", 29);
        jogo2.setDescricao("Jogo de construção e sobrevivência.");
        jogo2.setMarcadores(new String[]{"Sandbox", "Sobrevivência", "Criatividade"});

        // Criar carrinho e adicionar jogos
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(jogo1);
        carrinho.adicionarItem(jogo2);

        // Exibir detalhes do usuário
        usuario.exibirDetalhes();

        // Mostrar itens do carrinho
        carrinho.listarItens();

        // Finalizar compra
        carrinho.comprar(usuario, biblioteca);

        // Mostrar saldo após a compra
        usuario.exibirDetalhes();

        // Iniciar O The Qitcher 3
        biblioteca.iniciarJogo(jogo1);

        // Iniciar Mine
        biblioteca.iniciarJogo(jogo2);
    }
}
