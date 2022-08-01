public class PassByValue {
    public static void main(String[] args) {
        int a = 1;
        int n = 4;
        
        System.out.println("a = " + a);
        System.out.println("n = " + n);

        System.out.println("After passing a and b to the method, a and n are not changed\n");
        
        int res = passByValue(a, n);
        System.out.println("a = " + a);
        System.out.println("n = " + n);
        System.out.println("res = " + res);
    }
    
    static public int passByValue(int a, int n) {
        while(n>0){
            a = a * 2;
            n--;
        }
        return a;
    }
}