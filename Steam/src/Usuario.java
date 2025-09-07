public class Usuario implements Usuarios {
    private int ID_Usuario;
    private String nickname;
    private String mail;
    private String regiao;
    private Carteira carteira; // associação com a classe Carteira

    public Usuario(int ID_Usuario, String nickname, String mail, String regiao) {
        this.ID_Usuario = ID_Usuario;
        this.nickname = nickname;
        this.mail = mail;
        this.regiao = regiao;
        this.carteira = new Carteira(); // cada usuário tem sua carteira ou wallet, whatever
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Usuário: %s | Email: %s | Região: %s | Saldo: %.2f%n",
                nickname, mail, regiao, carteira.getSaldo());
    }

    @Override
    public void adicionarSaldo(double valor) {
        carteira.adicionarSaldo(valor);
    }

    // getters
    @Override
    public int getID_Usuario() { return ID_Usuario; }
    @Override
    public String getNickname() { return nickname; }
    @Override
    public String getMail() { return mail; }
    @Override
    public String getRegiao() { return regiao; }
    @Override
    public double getSaldo() { return carteira.getSaldo(); }

    // acesso a carteira (usar no carrinho talvez)
    public Carteira getCarteira() {
        return carteira;
    }
}
