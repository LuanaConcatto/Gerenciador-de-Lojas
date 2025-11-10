public class Produto {
    private String nome;
    private double preco;
    private Data DataValidade;

    public Produto(String nome, double preco, Data DataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.DataValidade = DataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.DataValidade = dataDeValidade;
    }

    public String toString() {
        return "  | Produto: " + nome +
                " | Preço R$ " + String.format("%.2f", preco) +
                " | Data de validade: " + DataValidade;
    }
    public boolean estaVencido(Data dataAtual) {
        return DataValidade.compareTo(dataAtual) < 0;
    }
}

