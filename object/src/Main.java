public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.number = 1;
        product.name = "t-shirt";
        product.brand = "Adidas";
        product.category = "Girl";
        product.isExist = true;

        product.printName();
        product.productDetail();

        Product.paymentMethod();


        Product product2 = new Product();
        Product product3 = new Product(3, "dress", "zara ", "woman",true);

    }

}

class  Product{
    // default constructor
    Product(){
        System.out.println(" create new product ");
    }

    // parameterize constructor
    Product(int a, String b, String c, String d, boolean e ){

        number = a;
        name = b;
        category = c;
        brand = d;
        isExist = e;

        System.out.println(a + "  product name is "+ b +"product category is  "+ c);
    }


    //initialize variable
    int number;
    String name;
    String category;
    String brand;
    boolean isExist;


    //methods
    void  printName(){
        System.out.println(" product name is : " + name);
    }

    void  productDetail(){
        System.out.println(" product number is : " + number);
        System.out.println(" product category is : " + category);
        System.out.println(" product brand is : " + brand);
        System.out.println(" Is product exist in store? " + isExist);
    }

    static void  paymentMethod(){
        System.out.println(" by cash ");
    }
}