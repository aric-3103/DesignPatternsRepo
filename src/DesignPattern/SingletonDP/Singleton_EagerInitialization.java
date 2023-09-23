package DesignPattern.SingletonDP;

//Eager Initialition using Singleton :


public class Singleton_EagerInitialization {
    private static Singleton_EagerInitialization opt = new Singleton_EagerInitialization();
    public String str;

    private Singleton_EagerInitialization() {
        str = "Eager Approach in Singleton Class";
    }

    public static Singleton_EagerInitialization getEagerInstance() {
        return opt;
    }

    public static void main(String[] args) {
        Singleton_EagerInitialization result = Singleton_EagerInitialization.getEagerInstance();
        System.out.println(result.str);
    }
}
