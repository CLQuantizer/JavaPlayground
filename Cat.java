class Cat extends Animal {
    static public void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
}