package singleton;
class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject obj1 = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();
        System.out.println(obj1 == obj2);
    }
}