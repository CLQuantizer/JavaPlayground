class Dog extends Animal{
    
    public Dog(){
	    System.out.println("No arg dog");
    }
    public Dog(String name){
	    super(name,FoodChainLevel.HIGH);
	    System.out.println("Super.name is: "+ super.getName());
	    System.out.println("Arg dog being constructed\n-----------");
    }
    public void eat() {
        System.out.println(super.getName() + " is eating");
    }
}
