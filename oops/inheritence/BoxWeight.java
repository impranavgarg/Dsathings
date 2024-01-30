package oops.inheritence;

public class BoxWeight extends Box {

    double weight;
    public BoxWeight(){
        this.weight = -1;

    }
    public BoxWeight(double weight) {
        this.weight = weight;
    }
    public BoxWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }
    public BoxWeight(int l, int h, int w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    


    
    
}
