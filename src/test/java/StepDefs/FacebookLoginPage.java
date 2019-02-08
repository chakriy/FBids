package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import static StepDefs.Hooks.ScShot;
import static StepDefs.Hooks.driver;

public class FacebookLoginPage
{

    WebElement eMailInput = driver.findElement(By.xpath("//input[@id='email']"));
   WebElement passInput = driver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
    WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
//    //WebElement submit = driver.findElement(By.id("loginbutton"));
   WebElement fNameInput = driver.findElement(By.id("u_0_l"));
   WebElement sNameInput = driver.findElement(By.id("u_0_n"));
//    WebElement mNoInput = driver.findElement(By.id("u_0_q"));
//    WebElement nPwdInput = driver.findElement(By.id("u_0_x"));
//    WebElement dayList = driver.findElement(By.id("day"));
//    WebElement monthList = driver.findElement(By.id("month"));
//    WebElement yearList = driver.findElement(By.id("year"));
      WebElement radioButton1 = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
      WebElement dayOption = driver.findElement(By.xpath("//select[@id='day']"));
      WebElement monthOption = driver.findElement(By.xpath("//select[@id='month']"));
      WebElement yearOption = driver.findElement(By.xpath("//select[@id='year']"));
      Select dayDropDown = new Select(dayOption);
      Select monthDropDown = new Select(monthOption);
      Select yearDropDown = new Select(yearOption);





//    WebElement radioButton2 = driver.findElement(By.id("//*[@id="day"]u_0_a"));
//    WebElement signUpButton = driver.findElement(By.id("u_0_13"));
      WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));

    public void enterEmail(String S) {
        eMailInput.sendKeys(S);
        ScShot.capScrSht(driver,"screenShot");


//       dayDropDown.deselectAll();
//       monthDropDown.deselectAll();
//       yearDropDown.deselectAll();


    }
    public void checkDropDown(int i,String S,String D) {

        dayDropDown.selectByIndex(i);
        monthDropDown.selectByValue(S);
        yearDropDown.selectByVisibleText(D);
    }
    public void myActions(WebDriver driver){

        Actions actions = new Actions(driver);
        Action builder = actions
                .moveToElement(fNameInput)
                .click()
                .sendKeys("BALA")
                .sendKeys(Keys.TAB)
                .sendKeys("JAKKA")
                .sendKeys(Keys.TAB)
                .sendKeys("07710234714")
                .sendKeys(Keys.TAB)
                .sendKeys("Cricket1")

                .build();
        builder.perform();

    }



    public void pwd(String S){
        passInput.sendKeys(S);
        ScShot.capScrSht(driver,"screenShot");
    }
    public void click1(){
       // submitButton.click();
        //link.click();
        driver.manage().window().maximize();
        ScShot.capScrSht(driver,"screenShot");
       // driver.navigate().back();
        ScShot.capScrSht(driver,"screenShot");
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));
        System.out.println("All Done");
    }

}
