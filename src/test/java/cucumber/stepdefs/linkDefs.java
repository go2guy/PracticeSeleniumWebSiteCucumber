package cucumber.stepdefs;

import org.testng.Assert;

import com.neselenium.main.Links;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class linkDefs {

    Links links = new Links();

    @Given("^(.+) link is visible$")
    public void link_is_visible(String link) throws Throwable {
        Assert.assertEquals(true, links.isLinkVisible(link));
    }

    @When("^I click on (.+)$")
    public void i_click_on(String link) throws Throwable {
        Assert.assertEquals(link, links.clickLink(link));
    }

    @Then("^the page title is (.+)$")
    public void the_page_title_is(String link) throws Throwable {
        Assert.assertEquals(link, links.getTitle());
    }
}
