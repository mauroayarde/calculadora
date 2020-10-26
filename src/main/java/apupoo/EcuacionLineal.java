package apupoo;

public class EcuacionLineal extends Ecuacion{
    private double a;
    private double b;

    


    @Override
    public double resolverEcuacion(double x){
        return a*x+b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public EcuacionLineal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
}
