public abstract class Animal implements Comparable<Animal> {
	private String name;
	public Animal(){
		System.out.println("No arg Animal constructed");
	}
	public Animal(String name){
		this.name=name;
		System.out.println("Arg Animal constructed");
	}
	public abstract void eat();
	public String getName(){
		return this.name;
	}
}
