class Static {
    static public String name="Mr. Static";
    static public String loc="Oxford, UK";
    static public <T> void printshit(T message) {
        System.out.println(message);
    }
    static public void printshit() {
        System.out.println(name);
    }
    static public void main(String[] args) {
        printshit("bingo");
        printshit(123123);
        Static s= new Static();
        s.printAttr("gogogo");
    }
    public <T> void printAttr(T message) {
        System.out.println(loc+" "+name+" "+message);
    }
}