class Cat extends Animal {
    private String name;
    private int weight;
    
    public Cat() {
        this.name = "";
        this.weight = 0;
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
    void setName(String name) {
        this.name = name;
    }
    void getName() {
        System.out.println("Cat's name is " + name);
    }
    void setWeight(int weight) {
        this.weight = weight;
    }
    void getWeight() {
        System.out.println("Cat's weight is " + weight);
    }
}