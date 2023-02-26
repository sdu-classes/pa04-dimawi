public class Spider extends Animal{
    public Spider() {
        super(40);
    }
//Here we just changed methods of the animal by overriding
    @Override
    public void eat() {
        System.out.println("Spider eating;");
    }

    @Override
    public void walk() {
        System.out.println("Spider walking with "+legs+" legs");
    }
}
