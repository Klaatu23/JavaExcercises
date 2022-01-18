public class Cochera {

    public static void main(String[] args){
     //Objeto 1
     Coche c1 = new Coche("VW","azul",55,4);
     System.out.println("Marca: "+c1.getMarca());
     System.out.println("KM: "+c1.getKm());
     //Objeto 2
     Coche c2 = new Coche("Jeep","negro",75,5);
     System.out.println("Marca: "+c2.getMarca());
     System.out.println("Color: "+c2.getColor());
     //Objeto 3
     Coche c3 = new Coche();
     //setters
     c3.setMarca("Hyundai");
     c3.setColor("Rojo");
     c3.setKm(25);
     c3.llenaTanque(55);
     //getters
        System.out.println("Marca: "+c3.getMarca());
        System.out.println("Color: "+c3.getColor());
        System.out.println("Km: "+c3.getKm());
        System.out.println("tanque gas: "+c3.muestraTanque());
    }
}
