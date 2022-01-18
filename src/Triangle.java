public class Triangle {
    public static  void main(String[] args){
     //Calcular el area de un triangulo
        // Entrada
     float base = 0f;
     float altura = 0f;
     float area=0f;
     //Proceso
       if(base>0 && altura>0){
           area = (base * altura) / 2;
       }
       else
       {
           System.out.println("los valores deben ser mayores a 0");
       }
     //Salida
     System.out.println("El area del triangulo: "+area);
    }
}
