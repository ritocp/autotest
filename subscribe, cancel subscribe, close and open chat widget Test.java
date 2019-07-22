// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class OpensubscribecancelbacktomainmenuTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void opensubscribecancelbacktomainmenu() {
    driver.get("https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079undefined");
    {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("vc-widget-title")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 50);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vc-input")));
    }
    driver.findElement(By.id("vc-input")).sendKeys("Hello!");
    driver.findElement(By.cssSelector(".vciw-play3")).click();
    driver.findElement(By.cssSelector(".quick-reply")).click();
    driver.findElement(By.cssSelector(".quick-reply")).click();
    driver.findElement(By.id("vc-input")).sendKeys("Main Menu");
    driver.findElement(By.cssSelector(".vciw-play3")).click();
    driver.findElement(By.id("vc-chat-button-close")).click();
    driver.findElement(By.id("vc-chat-button-open")).click();
    driver.close();
  }
}
