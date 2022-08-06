public class Cow extends Animal {
    public Cow(String name) {
        super(name, FoodChainLevel.LOW);
        System.out.println("Super.name is: "+ super.getName());
        System.out.println("Arg cow being constructed\n-----------");
    }
    public void eat() {
        System.out.println(super.getName() +" is eating");
    }
}