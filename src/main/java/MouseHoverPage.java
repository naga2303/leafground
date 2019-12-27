import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;

public class MouseHoverPage
{
    public static void main(String args[]) throws IOException
    {
        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//img[@alt=\"mouseover\"]")).click();

        //Printing all Links
        Actions act=new Actions(driver);
        WebElement TSCourse=driver.findElement(By.xpath("//a[@class=\"btnMouse\"]"));
        act.moveToElement(TSCourse).perform();

        List<WebElement> linksPring=driver.findElements(By.xpath("//a[@class=\"btnMouse\"]/following::ul/li"));
                for(WebElement linkName:linksPring)
    {
        System.out.println(linkName.getText());
            if(linkName.getText().equals("RPA"))
            {
                linkName.click();
                break;
            }

    }
    }
}
