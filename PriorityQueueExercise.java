import java.util.*;

class PriorityQueueExercise {
    public static void main(String[] args) {
        Dog marco = new Dog("marco");
        Dog johnny = new Dog("Johnny");
		Cat Marco = new Cat("Marco");
		Cow someCow = new Cow("Muller");
		Cow anothrCow = new Cow("Jake");

        Queue<Animal> q = new LinkedList<>();
        PriorityQueue<Animal> pq = new PriorityQueue<>();
	
		System.out.println("\nAdding animals into a normal queue and a priority queue");
		q.offer(someCow);
		q.offer(johnny);
		q.offer(marco);
		q.offer(anothrCow);
		q.offer(Marco);
		
		pq.offer(someCow);
		pq.offer(johnny);
		pq.offer(marco);
		pq.offer(anothrCow);
		pq.offer(Marco);
		

		System.out.println("Printing queue:\n------------------");
		q.stream()
			.forEach(s->System.out.print(s.getName()+":"+ s.getClass().getSimpleName()+"\n"));
			System.out.println("\nPrinting priority queue:\n------------------");

		pq.stream()
			.forEach(s->System.out.print(s.getName()+":"+ s.getClass().getSimpleName()+"\n"));
			System.out.println("\nEnd of printing\n\n\n\n\n\n");
    }
    
}
