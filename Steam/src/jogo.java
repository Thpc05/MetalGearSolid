public class Jogo implements Dados_Jogos {
    private int ID_Jogo;
    private int Preco;
    private String Marcador;
    private String Descricao;
    private String Nome;

    public Jogo(int ID_Jogo, String nome, int Preco) {
        this.ID_Jogo = ID_Jogo;
        this.Nome = nome;
        this.Preco = Preco;
    }

    public void setMarcador(String Marcador) {
        this.Marcador = Marcador;
    }

    public void setDescricao(String Descricao) {
        this.Marcador = Descricao;
    }

    public void mudarNome(String nome) {
        this.Nome = nome;
    }

    public void mudarPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getID_Jogo() {
        return ID_Jogo;
    }

    public int getPreco() {
        return Preco;
    }

    public String getMarcador() {
        return Marcador;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getNome() {
        return Nome;
    }

}
