package cucumber.stepdefs;

import java.util.List;

import org.testng.Assert;

import com.neselenium.main.Links;
import com.neselenium.utils.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class linkDefs {

    Links links = new Links();

    @Given("^(.+) link is visible$")
    public void link_is_visible(String link) throws Throwable {
        Assert.assertEquals(true, links.isLinkVisible(link));
    }

    //
    //    @When("^I click on (.+)$")
    //    public void i_click_on(String link) throws Throwable {
    //        Assert.assertEquals(link, links.clickLink(link));
    //    }
    //
    @Then("^the page title is (.+)$")
    public void the_page_title_is(String link) throws Throwable {
        Assert.assertEquals(link, links.getTitle());
        Utils.sleep(5000);
    }


    class MenuLink {

        private String linkvalue;

        public String getLink() {
            return linkvalue;
        }

    }

    @Given("^link is visible$")
    public void link_is_visible() throws Throwable {

    }

    @When("^I click on$")
    public void i_click_on(List<MenuLink> menuLinks) throws Throwable {
        for (MenuLink menuLink : menuLinks)
            Assert.assertEquals(menuLink.getLink(), links.clickLink(menuLink.getLink()));
    }

    @Then("^the page title is$")
    public void the_page_title_is() throws Throwable {

        Utils.sleep(5000);

    }
}
