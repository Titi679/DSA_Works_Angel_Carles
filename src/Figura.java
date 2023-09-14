public abstract class Figura implements Comparable<Figura>{
    public abstract double area();
    public abstract String nombre();


    @Override
    public int compareTo(Figura o) {
        double comparator = this.area() - o.area();
        if (comparator < 0) { // area menor
            return -1;
        } else if (comparator > 0) { //area mayor
            return 1;
        } else { // =
            return 0;
        }
    }
}


