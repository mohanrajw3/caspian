import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AmazonMavicPro {

    public static void main(String[] args) {

        try {
            // WebDriver & Launch Browser
            System.setProperty("webdriver.chrome.driver", "P:/Softwares/chromedriver.exe");

            // Call Java Class to another Class
            //ClassName objName = new ClassName();
            ChromeDriver driver = new ChromeDriver();

            // Load URL
            driver.get("https://www.amazon.com/");

            // Maximize
            driver.manage().window().maximize();
            Thread.sleep(8000);
            // Enter the UserName
            driver.findElementById("twotabsearchtextbox").sendKeys("Dji Mavic Pro");

            driver.findElementByClassName("nav-search-submit").click();

            Thread.sleep(4000);

//            String titleAttribute = driver.findElement(By.xpath("//a[@id=’4ea70e73ff0cae84ee82de1f’]“)).getAttribute(“title”)








        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public void hitDownKey() {
    }
}
