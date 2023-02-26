public class Main {
    public static void main(String[] args) {
        Movable mpoint = new MovablePoint(400, 700, 55, 40);     // upcast
        System.out.println(mpoint);
        mpoint.moveDown();
        System.out.println(mpoint);

        Movable mpointprime= new MovableCircle(100, 200, 30, 40, 20);  // upcast
        System.out.println(mpointprime);
        mpointprime.moveRight();
        System.out.println(mpointprime);
    

    }
}
