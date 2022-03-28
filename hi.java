public class hi{
    int x;
    String s;
    public hi(int a){x=a;s="";}
    public hi(String str, int a){x=a;s=str+str+str;}
    public String toString(){
        return "x: "+Integer.toString(x)+s;
    }
}