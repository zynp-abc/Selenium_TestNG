package Freelancer.tests.day14_pom;

import Freelancer.utilities.Driver;
import org.testng.annotations.Test;

import java.awt.dnd.DragGestureEvent;

public class C05_ClassWork {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.bluerentalcars.com");
    }
}
