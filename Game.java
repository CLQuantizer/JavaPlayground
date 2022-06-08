public class Game {
    private String name;
    private int level;
    public Game() {
        System.out.println("Game()");
    }
    public Game(String name, int level) {
        this.name=name;
        this.level=level;
        System.out.println("Game() called");
    }
    public void play() {
        System.out.println("\tplaying "+name+" at level "+level+".");
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setLevel(int level) {
        this.level=level;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
}
