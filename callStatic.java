class callStatic {
    public static void main(String[] args) {
        Static.printshit();
        Static.printshit("bingo");
        Static p = new Static();
        p.printAttr("call from another main");
    }
}