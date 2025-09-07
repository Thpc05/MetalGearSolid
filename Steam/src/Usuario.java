public class Usuario implements Usuarios {
    private int ID_Usuario;
    private String nickname;
    private String Email;
    private String regiao;
    private Carteira carteira; // associação com a classe Carteira

    public Usuario(int ID_Usuario, String nickname, String Email, String regiao) {
        this.ID_Usuario = ID_Usuario;
        this.nickname = nickname;
        this.Email = Email;
        this.regiao = regiao;
        this.carteira = new Carteira(); // cada usuário tem sua carteira ou wallet, whatever
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Usuário: %s | Email: %s | Região: %s | Saldo: %.2f%n",
                nickname, Email, regiao, carteira.getSaldo());
    }

    // getters
    @Override
    public int getID_Usuario() { return ID_Usuario; }
    @Override
    public String getNickname() { return nickname; }
    @Override
    public String getEmail() { return Email; }
    @Override
    public String getRegiao() { return regiao; }
    @Override
    public double getSaldo() { return carteira.getSaldo(); }

    // acesso a carteira (usar no carrinho talvez)
    public Carteira getCarteira() {
        return carteira;
    }
}
