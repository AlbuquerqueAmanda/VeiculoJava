import java.util.Scanner;

public class Veiculo {
    private int capacidadeTanque;
    private int numeroPassageiros;
    private double preco;

    // Construtores
    public Veiculo() {}

    public Veiculo(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    // Getters e Setters
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Entrada de dados comuns
    public void entrada() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a capacidade do tanque: ");
            capacidadeTanque = scanner.nextInt();

            System.out.println("Digite o número de passageiros: ");
            numeroPassageiros = scanner.nextInt();

            System.out.println("Digite o preço: ");
            preco = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro na entrada, tente novamente.");
            scanner.nextLine(); // Consumir o newline para evitar loops infinitos
        }
    }

    // Método para impressão dos dados
    public void imprimir() {
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }
}
