package cucumber.runner;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.neselenium.utils.DriverFactory;
import com.neselenium.utils.LocalDriverManager;
import com.neselenium.utils.Utils;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/cucumberFeatures/homepage.feature", glue = {"cucumber.stepdefs"})
public class TestRunner extends AbstractTestNGCucumberTests {

    //static DriverInitializer d = new DriverInitializer();
    //static Utils.DriverFactory d = new DriverFactory();

    @BeforeSuite
    private static void setUp(ITestContext context) {
        DriverFactory.createInstance(context);
        //d.setUp(context);
    }

    @AfterSuite
    private static void tearDown() {
        //d.tearDown();
        LocalDriverManager.destroyLocalDriver();
    }

    @BeforeClass
    public static void goToUrl() throws InterruptedException {

        //d.goToUrl("http://www.practiceselenium.com");
        if (LocalDriverManager.getDriver() == null)
            System.out.println("Driver is null");
        LocalDriverManager.getDriver().navigate().to(Utils.getParam("baseURL"));

    }

}


