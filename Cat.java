class Cat extends Animal {
    public Cat(String name) {
        super(name, FoodChainLevel.HIGH);
        System.out.println("Super.name is: "+ super.getName());
	    System.out.println("Arg cat being constructed\n-----------");
    }
    public void eat() {
        System.out.println(super.getName() +" is eating");
    }
}