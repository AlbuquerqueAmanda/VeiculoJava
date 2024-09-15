import java.util.Scanner;

public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;

    // Construtores
    public Aviao() {
        super();
    }

    public Aviao(String prefixo, String dataRevisao, int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    // Getters e Setters
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    // Sobrescrita do método imprimir
    @Override
    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Data de Revisão: " + dataRevisao);
        super.imprimir();
    }

    // Entrada de dados
    @Override
    public void entrada() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o prefixo do avião: ");
            prefixo = scanner.nextLine();

            System.out.println("Digite a data de revisão: ");
            dataRevisao = scanner.nextLine();

            super.entrada(); // Chama os atributos comuns da superclasse

        } catch (Exception e) {
            System.out.println("Erro na entrada, tente novamente.");
        }
    }
}
