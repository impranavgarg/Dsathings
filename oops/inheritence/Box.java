package oops.inheritence;

public class Box {
    int l;
    int h;
    int w;


    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(int side){
        this.l = side;
        this.h = side;
        this.w = side;

    }

    // cuboid
    Box(int l, int h ,int w){
        this.l = l;
        this.h = h;
        this.w = w;

    }

    
}
