package business_objects;
import ch.qos.logback.classic.Logger;
import core.Driver;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;
import page_objects.YouTubePage;

public class YouTubeStepDefinitions {
    private static final io.cucumber.core.logging.Logger logger = LoggerFactory.getLogger(YouTubeStepDefinitions.class);
    private YouTubePage youTubePage;
    //private static final Logger log = LoggerFactory.getLogger(YouTubeStepDefinitions.class);

    @Given("Log in to Youtube")
    public void logInToYoutube() {
        youTubePage = new YouTubePage();
        youTubePage.logIn();
        //logger.info("Check loading Google page");
    }

    @When("Fill out word {string}")
    public void fillOutWordXpath(String word) {
        youTubePage.searchInYouTube(word);
        //log.info("Searching on YouTube");
    }

    @And("Click on Search button")
    public void clickOnSearch() {
        youTubePage.clickOnSearch();
        //log.info("Click Enter on keyboard");
        ExecuteSQL.executeInsertSQl();
    }

    @Then("Verify that {string} word contains in title video")
    public void verifyThatWordContainsInTitleVideo(String word) {
        Assert.assertTrue(youTubePage.isWordPresentInVideoTitle(word));
    }

    @After
    public void closeBrowser() {
        Driver.getDriver().quit();
    }
}