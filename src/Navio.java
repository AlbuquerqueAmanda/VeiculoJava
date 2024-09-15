import java.util.Scanner;

public class Navio extends Veiculo {
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    // Construtores
    public Navio() {
        super();
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento, int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Sobrescrita do método imprimir
    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de Tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lançamento: " + dataLancamento);
        super.imprimir();
    }

    // Método específico
    public double passageirosPorTripulantes() {
        return (double) getNumeroPassageiros() / numeroTripulantes;
    }

    // Entrada de dados
    @Override
    public void entrada() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do navio: ");
            nome = scanner.nextLine();

            System.out.println("Digite o número de tripulantes: ");
            numeroTripulantes = scanner.nextInt();

            System.out.println("Digite a data de lançamento: ");
            scanner.nextLine(); // Consome o newline
            dataLancamento = scanner.nextLine();

            super.entrada(); // Chama os atributos comuns da superclasse

        } catch (Exception e) {
            System.out.println("Erro na entrada, tente novamente.");
        }
    }
}
