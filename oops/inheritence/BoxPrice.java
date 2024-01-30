package oops.inheritence;

public class BoxPrice extends BoxWeight {
    int price;

     BoxPrice(){
        this.price = 0;
    }

     BoxPrice(int l, int h, int w , double weight){
        super(l, h, w, weight);
        this.price = 0;
    }
     BoxPrice(int l, int h, int w , double weight, int price){
        super(l, h, w, weight);
        this.price = price;
    }




}
