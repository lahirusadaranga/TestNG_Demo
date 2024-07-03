package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    SoftAssert softAssert =new SoftAssert();
    String actualValue = "Lahiru";

// Assert = Hard                     //SoftAssert = softassert
    @Test(priority = 0)
    public void valuesEqualTest() {
        String expectedvalue = "Lahiru";
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue, expectedvalue, "Values miss matched");
        System.out.println("After valuesEqualCheck assertion");

        softAssert.assertAll();                 // we must use this line when we use softAsser
    }


    @Test(priority = 1)
    public void valuesNotEqualTest() {
        String expectedvalue = "Learn Well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        softAssert.assertNotEquals(actualValue, expectedvalue, "Values matched");
        System.out.println("After to valuesNotEqualCheck assertion");       //assertion use for unit testing by devolepers or QAs

    }

    @Test(priority = 2)
    public void trueConditonCheck() {
        System.out.println("Prior to trueConditonCheck assertion");
        softAssert.assertTrue(actualValue.startsWith("L"), "Condition Return a False");
        System.out.println("After to valuesNotEqualCheck assertion");

    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("prior ro falseConditionCheck assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition Return a True");
        System.out.println("After to falseConditionCheck asstertion");

    }

}