package TestNGDemos.Demos;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite()");
    }

    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite()");
    }


    @Parameters("myUrl")
    @Test
    public void classThreetest1(String ul)
    {
        System.out.println("classThreetest1()");
        System.out.println("Url="+ul);

    }

    @Test  (groups = "email")
    public void classThreetest2()
    {
        System.out.println("classThreetest2()");
    }

    @Test
    public void classThreetest3()
    {
        System.out.println("classThreetest3()");
    }

}
