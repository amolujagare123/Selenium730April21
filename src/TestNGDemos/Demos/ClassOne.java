package TestNGDemos.Demos;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest()");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest()");
    }


    @Parameters({"myUrl","os"})
    @Test
    public void classOnetest1(String ul,String myOs)
    {
        System.out.println("classOnetest1()");

        System.out.println("url="+ul);
        System.out.println("OS="+myOs);

    }

    @Test (groups = "email")/*(enabled = false)*/
    public void classOnetest2()
    {
        System.out.println("classOnetest2()");
    }

    @Test
    public void classOnetest3()
    {
        System.out.println("classOnetest3()");
    }

}
