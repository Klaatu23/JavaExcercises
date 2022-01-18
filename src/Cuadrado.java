public class Cuadrado extends Figura implements calculArea{

    private int lado;

    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int area() {
        return lado * lado;
    }
}
