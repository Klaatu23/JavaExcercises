public class Coche {

    //Atributos
    private String marca;
    private String color;
    public int km;
    public int tanque;

    //Constructor(es)
    public Coche() {
    }

    public Coche(String marca, String color, int km,int tanque) {
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.tanque = tanque;
    }

    //metodos getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void llenaTanque(int cnt){
        this.tanque = cnt;
    }

    public int muestraTanque(){
        return this.tanque;

    }
}
