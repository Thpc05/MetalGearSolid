public class Jogo implements Dados_Jogos {
    private int idJogo;
    private int preco;
    private String[] marcadores; // gêneros ou tags
    private String descricao;
    private String nome;

    public Jogo(int idJogo, String nome, int preco) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.preco = preco;
        this.marcadores = new String[0]; // inicia vazio
    }

    // ---- Setters ----
    public void setMarcadores(String[] marcadores) {
        this.marcadores = marcadores;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void mudarPreco(int preco) {
        this.preco = preco;
    }

    // ---- Getters ----
    @Override
    public int getID_Jogo() {
        return idJogo;
    }

    @Override
    public int getPreco() {
        return preco;
    }

    @Override
    public String[] getMarcadores() {
        return marcadores;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
