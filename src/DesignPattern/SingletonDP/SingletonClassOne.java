package DesignPattern.SingletonDP;

public class SingletonClassOne {

    private static SingletonClassOne singletonClassExample;

    public String str;

    private SingletonClassOne() {
        str = "Welcome to the Singleton class";
    }

    public static SingletonClassOne getSingletonInstance() {
        if(singletonClassExample== null)
            singletonClassExample = new SingletonClassOne();

        return singletonClassExample;
    }

     public static void main(String[] args) {
         System.out.println(SingletonClassOne.getSingletonInstance());
         System.out.println(SingletonClassOne.getSingletonInstance());



     }
 }
