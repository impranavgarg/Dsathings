package oops.inheritence;

public class Main {

    public static void main(String[] args) {
        Box cube =  new Box(4);
        // Box cuboid =  new Box(4, 5, 6);
        BoxPrice Boxwithprice =  new BoxPrice(4, 5, 6, 40, 45);
        // Box box1 = new BoxPrice(1,3,4,5);
        BoxPrice box2 = new Box(1,3,4,5);

        System.out.println(cube.l+" " + cube.h+" " +cube.w);
        System.out.println(Boxwithprice.l+" " + Boxwithprice.h+" " +Boxwithprice.w+" "+Boxwithprice.weight+" "+ Boxwithprice.price);


    }
    
}
