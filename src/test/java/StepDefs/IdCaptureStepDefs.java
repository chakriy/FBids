package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static StepDefs.Hooks.ScShot;
import static StepDefs.Hooks.driver;

public class IdCaptureStepDefs
{

     //System.out.println("*******1");
// FacebookLoginPage flp = new FacebookLoginPage();
   // System.out.println("*******");
    @Given("^I Have a Chrome Browser Opened$")
    public void step() {
        driver.get("https://www.facebook.com/");
        ScShot.capScrSht(driver,"screenShot");
        System.out.println(" I am in FB GIVEN");
        // System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\Utilities\\chromedriver.exe");
        //driver = new ChromeDriver();
    }

    @When("^Open Facebook Login Page$")
    public void facebookWhen() {
        System.out.println(" I am in FB WHEN" + "\n");
//        driver.get("https://www.facebook.com//");
    }
    @And("^Capture all Id's in loginPage$")
    public void facebookAnd(){
        System.out.println("I'm in FB And");
//        WebElement eMailInput = driver.findElement(By.id("email"));
//        System.out.println(eMailInput.getTagName());
//        WebElement passInput = driver.findElement(By.id("pass"));
//        System.out.println(passInput.getTagName());
//        WebElement submitButton = driver.findElement(By.id("u_0_2"));
//        System.out.println(submitButton.getTagName());
//        //submitButton.click();
//        WebElement submit = driver.findElement(By.id("loginbutton"));
//        System.out.println(submit.getTagName());
//        //submit.click();
//        System.out.println("*****");
//        WebElement fNameInput = driver.findElement(By.id("u_0_l"));
//        System.out.println(fNameInput.getTagName());
//        WebElement sNameInput = driver.findElement(By.id("u_0_n"));
//        System.out.println(sNameInput.getTagName());
//        WebElement mNoInput = driver.findElement(By.id("u_0_q"));
//        System.out.println(mNoInput.getTagName());
//        WebElement nPwdInput = driver.findElement(By.id("u_0_x"));
//        System.out.println(nPwdInput.getTagName());
//        WebElement dayList = driver.findElement(By.id("day"));
//        System.out.println(dayList.getTagName());
//        WebElement monthList = driver.findElement(By.id("month"));
//        System.out.println(monthList.getTagName());
//        WebElement yearList = driver.findElement(By.id("year"));
//        System.out.println(yearList.getTagName());
//        WebElement radioButton1 = driver.findElement(By.id("u_0_9"));
//        System.out.println(radioButton1.getTagName());
//        WebElement radioButton2 = driver.findElement(By.id("u_0_a"));
//        System.out.println(radioButton2.getTagName());
//        WebElement signUpButton = driver.findElement(By.id("u_0_13"));
//        System.out.println(signUpButton.getTagName());
    }


    @Then("^Quit the Chrome Browser$")
    public void facebookThen() {
        System.out.println("I am in FB THEN" + "\n");
        System.out.println(driver.getTitle() + "\n");
        Assert.assertEquals(true, driver.getTitle().contains("Facebook"));
        FacebookLoginPage flp = new FacebookLoginPage();
       flp.enterEmail("panga.vl1@gmail.com");
         flp.pwd("Test@123!");
         flp.click1();

    }

}
