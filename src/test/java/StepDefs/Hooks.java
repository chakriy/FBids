package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

   public static WebDriver driver;
   static CapScreenSht ScShot = new CapScreenSht();
    static int x = 0;
    @Before
    public void beforeScenario()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\FBids\\src\\test\\Utilities\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void afterScenario(){
        driver.quit();

    }

}
