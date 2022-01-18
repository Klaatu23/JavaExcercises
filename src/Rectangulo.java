public class Rectangulo extends Figure {

    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public int getArea() {
        return base * altura;
    }
}
