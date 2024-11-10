public class Geladeira {
    // Atributos da classe
    private String marca;
    private String modelo;
    private String tipo;
    private double capacidade;
    private String cor;
    private double altura;
    private double largura;
    private double profundidade;
    private double preco;

    // Métodos getters e setters
    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return this.marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return this.modelo; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getTipo() { return this.tipo; }

    public void setCapacidade(double capacidade) { this.capacidade = capacidade; }
    public double getCapacidade() { return this.capacidade; }

    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return this.cor; }

    public void setAltura(double altura) { this.altura = altura; }
    public double getAltura() { return this.altura; }

    public void setLargura(double largura) { this.largura = largura; }
    public double getLargura() { return this.largura; }

    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }
    public double getProfundidade() { return this.profundidade; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    // Métodos funcionais
    public void ligarGeladeira() {
        System.out.println("Geladeira ligada.");
    }

    public void desligarGeladeira() {
        System.out.println("Geladeira desligada.");
    }

    public void ajustarTemperatura(double temperatura) {
        System.out.println("Temperatura ajustada para " + temperatura + "°C.");
    }

    public void abrirPorta() {
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        System.out.println("Porta fechada.");
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        Geladeira minhaGeladeira = new Geladeira();
        minhaGeladeira.setMarca("Samsung");
        minhaGeladeira.setModelo("RF28R7351SG");
        minhaGeladeira.setTipo("Side by Side");
        minhaGeladeira.setCapacidade(28.0);
        minhaGeladeira.setCor("Prata");
        minhaGeladeira.setAltura(180.0);
        minhaGeladeira.setLargura(90.0);
        minhaGeladeira.setProfundidade(75.0);
        minhaGeladeira.setPreco(4999.99);

        System.out.println("Marca: " + minhaGeladeira.getMarca());
        System.out.println("Modelo: " + minhaGeladeira.getModelo());
        System.out.println("Tipo: " + minhaGeladeira.getTipo());
        System.out.println("Capacidade: " + minhaGeladeira.getCapacidade() + " litros");
        System.out.println("Cor: " + minhaGeladeira.getCor());
        System.out.println("Altura: " + minhaGeladeira.getAltura() + " cm");
        System.out.println("Largura: " + minhaGeladeira.getLargura() + " cm");
        System.out.println("Profundidade: " + minhaGeladeira.getProfundidade() + " cm");
        System.out.println("Preço: R$" + minhaGeladeira.getPreco());

        minhaGeladeira.ligarGeladeira();
        minhaGeladeira.ajustarTemperatura(4.0);
        minhaGeladeira.abrirPorta();
        minhaGeladeira.fecharPorta();
        minhaGeladeira.desligarGeladeira();
    }
}
