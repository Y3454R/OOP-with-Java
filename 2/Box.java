public class Box {
    int L, W, H;
    Box(int l, int w, int h) {
        L = l;
        W = w;
        H = h;
    }

    void getBox() {
        System.out.println("L: " + this.L +" W: " + this.W + " H:" + this.H);
    }

    public static void main(String[] args) {
        Box b1, b2;
        b1 = new Box(8,5,7);
        b2 = b1;
        b1 = new Box(3,9,2);
        System.out.println("before:");
        b1.getBox();
        b2.getBox();
        b1 = b2;
        System.out.println("After:");
        b1.getBox();
        b2.getBox();
    }
}
