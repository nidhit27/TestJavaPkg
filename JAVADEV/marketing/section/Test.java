package marketing.section;
import marketing.section.*;
public class Test {
    
    public static void main(String args[])
    {
        Test print = new Test();
        print.fun1();
        print.fun2();

        Person k = new Person();
        k.setName("Lasya1");
        String myname = k.getName();
        System.out.println(myname);

        k.setName("Nidhi");
         myname = k.getName();
        System.out.println(myname);

        k.setName("Nara");
        myname = k.getName();
        System.out.println(myname);

        

    }

    public void fun1()
    {
        System.out.println("Hello Fun 1");
    }

    public void fun2()
    {
        System.out.println("Hello Fun 2");
    }

    
}

