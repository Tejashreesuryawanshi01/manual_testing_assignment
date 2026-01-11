
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignIn_Test {

    public static void main(String[] args)throws InterruptedException{

            System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\chromedriver\\chromedriver.exe"
            );

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.sovio.id/sign-in");

        driver.findElement(By.cssSelector("input[type='email']"))
                .sendKeys("demo@gmail.com");

        driver.findElement(By.cssSelector("input[type='password']"))
                .sendKeys("test123");

        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"))
                .click();

        Thread.sleep(15000);

        driver.quit();

    }
    }


