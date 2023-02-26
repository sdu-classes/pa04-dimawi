public class Cat extends Animal implements Pet{
    String name;

    public Cat() {
        super(4);
        this.name = "";
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }
// we use same logic here with cat like with fish, we are using override
    @Override
    public void eat() {
        System.out.println(name+" is eating!");
    }

    @Override
    public void walk() {
        System.out.println(name+" is walking with "+legs+" legs.");
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
        System.out.println(name+" is playing!");
    }
}
