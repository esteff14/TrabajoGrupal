public class Cubo extends Tridimensional {

    public Cubo(float lado, int numLados) {
        super(lado, numLados);
    }
    public void area(){
        System.out.println("El area de un cubo es: " + (this.getLado()*this.getLado())*6);
    }

    public void perimetro(){
        System.out.println("El perimetro de un cubo es: " + this.getLado()*12);
    }
}
