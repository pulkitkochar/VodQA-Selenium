import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;


/**
 * Created with IntelliJ IDEA.
 * User: Raman
 * Date: 19/10/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("http://selenium-tester.herokuapp.com/users");
        driver.findElement(By.linkText("New User")).click();
        assertTrue("User name field is not displayed",driver.findElement(By.id("user_firstName")).isDisplayed());

//        driver.findElement(By.id("user_firstName")).sendKeys("Vishal");
//       driver.findElement(By.id("user_lastName")).sendKeys("Abrol");
//       driver.findElement(By.id("user_emailAddr")).sendKeys("vishalabrol@gmail.com");
//        driver.findElement(By.id("user_username")).sendKeys("abrolv");
//       driver.findElement(By.id("user_password")).sendKeys("computer");
//       driver.findElement(By.id("user_phone")).sendKeys("123456");
//       driver.findElement(By.xpath("//input[@id='user_address']")).sendKeys("Noida");
//       driver.findElement(By.id("user_postcode")).sendKeys("100001");
//       driver.findElement(By.id("user_dob_1i")).sendKeys("1981");
//       driver.findElement(By.id("user_dob_2i")).sendKeys("October");
//       driver.findElement(By.id("user_dob_3i")).sendKeys("10");
//       driver.findElement(By.id("user_sex")).sendKeys("M");
//       driver.findElement(By.id("user_tnc")).click();
//       driver.findElement(By.id("user_comments")).sendKeys("user comments goes here");
//       driver.findElement(By.name("commit")).click();
//        assertTrue("Username has already been taken",driver.findElement(By.id("error_explanation")).isDisplayed());

        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.FillForm("Vis","abr","abc@abc.com","abrv","tutitu","989898","10001","1981","October","04","comments are fine");
        regPage.register();
driver.quit();

}
    }
