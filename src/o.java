public class o extends Figura{ // Figura fig = new
    public double radio;

    public String nombre(){
        return "Circulo";
    }

    public o(double radio){
        this.radio = radio;
    }

    public double area(){
        return Math.PI*radio*radio;
    }


}
