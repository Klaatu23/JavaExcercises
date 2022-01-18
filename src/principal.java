public class principal {

    public static void main(String[] args)
    {
        Triangulo t1 = new Triangulo("triangulito",5,4);
        System.out.println("Area triangulo: "+t1.area());
        System.out.println(t1.getNombre());

        Cuadrado c1 = new Cuadrado("cuadradito",5);
        System.out.println("Area cuadrado: "+c1.area());


        Rectangulo r1 = new Rectangulo("rectangulito",8,9);
        System.out.println("Area rectangulo:"+r1.getArea());
        System.out.println(r1.getNombre());
    }
}
