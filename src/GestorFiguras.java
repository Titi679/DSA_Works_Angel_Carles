import java.lang.reflect.Array;
import java.util.*;

public class GestorFiguras {


    public static double sumante = 0;

    public static double suma(Figura[] f) {
        for (Figura v : f) {
            sumante += v.area(); // sumante = sumante + area
        }
        return sumante;
    }

    public static void main(String[] args) {
        boolean w = true;
        while (w == true) {
            Scanner intro = new Scanner(System.in);
            int res;
            System.out.print("0: salir\n1: suma\n2: orden\n3: orden inverso\n");
            res = intro.nextInt();
            Figura[] f = new Figura[4];
            f[0] = new o(1);//2
            f[1] = new T(1, 1);//3
            f[2] = new r(1, 0);//4
            f[3] = new c(10);//1
            if (res == 1) {
                double x = suma(f);
                System.out.println("La suma épica de las áreas es: " + x);
            }
            if (res == 2) {
                Arrays.sort(f);
                for (Figura v : f) {
                    System.out.println("Area del " + v.nombre() + " con valor de " + v.area() + " u^2");
                }
            }
            else if (res==3){
                Arrays.sort(f,Comparator.reverseOrder());
                for (Figura v : f) {
                    System.out.println("Area del " + v.nombre() + " con valor de " + v.area() + " u^2");
                }
            }
            else if (res == 0) {
                w = false;
            }
            else {
                System.out.println(":(");
            }
        }

    }
}




