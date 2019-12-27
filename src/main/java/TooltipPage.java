import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class TooltipPage
{
    public static void main(String args[]) throws IOException
    {
        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//img[@alt=\"tooltip\"]")).click();
        String toolTip=driver.findElement(By.xpath("//input[@id=\"age\"]")).getAttribute("title");
        System.out.println(toolTip);

    }
}
