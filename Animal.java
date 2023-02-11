public abstract class Animal implements Comparable<Animal> {
	private String name;
	private FoodChainLevel foodChainLevel;
	public Animal(){
		System.out.println("No arg Animal constructed");
	}
	public Animal(String name, FoodChainLevel level){
		this.name=name;
		this.foodChainLevel = level;
		System.out.println("Arg Animal constructed");
	}
	public void setName(String name){
		this.name=name;
	}

	public abstract void eat();
	public String getName(){
		return this.name;
	}
	public FoodChainLevel getLevel(){
		return this.foodChainLevel;
	} 
	public int compareTo(Animal Another){
		int res = Another.getLevel().compareTo(this.getLevel());
		if (res==0){
			return Another.getName().compareTo(this.getName());
		}else{
			return res;
		}
	}
}
