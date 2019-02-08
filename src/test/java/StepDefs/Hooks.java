package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Time;

public class Hooks {

   public static WebDriver driver;
   static CapScreenSht ScShot = new CapScreenSht();

    @Before
    public void beforeScenario()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\FBids\\src\\test\\Utilities\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void afterScenario(){


        //driver.quit();

    }

}
