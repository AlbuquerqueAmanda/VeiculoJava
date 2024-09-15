# Projeto Veículo em Java
Este repositório contém meu projeto de Programação Orientada a Objetos (POO) em Java, desenvolvido para a disciplina de Programação Orientada a Objetos.

## Descrição do Projeto
O projeto consiste em uma aplicação que modela diferentes tipos de veículos utilizando os conceitos de POO, com foco em herança, polimorfismo e tratamento de exceções. As classes `Aviao` e `Navio` herdam de uma superclasse `Veiculo` que contém atributos e métodos comuns. Cada classe filha implementa funcionalidades específicas e únicas de cada tipo de veículo.

### Funcionalidades
- **Herança e polimorfismo**: o projeto implementa a superclasse `Veiculo`, que é estendida pelas subclasses `Aviao` e `Navio`.
- **Manipulação de vetores**: instanciamento e manipulação de um vetor que armazena objetos de cada tipo de veículo.
- **Tratamento de exceções**: o programa lida com entradas inválidas do usuário, protegendo contra erros comuns durante a execução.
- **Métodos específicos**: cada subclasse implementa métodos específicos, como:
  - `reajustarPreco()` para ajustar o preço de um avião.
  - `passageirosPorTripulantes()` para calcular a razão entre passageiros e tripulantes de um navio.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:
1. **Veiculo.java**: Superclasse que contém os atributos e métodos comuns às subclasses:
   - `capacidadeTanque` (int)
   - `numeroPassageiros` (int)
   - `preco` (double)
   - `processadorGHz` (double)
   - Métodos construtores, getters, setters e `imprimir()`.

2. **Aviao.java**: Subclasse que herda de `Veiculo`, com os atributos adicionais:
   - `prefixo` (String)
   - `dataRevisao` (String)
   - Método `reajustarPreco()` que reajusta o preço do avião com base em um percentual passado como parâmetro.
  
3. **Navio.java**: Subclasse que herda de `Veiculo`, com os atributos adicionais:
   - `nome` (String)
   - `numeroTripulantes` (int)
   - `dataLancamento` (String)
   - Método `passageirosPorTripulantes()` que calcula a razão entre o número de passageiros e tripulantes.
  
4. **App.java**: Classe de aplicação que:
   - Cria um vetor contendo objetos `Aviao` e `Navio`.
   - Solicita ao usuário as informações para cada veículo.
   - Lida com entradas inválidas utilizando o tratamento de exceções.
   - Exibe os dados de cada veículo através do método `imprimir()`.
  
## Diagrama de Classes
O projeto segue uma hierarquia simples de classes. Veja abaixo o diagrama:
            Veiculo
            /    \
         Aviao   Navio

## Como Executar

### Pré-requisitos
- JDK (Java Development Kit) versão 8 ou superior.
- Um ambiente de desenvolvimento Java como Eclipse, IntelliJ IDEA ou Visual Studio Code.

### Passos para Executar:
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/repositorio-veiculo-java.git
2. Compile os arquivos .java:
   ```bash
   javac Veiculo.java Aviao.java Navio.java AplicacaoVeiculo.java
3. Execute a aplicação:
   ```bash
   java AplicacaoVeiculo

### Exemplos de uso
Ao executar o programa, o usuário será solicitado a inserir informações como prefixo, capacidade do tanque, número de passageiros, e preço do avião ou nome, número de tripulantes, e data de lançamento para o navio. O sistema então imprimirá esses dados formatados e permitirá o reajuste de preços e o cálculo da relação passageiros/tripulantes para os navios.

### Tratamento de exceções 
O programa usa a classe `Scanner` para entrada de dados e implementa tratamento de exceções para evitar entradas inválidas, como strings em vez de números para atributos numéricos.

### Tecnologias Utilizadas
- Java: Linguagem de programação usada para desenvolver a aplicação.
- Paradigma Orientado a Objetos: Modelo de desenvolvimento utilizado.

## Contribuição
Contribuições são sempre bem-vindas! Se você encontrar algum problema ou quiser adicionar novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.
