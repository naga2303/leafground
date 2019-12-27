import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverTest
{
    public static void main(String args[]) throws IOException
    {
        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
        WebDriver driver;
        //driver=new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get("http://www.leafground.com/");

    }
}
