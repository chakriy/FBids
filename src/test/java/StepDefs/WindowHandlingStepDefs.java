package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static StepDefs.Hooks.driver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


public class WindowHandlingStepDefs {

    Set<String> tabs;
    ArrayList<String> tabs2,tabs3;
     @Given("^Opening the Naukri Homepage$")
            public void step1()
     {
         driver.get("https://www.naukri.com");
         String s = driver.getWindowHandle();
         tabs = driver.getWindowHandles();
         for (String h : tabs)
         {
             if (h.equalsIgnoreCase(s))
             {
                 driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
                 tabs.add(driver.getWindowHandle());
             }
             else
                 {

                 driver.switchTo().window(h);
                 driver.close();
             }
         }
     }
            @When("^Opening multiple pages from Naukri Homepage$")
            public void step2 () throws InterruptedException
            {
                tabs2 = new ArrayList<String> (driver.getWindowHandles());
                Thread.sleep(3000);
                driver.switchTo().window(tabs2.get(0));
                driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a/div")).click();
                tabs = driver.getWindowHandles();
                tabs2.add(driver.getWindowHandle());
                tabs3 = new ArrayList<String> (driver.getWindowHandles());
                System.out.println("Set WindowHandles are "+tabs);
                System.out.println("Hi");
                System.out.println("Chakri");



                System.out.println("List WindowHandles after adding are "+tabs2);
                System.out.println("List WindowHandles are "+tabs3);
     }

            @Then("^Closing All Windows$")
            public void step3 () throws InterruptedException {
                for(String h: tabs3)
                {
                    driver.switchTo().window(h);
                    Thread.sleep(5000);
                    driver.close();
                }

            }


        }