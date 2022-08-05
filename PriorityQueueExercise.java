import java.util.*;

class PriorityQueueExercise {
    public static void main(String[] args) {
        Dog marco = new Dog("marco");
        Dog johnny = new Dog("Johnny");
	System.out.println("I'm a dog and my name is: "+marco.getName());
	System.out.println("I'm a dog and my name is: "+johnny.getName());
        marco.eat();
        johnny.eat(); 

        Queue<Dog> q = new LinkedList<>();
        PriorityQueue<Dog> pq = new PriorityQueue<>();
	System.out.println("\nAdding johnny and marco into a normal queue and a priority queue");
	q.offer(johnny);
	q.offer(marco);
	
	System.out.println("\nPrinting queue:");
	q.stream()
		.forEach(s->System.out.print(s.getName()+" "));
    	System.out.println("\n\nPrinting priority queue");
	pq.offer(johnny);
	pq.offer(marco);
	pq.stream()
		.forEach(x->System.out.print(x.getName()+" "));
    	System.out.println("\n\nEnd of printing");
    }
    
}
