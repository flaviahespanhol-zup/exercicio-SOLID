package exercicio3;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        int area = lado * lado;
        System.out.println(area);
        return area;
    }
}
