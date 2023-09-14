public class r extends Figura{

    public double r1,r2;
    public r(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    public String nombre(){
        return "Rectangulo";
    }

    public double area(){
        return r1*r2;
    }


}
