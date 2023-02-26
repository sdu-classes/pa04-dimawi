public class Fish extends Animal implements Pet{
    String name;

    public Fish() {
        super(0);
        this.name = "";
    }
// with override we changed added some functions to abstract methods
    @Override
    public void eat() {
        System.out.println(name+" is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and haven't legs");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name+" is playing.");
    }
}
