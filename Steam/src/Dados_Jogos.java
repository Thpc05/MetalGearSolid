public interface Dados_Jogos {

    default void exibirDetalhes() {
        System.out.printf("Jogo: %s | Id: %d | Preço: %d%n",
                getNome(), getID_Jogo(), getPreco());
    }

    String getNome();

    int getID_Jogo();

    int getPreco();

    String[] getMarcadores();

    String getDescricao();
}
