import java.util.List;

class CharliePuth implements SomeTypeOfLove<String>{
    static private String name="Charlie";
    static private String Lyrics= "When the world's on fire I won't even move\nThere is no reason if I'm here with you.";
    private String mood; 

    public void print(){
        System.out.println();
        System.out.println("Hello I am "+ name + "!\n");
        System.out.println(Lyrics);
        System.out.println("\nToday I'm feeling "+ mood + "!\n");
    }

    public String setter(String mood){
        this.mood = mood;
        return mood;
    }

    public String getter(){
        return mood;
    }
    
    public static void main (String[] args){
        CharliePuth cp = new CharliePuth();
        cp.setter("😄");
        cp.print();
    }
}