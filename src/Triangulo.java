public class Triangulo  extends Figura implements calculArea{

    private int base;
    private int altura;


    public Triangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int area() {
        return (base*altura)/2;
    }
}
