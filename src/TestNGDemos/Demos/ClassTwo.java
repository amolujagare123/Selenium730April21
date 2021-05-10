package TestNGDemos.Demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","os"})
    @Test
    public void classTwotest1(String ul,String myOs)
    {
        System.out.println("classTwotest1()");
        System.out.println("Url="+ul);
        System.out.println("OS="+myOs);
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
