public class Descuento {
    public static void main(String[] args)
    {
        //Descuento del 20% en la compra de tres camisas o mas

        //Entrada
        float precioCamisa = 100f;
        int cntCamisas = 3;
        float totalCompra = 0;
        //Proceso
        if(cntCamisas>=3)
        {
            totalCompra = (cntCamisas * precioCamisa);
            float totalDesc = totalCompra * 0.8f;
            System.out.print("Total compra: "+totalDesc);
        }
        else
        {
            totalCompra = (cntCamisas * precioCamisa);
            System.out.print("Total compra: "+totalCompra);

        }
    }
}
