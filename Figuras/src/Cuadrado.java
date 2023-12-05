public class Cuadrado extends Bidimensional{
    //Atributos
    public Cuadrado (float lado, int numLados)
    {
        super(lado, numLados);
    }
    public void area()
    {
        double area=Math.pow(this.lado, 2);
        System.out.printf("El area del cuadrado es: %.2f\n", area);
    }

    public void perimetro()
    {
        double perimetro=this.lado*4;
        System.out.printf("El perimetro del cuadrado es: %.2f\n", perimetro);
    }
    public void diagonal()
    {
        ;
    }
}
