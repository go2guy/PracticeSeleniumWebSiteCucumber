package com.neselenium.main;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

public class DriverInitializer {

    private static WebDriver driver = null;
    private static WebDriverWait wait;
    private static ITestContext _context;

    private void setSystemProperty() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
    }


    public WebDriver getDriver() {
        if (driver == null)
            System.out.println("Driver is null");
        return driver;
    }

    public void setUp(ITestContext context) throws MalformedURLException {
        setSystemProperty();
        setContext(context);
        driver = new FirefoxDriver();
        setWait();
    }

    private void setContext(ITestContext context) {
        _context = context;
    }

    private static ITestContext getContext() {
        return _context;
    }

    public static String getParam(String value) {
        return getContext().getCurrentXmlTest().getParameter(value);
    }

    private void setWait() {
        wait = new WebDriverWait(driver, 60);
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    public void goToUrl(String url) {
        driver.navigate().to(url);
    }
}



//    @BeforeSuite(alwaysRun = true)
//    public void setTestSuite() throws MalformedURLException {
//
//        setSystemProperty();
//        driver = new FirefoxDriver();
//
//    }
//

//
//    @AfterSuite(alwaysRun = true)
//    public void endTestSuite() {
//        if (driver != null) {
//            driver.close();
//            driver.quit();
//            driver = null;
//        }
//    }

