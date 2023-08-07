public class Circle extends Shape{

    private double r;

    public Circle(double r){
        this.r = r;

    }

    @Override
    public double getArea() {
        return  3.14 * r * r;
    }

    @Override
    public double calcParmitere() {
        return 2 * 3.14 *r;
    }
}
