class Dog extends Animal {
    static public void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}