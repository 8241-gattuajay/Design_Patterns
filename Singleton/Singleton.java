package Singleton;

public class Singleton {
    private static Singleton instance;
    String s;
    private Singleton(){
         s="I am good at something";
    }
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton x= Singleton.getInstance();
        Singleton y =Singleton.getInstance();
        System.out.println(x.s);

        System.out.println(y.hashCode());
        if(x==y){
            System.out.println("Both have same hashcode");
        }else {
            System.out.println("Not same");
        }
    }
}