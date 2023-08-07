public class Rectangle extends Shape {

    private double width;

    private  double hight;


    public Rectangle(double width,double hight){
        this.width = width;
        this.hight = hight;
    }
    @Override
    public double getArea() {
        return width * hight;
    }

    @Override
    public double calcParmitere() {
        return 2 * (hight + width);
    }
}
