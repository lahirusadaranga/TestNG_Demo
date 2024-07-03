package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {

    @Test(priority = 0)
    public void oLevel(){
        System.out.println("O/Level");
        //Assert.fail();
    }

    @Test(priority = 1,dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("A/Level");
    }

    @Test(priority = 2,dependsOnMethods = {"aLevel","oLevel"}, alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }
}
