public class T extends Figura{
    public double base;
    public double lado;

    public String nombre(){
        return "Triangulo";
    }
    public T(double base, double lado){
        this.base = base;
        this.lado= lado;
    }
    public double area(){
        return (base*lado)/2;
    }
}
