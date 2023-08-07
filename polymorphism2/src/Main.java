public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(9,3, 4,5);
        System.out.println(" the area of triangle = "+ triangle.getArea());
        System.out.println(" the paramiter of triangle = "+ triangle.calcParmitere());

       Rectangle rectangle = new Rectangle(5,4);
        System.out.println(" the area of rectangle = "+ rectangle.getArea());
        System.out.println(" the paramiter of rectangle = "+ rectangle.calcParmitere());

        Circle circle = new Circle(6);
        System.out.println(" the area of circle = "+ circle.getArea());
        System.out.println(" the paramiter of circle = "+ circle.calcParmitere());




    }
}

