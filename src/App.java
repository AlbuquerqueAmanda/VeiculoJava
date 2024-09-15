public class App {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[20]; // 10 Aviões + 10 Navios

        // Criando 10 aviões
        for (int i = 0; i < 10; i++) {
            veiculos[i] = new Aviao();
            System.out.println("Inserindo dados para Avião " + (i + 1));
            veiculos[i].entrada(); // Solicita os dados do avião
        }

        // Criando 10 navios
        for (int i = 10; i < 20; i++) {
            veiculos[i] = new Navio();
            System.out.println("Inserindo dados para Navio " + (i - 9));
            veiculos[i].entrada(); // Solicita os dados do navio
        }

        // Imprimindo os dados
        for (Veiculo veiculo : veiculos) {
            veiculo.imprimir();
            System.out.println("-------------");
        }
    }
}
