public class PassByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("");
        System.out.println("After passing a and b to the method, a and b are not changed");
        System.out.println("");
        passByValue(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    public static void passByValue(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}