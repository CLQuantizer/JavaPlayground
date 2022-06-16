class Int{
    public static void main(String[] args){
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        Integer c = new Integer(200);
        Integer d = new Integer(200);
        System.out.println("a和b等嗎？ "+(a==b));
        System.out.println("c和d等嗎？ "+(c==d));
        a=50;
        System.out.println("把a改成50後, b="+b);
    }
}