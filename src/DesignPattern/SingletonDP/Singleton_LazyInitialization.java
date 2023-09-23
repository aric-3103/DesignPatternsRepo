package DesignPattern.SingletonDP;
public class Singleton_LazyInitialization
{
    private static Singleton_LazyInitialization lazyInstance;
    public String str;

    private Singleton_LazyInitialization()
    {
        str = "Lazy Approach in Singleton Class";
    }
    public static Singleton_LazyInitialization getSingletonLazyInstance()
    {
        if (lazyInstance == null)
        {
            lazyInstance = new Singleton_LazyInitialization();
        }
        return lazyInstance;
    }

    public static void main(String args[])
    {
        Singleton_LazyInitialization text = Singleton_LazyInitialization.getSingletonLazyInstance();
        System.out.println("The String is:" + text.str);
    }
}
