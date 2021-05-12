package TestNGDemos.Demo2.Demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


    @Test
    public void classTwotest1()
    {
        System.out.println("classTwotest1()");

    }

    @Test  (groups = "email")
    public void classTwotest2()
    {
        System.out.println("classTwotest2()");
    }

    @Test
    public void classTwotest3()
    {
        System.out.println("classTwotest3()");
    }

}
