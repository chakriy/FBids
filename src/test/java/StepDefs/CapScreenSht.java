package StepDefs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class CapScreenSht {
    public void capScrSht(WebDriver driver,String screenShotName)
    {

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(source,new File("./src/test/Screenshots/"+screenShotName+System.nanoTime()+".png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
