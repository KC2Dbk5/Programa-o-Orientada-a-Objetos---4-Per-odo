import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10, "blue");
        System.out.println("Área: " + rect.getArea());
        System.out.println("Perímetro: " + rect.getPerimeter());
        System.out.println("Cor: " + rect.getColor());
        System.out.println("É um quadrado? " + rect.isSquare());
        System.out.println("Diagonal: " + rect.getDiagonal());
    }
}
