public class Pentagono extends Irregulares {
    double apotema;
    public Pentagono(float lado, int numLados) {
        super(lado, numLados);
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    double perimetroP= this.getLado()*5;
    public void PerimetroPentagono(){

        System.out.println("El perimetro del pentagono es %.2f\n: " + perimetroP);
    }
    public void AreaPentagono(){
        System.out.println("El area del pentagono es: " + (perimetroP * getApotema())/2);
    }
}
