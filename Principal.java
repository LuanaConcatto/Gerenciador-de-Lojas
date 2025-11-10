import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    List<Loja> lojas = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    private void menu(){
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("|        Menu de Opções        |");
        System.out.println("--------------------------------");
        System.out.println("(1). Criar uma Loja             ");
        System.out.println("(2). Criar um Produto           ");
        System.out.println("(3). Sair                       ");
        System.out.println("--------------------------------");
        System.out.println("Opção: ");
    }
    private void criarLojas(){

        System.out.println("\n---- Cadastro da Loja ----");
        System.out.println("Digite o nome da Loja: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = lerInt();
        System.out.println("Digite o sário base dos funcionários: ");
        double salarioBase = lerDouble();

        System.out.println("\n---- Endereço da Loja ----");
        System.out.println("Digite a rua da Loja: ");
        String rua = sc.nextLine();
        System.out.println("Digite a cidade da loja: ");
        String cidade = sc.nextLine();
        System.out.println("Digite o estado da Loja: ");
        String estado = sc.nextLine();
        System.out.println("Digite o país da Loja: ");
        String pais = sc.nextLine();
        System.out.println("Digite o CEP da Loja: ");
        String cep = sc.nextLine();
        System.out.println("Digite o número da Loja: ");
        String numero = sc.nextLine();
        System.out.println("Digite o complemento da Loja: ");
        String complemento = sc.nextLine();

        Endereco enderecoLoja = new Endereco(rua,cidade,estado,pais,cep,numero,complemento);

        System.out.println("\n---- Data de Inauguração ----");
        System.out.println("Digite o dia da inauguração: ");
        int dia = lerInt();
        System.out.println("Digite o mês de inauguração: ");
        int mes = lerInt();
        System.out.println("Digite o Ano de inauguração: ");
        int ano = lerInt();

        Data DataFundacao = new Data(dia,mes,ano);

        Loja loja = new Loja(nome,quantidadeFuncionarios,enderecoLoja,DataFundacao);
        lojas.add(loja);
        System.out.println(loja);
        System.out.println("Loja criada com sucesso!");

        ExecutarRequisitosFinais();
    }
    private void criarProdutos(){
        System.out.println("\n---- Criar um Produto ----");
        System.out.println("Digite o nome do Produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do Produto: ");
        double preco = lerDouble();

        System.out.println("Digite a data de validade do Produto: ");
        System.out.println("Dia: ");
        int dia = lerInt();
        System.out.println("Mês: ");
        int mes = lerInt();
        System.out.println("Ano: ");
        int ano = lerInt();

        Produto p1 = new Produto(nome,preco, new Data(dia,mes,ano));
        produtos.add(p1);

        System.out.println("Produto criado com sucesso!");
        System.out.println(p1);
        ExecutarRequisitosFinais();

    }
    private void ExecutarRequisitosFinais() {
        if (!lojas.isEmpty() && !produtos.isEmpty()) {
            Data ref = new Data(20, 10, 2023);
            Produto p = produtos.get(produtos.size() - 1);
            boolean vencido = p.estaVencido(ref);
            System.out.println(vencido ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");

            Loja l = lojas.get(lojas.size() - 1);
            System.out.println(l);
        }
    }
    private int lerInt() {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Valor inválido. Tente novamente: ");
            }
        }
    }
    private double lerDouble() {
        while (true) {
            String s = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.print("Valor inválido. Tente novamente: ");
            }
        }
    }
    public static void main(String[] args) {
        Principal app = new Principal();
        int opcao = -1;
        do{
            app.menu();

            if(!app.sc.hasNextInt()){
                app.sc.nextLine();
                System.out.println("Opção inválida");
                continue;
            }
            opcao = app.sc.nextInt();
            app.sc.nextLine();

            switch (opcao){
                case 1: app.criarLojas();
                break;
                case 2: app.criarProdutos();
                break;
                case 3: System.out.println("Saindo...");
                break;
                default: System.out.println("Opção inválida");
            }
        }while(opcao != 3);

    }
}

