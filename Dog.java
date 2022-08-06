class Dog extends Animal{
    
    public Dog(){
	    System.out.println("No arg dog");
    }
    public Dog(String name){
	    super(name);
	    System.out.println("Super.name is: "+ super.getName());
	    System.out.println("Arg dog being constructed\n-----------");
    }
    public  int compareTo(Animal Another){
	    return Another.getName().compareTo(super.getName());
    }

    static public void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
    public void eat() {
        System.out.println(super.getName() + " is eating");
    }
}
