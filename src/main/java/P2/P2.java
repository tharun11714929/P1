package P2;

public class P2 {
    public static void main(String[] args){
        P2 p2= new P2();
        System.out.println(p2.method1("hello","Jai Mahishmathi", "hello how are you"));
    }
    public String method1(String s1, String s2, String s3){
        return s3.replace(s1,s2);
    }
}
