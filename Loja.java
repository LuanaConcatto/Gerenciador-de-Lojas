public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data DataFundacao;



    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data DataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.DataFundacao = DataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios,Endereco enderecoLoja, Data DataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.enderecoLoja = enderecoLoja;
        this.DataFundacao = DataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return enderecoLoja;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoLoja = endereco;
    }

    public Data getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Data data) {
        this.DataFundacao = data;
    }

    public String toString() {
        return "  | Loja: " + nome +
                " | Funcionários: " + quantidadeFuncionarios +
                " | Sálario base R$ " + String.format("%.2f", salarioBaseFuncionario) +
                " | Endereço: " + enderecoLoja +
                " | Data de inauguração: " + DataFundacao;
    }
    public double gastosComSalario (){
        if(salarioBaseFuncionario != -1){
            return salarioBaseFuncionario*quantidadeFuncionarios;
        }
        else{
            return -1;
        }
    }
    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios<10){
            return 'P';
        } else if (quantidadeFuncionarios>=10 && quantidadeFuncionarios<=30) {
            return 'M';
        }
        else {
            return 'G';
        }
    }
}

