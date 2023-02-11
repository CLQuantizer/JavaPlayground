import java.util.*;
class ListDog{
	
	public static void main(String[] args){
		List<Dog> ld = new ArrayList<>();
		Dog d1 = new Dog("Marco");
		ld.add(d1);
		ld.stream().forEach(x->System.out.println(x.getName()));
		d1.setName("John");
		ld.stream().forEach(x->System.out.println(x.getName()));
	}
}