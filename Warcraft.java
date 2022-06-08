public class Warcraft extends Game {
    {
        race ="HUM";
        System.out.println("Warcraft(instance initializer)");
    }
    private String race;
    public static void main(String[] args) {
        Game war3 = new Warcraft("UD");
        Game war4 = new Warcraft();
        war3.play();
        war4.play();
    }
    public Warcraft(String race) {
        super("War3",100);
        this.race=race;
        System.out.println("Warcraft(child constructor over)");
    }
    public Warcraft(){
        super("Any game",100);
    }
    
    @Override
    public void play(){
        System.out.println("super is playing shit");
        super.play();
        System.out.println("Child is playing shit");
        System.out.println("\tand the race is "+this.race);
    }
    
}
