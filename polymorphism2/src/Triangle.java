// To calculate triangle area
class Triangle extends Shape{
    private double base;
    private double height;
    private double a;
    private double c;
    public Triangle(double base,double height, double a ,double c){
        this.base = base;
        this.height = height;
        this.a = a ;
        this.c = c;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height ;

    }

    @Override
    public double calcParmitere() {
        return base + a + c ;
    }
}