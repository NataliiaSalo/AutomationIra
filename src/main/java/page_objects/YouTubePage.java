package page_objects;

import core.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import java.awt.*;

public class YouTubePage {
    private WebDriver driver = Driver.getDriver();;
    //private Element searchType = driver.findElement(//h3[contains(text(),'YouTube')])[1]");

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchInputField;

    @FindBy(xpath = "(//yt-icon[@id='logo-icon'])[1]")
    private WebElement youTubeLogoIcon;

    @FindBy(xpath = "(//a[@id='video-title'])[1]")
    private WebElement videoLink;

    @FindBy(xpath = "//span[contains(@class,'comments')]")
    private WebElement videoComments;

    public void logIn() {
        driver.get("https://www.youtube.com/");
        PageFactory.initElements(driver, this);
    }

    public void searchInYouTube(String word) {
        searchInputField.click();
        searchInputField.sendKeys(word);
    }

    public void clickOnSearch() {
        searchInputField.sendKeys(Keys.ENTER);
    }

    public boolean isWordPresentInVideoTitle(String word) {
        return videoLink.getText().contains(word);
    }
}






/*
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.FindBys;

        import java.awt.*;
        import java.util.concurrent.locks.Condition;

public class YouTubePage extends AbstractPO {
    @FindBy(xpath = "//input[@id='search']")
    private TextField searchYouTubeVideo;

    @FindBys({@FindBy(xpath = "(/button[@aria-label='Пошук'])[2]")}) //FindBy - lazy initialization
    private List<NavigationLink> searchVideo; //match по масиву

    @FindAll(@FindBy(xpath = "(/button[@aria-label='Пошук'])[2]")) //FindAll - буде тільки на те, що заматчало (якщо знайшло 10 співпадінь, а буде давати тільки ті, що клікабельні. Матчів буде менше)
    private List<NavigationLink> searchVideоList1; //match по масиву


    public TextField clickSearchYouTubeVideo() {
        return searchYouTubeVideo;
    }

    public NavigationLink clickSearchVideo() {
        return searchVideo;
    }

    public void clickSearchVideo(){
        searchVideoList1.stream().filter(s->s.searchVideoList1(Condition.isClickable)).flatMap.findFirst();
    }
}



package page_objects;
//немає верівайок. Тільки оголошення локаторів і що ми робимо з тими локаторами чи ми на нього клацаємо чи робимо isDisplayed чи беремо його кількість
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.ExpectedConditions;

        import javax.lang.model.element.Element;
        import java.awt.*;

public class YouTubePO extends AbstractPO{

    private Driver webDriver = WebDriverRunner.driver();
    private Element searchType =webDriver.findElement(//h3[contains(text(),'YouTube')])[1]"); 00
    @FindBy(name = "q")
    private TextFild searchType;
    @FindBy(xpath = "(//h3[contains(text(),'YouTube')])[1]")
    private NavigationLink youTubeItem;
    @FindBy(xpath = "(//ytd-guide-entry-renderer/a[@title='Бібліотека']")
    private NavigationLink libraryItem;
    @FindBy(xpath = "(//a[@title='Домашня сторінка YouTube']")
    private WebElement waitTitle;

    public TextField clickSearchField(){return searchType;}
    public NavigationLink clickYouTubeItem(){return youTubeItem;}
    public NavigationLink clickLibraryItem(){return libraryItem;}
    public void setWaitTitle(String titleText){getWait().until((dr)->dr.getTitle().startsWith(titleText));}
    public void waitYouTubeLogo(){getWait().until(ExpectedConditions.visibilityOf(youTubeItem.getElement()));}

    public boolean isWarningYesButtonDisplayed(){
        return isWarningYesButtonDisplayed();
    })

}
*/