public class Tridimensional  extends Figuras{

    double largo;
    double ancho;
    double alto;
    public Tridimensional (float lado, int numLados)
    {
        super(lado, numLados);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
