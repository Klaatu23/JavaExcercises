public class Promedio {

    public static void main(String[] args){
    //Calcular el promedio de un alumno tomando en consideración 4 calificaciones,
        // las calif seran del tipo entero.

     int c1 = 6;
     int c2 = 6;
     int c3 = 6;
     int c4 = 6;

     int promedio = (c1+c2+c3+c4)/4;

     if(promedio>=8)
         System.out.println("Aprobado");
     else
         System.out.println("No Aprobado");

     System.out.println("Promedio: "+promedio);

    }
}
