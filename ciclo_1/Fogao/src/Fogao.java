public class Fogao {
    // Atributos da classe
    private String marca;
    private String modelo;
    private String tipo;
    private int numeroBocas;
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

    public void setNumeroBocas(int numeroBocas) { this.numeroBocas = numeroBocas; }
    public int getNumeroBocas() { return this.numeroBocas; }

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
    public void ligarFogao() {
        System.out.println("Fogão ligado.");
    }

    public void desligarFogao() {
        System.out.println("Fogão desligado.");
    }

    public void acenderQueimador(int numeroBoca) {
        System.out.println("Queimador " + numeroBoca + " aceso.");
    }

    public void apagarQueimador(int numeroBoca) {
        System.out.println("Queimador " + numeroBoca + " apagado.");
    }

    public void ajustarChama(int numeroBoca, int potencia) {
        System.out.println("Chama do queimador " + numeroBoca + " ajustada para " + potencia + "%.");
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        // Criando uma instância de Fogão
        Fogao meuFogao = new Fogao();

        // Definindo os atributos do fogão
        meuFogao.setMarca("Brastemp");
        meuFogao.setModelo("Gourmand");
        meuFogao.setTipo("5 Bocas");
        meuFogao.setNumeroBocas(5);
        meuFogao.setCor("Inox");
        meuFogao.setAltura(90.0);
        meuFogao.setLargura(80.0);
        meuFogao.setProfundidade(60.0);
        meuFogao.setPreco(2999.99);

        // Exibindo as informações do fogão
        System.out.println("Marca: " + meuFogao.getMarca());
        System.out.println("Modelo: " + meuFogao.getModelo());
        System.out.println("Tipo: " + meuFogao.getTipo());
        System.out.println("Número de Bocas: " + meuFogao.getNumeroBocas());
        System.out.println("Cor: " + meuFogao.getCor());
        System.out.println("Altura: " + meuFogao.getAltura() + " cm");
        System.out.println("Largura: " + meuFogao.getLargura() + " cm");
        System.out.println("Profundidade: " + meuFogao.getProfundidade() + " cm");
        System.out.println("Preço: R$" + meuFogao.getPreco());

        // Simulando ações no fogão
        meuFogao.ligarFogao();
        meuFogao.acenderQueimador(1);
        meuFogao.ajustarChama(1, 75);
        meuFogao.apagarQueimador(1);
        meuFogao.desligarFogao();
    }
}
