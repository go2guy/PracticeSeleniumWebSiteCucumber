package com.neselenium.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.neselenium.utils.BasePage;

public class Links extends BasePage {

    private WebDriver driver = getDriver();

    public Links() {}

    private final static String link_Format = "//*[@data-title='%s']";

    public boolean isLinkVisible(String link) throws InterruptedException {
        return waitForVisibilityOfElement(findLinkItem(link));
    }

    public String clickLink(String link) throws InterruptedException {
        click(findLinkItem(link));
        waitForTitle(link);
        return driver.getTitle();
    }

    private WebElement findLinkItem(String link) {
        String xpath = String.format(link_Format, link);
        return driver.findElement(By.xpath(xpath));
    }

    public String getTitle() {
        return driver.getTitle();
    }

    //    public boolean waitForVisibilityOfElement(WebElement element) {
    //        boolean isExists = true;
    //        try {
    //            wait.until(ExpectedConditions.visibilityOf(element));
    //        } catch (NoSuchElementException e) {
    //            isExists = false;
    //        } catch (Exception e) {
    //            isExists = false;
    //        }
    //        return isExists;
    //    }
}
