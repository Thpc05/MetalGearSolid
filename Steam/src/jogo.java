public class jogo implements Dados_Jogos {
    private int ID_jogo;
    private double  Preco;
    private Marcador[] Marcadores = new Marcador[10]; // arreglo de 10 elementos
    private String Descricao;
    private String Nome;

    public jogo(int ID_jogo, String nome, int Preco) {
        this.ID_jogo = ID_jogo;
        this.Nome = nome;
        this.Preco = Preco;
    }

    public void setMarcador(String Marcador) {
        this.Marcador = Marcador;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void mudarNome(String Nome) {
        this.Nome = Nome;
    }

    public void mudarPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getID_Jogo() {
        return ID_jogo;
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
