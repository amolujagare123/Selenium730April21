package TestNGDemos.Demo2.Demos;

import org.testng.Assert;
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



    @Test
    public void classThreetest1()
    {
        System.out.println("classThreetest1()");


    }

    @Test  (groups = "email")
    public void classThreetest2()
    {
        System.out.println("classThreetest2()");
        Assert.assertEquals(true,false,"classThreetest2() failed");

    }

    @Test
    public void classThreetest3()
    {
        System.out.println("classThreetest3()");
    }

}
