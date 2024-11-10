public class Automovel {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String combustivel;
    private int potencia;
    private int portas;
    private int lugares;
    private double preco;

    // Métodos getters e setters
    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return this.marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return this.modelo; }

    public void setAno(int ano) { this.ano = ano; }
    public int getAno() { return this.ano; }

    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return this.cor; }

    public void setCombustivel(String combustivel) { this.combustivel = combustivel; }
    public String getCombustivel() { return this.combustivel; }

    public void setPotencia(int potencia) { this.potencia = potencia; }
    public int getPotencia() { return this.potencia; }

    public void setPortas(int portas) { this.portas = portas; }
    public int getPortas() { return this.portas; }

    public void setLugares(int lugares) { this.lugares = lugares; }
    public int getLugares() { return this.lugares; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    // Métodos funcionais
    public void ligarAutomovel() {
        System.out.println("Automóvel ligado.");
    }

    public void desligarAutomovel() {
        System.out.println("Automóvel desligado.");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        // Criando uma instância de Automovel
        Automovel meuAutomovel = new Automovel();

        // Definindo os atributos do automóvel
        meuAutomovel.setMarca("Toyota");
        meuAutomovel.setModelo("Corolla");
        meuAutomovel.setAno(2020);
        meuAutomovel.setCor("Preto");
        meuAutomovel.setCombustivel("Gasolina");
        meuAutomovel.setPotencia(154);
        meuAutomovel.setPortas(4);
        meuAutomovel.setLugares(5);
        meuAutomovel.setPreco(90000.00);

        // Exibindo as informações do automóvel
        System.out.println("Marca: " + meuAutomovel.getMarca());
        System.out.println("Modelo: " + meuAutomovel.getModelo());
        System.out.println("Ano: " + meuAutomovel.getAno());
        System.out.println("Cor: " + meuAutomovel.getCor());
        System.out.println("Combustível: " + meuAutomovel.getCombustivel());
        System.out.println("Potência: " + meuAutomovel.getPotencia() + " CV");
        System.out.println("Número de Portas: " + meuAutomovel.getPortas());
        System.out.println("Número de Lugares: " + meuAutomovel.getLugares());
        System.out.println("Preço: R$" + meuAutomovel.getPreco());

        // Simulando ações no automóvel
        meuAutomovel.ligarAutomovel();
        meuAutomovel.acelerar();
        meuAutomovel.frear();
        meuAutomovel.desligarAutomovel();
    }
}