package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver wd) {
        driver = wd;
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js. executeScript ( "document. querySelector ('footer').style display = 'none'");
    }

    public boolean isTextToBePresent(WebElement element,String text,int time){
        return  new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }
}