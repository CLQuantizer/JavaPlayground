import java.util.*;
import java.nio.file.*;
import java.util.stream.*;
import java.io.IOException;
public class hello {
    public static void main (String[] args) throws IOException {
        Object t = new LinkedList<dope>();
        System.out.println("Welcome to CS!!!");
        System.out.println("Let's have some fun.");
        int a =1;
        hi h = new hi("Li",a);
        dope d = new dope("Plug",3);
        dope d2= new dope();
        System.out.println("hi is: "+h);
        System.out.println("dope is "+d);
        System.out.println("dope is "+d2);
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        int [] arr = {1,2,3,4,5};
        Song s1 = new Song("beiguodexue",3);
        Song s2 = new Song("liangzhihudie",2);
        Song s3 = new Song("2002niandediyichangxue",4);
        Song s4 = new Song("laoshuaidami",5);
        Song s5 = new Song("tongzhuodeni",3);
        Song s6 = new Song("laoshuaidami",5);
        
        List<Song> songs = Arrays.asList(s1,s2,s3,s4,s5,s6);
        List<Song> shortSongs = songs
            .stream()
            .filter( c -> c.length<4)
            .collect(Collectors.toList());
        System.out.println(shortSongs);
        Stream<String> fs = Files.lines(Paths.get("songs.txt"));
        fs.sorted().filter(x->x.charAt(0)>='s').forEach(System.out::println);

/* Threads
        MyThread m1 = new MyThread("1daye");
        MyThread m2 = new MyThread("2vamos");
        MyThread m3 = new MyThread("3zhoukan");
        MyThread m4 = new MyThread("4sanlian");
        MyThread m5 = new MyThread("5niwota");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
*/

// initializing arrays
        List<Song> ge = new LinkedList<>();
        ge.add(s1);
        ge.add(s1);
        ge.add(s1);
        ge.add(s1);
        ge.add(s1);
        System.out.println(ge);


    }
}
// class dope {
//     public dope(int a, int b){x=a;y=b;}    
//     public String toString(){
//     return "do: "+Integer.toString(x) + " pe: "+Integer.toString(y);
//     }   
// 

class dope extends hi{
    public dope(int a){
        super(a);
    }
    public dope(){
        super(0);
    }
    public dope(String s, int a){
        super(s+s,a);
    }
    public String toString(){
        return "x: "+Integer.toString(x)+ s;
    }
}
class Song {
// class Song implements Comparable<Song>{
    String name;
    public int length;
    Song (String n,int len){name=n;length=len;}
    Song (String n){name=n;length=0;}
    // @Override
    // public int compareTo(Song o){
    //     return name.compareTo(o.name);
    // }
    @Override
    public String toString(){return name+" length: "+Integer.toString(length)+"\n";}
    // // @Override
    // public int hashCode(){return Objects.hash(name,name);}
    // @Override 
    // public boolean equals(Object o){
    //     if(this==o)return true;
    //     if(o==null||getClass()!=o.getClass())return false;
    //     Song song = (Song) o;
    //     return length == song.length && name.equals(song.name);
    //     // return name.equals(song.name);
    //     // return length == song.length;
    // }
}




















