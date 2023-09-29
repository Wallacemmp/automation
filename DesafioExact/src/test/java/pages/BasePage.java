package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends PageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor javaScriptExecutor = null;
    protected long timeOutDefault;
    protected long implicitTimeOutDefault;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.timeOutDefault = getWaitForTimeout().toMillis();
        this.implicitTimeOutDefault = getImplicitWaitTimeout().toMillis();
        this.wait = new WebDriverWait(driver, timeOutDefault);
        this.driver.manage().timeouts().implicitlyWait(implicitTimeOutDefault, TimeUnit.SECONDS);
        //this.javaScriptExecutor = (JavascriptExecutor) driver;
        this.driver.manage().window().maximize();
    }

    protected WebElement waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    protected void click(By locator){
        waitForElement(locator);
        WebElement element = driver.findElement(locator);
        element.click();
    }
    protected void clickByText(String text) {
        By elementoVisualizado = By.xpath("(//*[text()='" + text + "'])");
        waitForElement(elementoVisualizado).click();
    }

    protected void sendKeys(By locator, String text) {
        waitForElement(locator).sendKeys(text);
    }

    protected boolean returnIfElementIsDisplayed(By locator) {
        return waitForElement(locator).isDisplayed();

    }

    protected boolean returnIfTextDisplayed(String text) {
        By elementoVisualizado = By.xpath("(//*[text()='" + text + "'])");
        return returnIfElementIsDisplayed(elementoVisualizado);
    }

    protected boolean returnIfElementExistsByTime(By locator, int time) {
        boolean result = false;
        this.wait = new WebDriverWait(this.driver, time);
        WebDriverWait waitTime = new WebDriverWait(driver, time);
        try {
            waitTime.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            result = true;
        } catch (Exception e) {
        }
        return result;
    }


}
