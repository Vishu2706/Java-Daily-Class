class Box{
    double height, width, depth;
    void volume(){
        System.out.println("Volume : "+(width*height*depth));
    }

    public Box() {
        System.out.println("Default Constructor");
        width = 3;
        height = 4;
        depth = 6;
    }

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    
    Box(Box b){
        System.out.println("Copy Constructor");
    }
}

public class Const{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.volume();

        Box b2 = new Box(23.4,34.4,10.5);
        b2.volume();

        Box b3 = new Box(b2);
        b3.volume();
    }
}