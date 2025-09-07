public interface Usuarios {
    int getID_Usuario();
    String getNickname();
    String getEmail();
    String getRegiao();
    void exibirDetalhes();
    Carteira getCarteira();
}
