// Definição da interface DVD
interface DVD {
    String eject();
    String play();
    String stop();
    String pause();
}

// Classe principal Televisor
public class Televisor {
    private int canal;
    private String tamanho;
    private String modelo;

    // Construtor padrão
    public Televisor() {
        this.canal = 4;
        this.tamanho = "15 polegadas";
        this.modelo = "SEMP TOSHIBA";
    }

    // Construtor com parâmetros
    public Televisor(int canal, String tamanho, String modelo) {
        this.canal = canal;
        this.tamanho = tamanho;
        this.modelo = modelo;
    }

    // Método getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Métodos getters e setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Classe TelevisorComDVD estendida de Televisor e implementa DVD
    public static class TelevisorComDVD extends Televisor implements DVD {
        // Construtor padrão
        public TelevisorComDVD() {
            super(31, "20 polegadas", "PHILCO");
        }

        // Implementação dos métodos da interface DVD
        @Override
        public String eject() {
            return "Eject ativado";
        }

        @Override
        public String play() {
            return "Função Play ativada";
        }

        @Override
        public String stop() {
            return "Função Stop ativada";
        }

        @Override
        public String pause() {
            return "Função Pause ativada";
        }
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        // Criando objetos da classe Televisor
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(10, "10 polegadas", "Gradiente");

        System.out.println("O objeto tv 1 é " + tv1.getModelo());
        System.out.println("O objeto tv 2 é " + tv2.getModelo());

        // Alterando os atributos de tv1
        tv1.setModelo("SAMSUNG");
        tv1.setCanal(5);
        tv1.setTamanho("70 polegadas");

        System.out.println("O objeto tv 1 agora é " + tv1.getModelo());
        System.out.println("O objeto tv 1 está no canal " + tv1.getCanal());
        System.out.println("O objeto tv 1 tem " + tv1.getTamanho());

        // Alterando os atributos de tv2
        tv2.setModelo("LG");
        tv2.setCanal(18);
        tv2.setTamanho("50 polegadas");

        System.out.println("O objeto tv 2 agora é " + tv2.getModelo());
        System.out.println("O objeto tv 2 está no canal " + tv2.getCanal());
        System.out.println("O objeto tv 2 tem " + tv2.getTamanho());

        // Criando uma instância de TelevisorComDVD
        TelevisorComDVD tvComDVD = new TelevisorComDVD();
        System.out.println("O objeto tvComDVD é " + tvComDVD.getModelo());
        System.out.println(tvComDVD.eject());
        System.out.println(tvComDVD.play());
        System.out.println(tvComDVD.stop());
        System.out.println(tvComDVD.pause());
    }
}