import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddClassRoom {

    public static void main(String[] args) {

        try {
            // WebDriver & Launch Browser
            System.setProperty("webdriver.chrome.driver", "P:/Softwares/chromedriver.exe");

            // Call Java Class to another Class
            //ClassName objName = new ClassName();
            ChromeDriver driver = new ChromeDriver();

            // Load URL
            driver.get("http://sit2.skooly.us/skoolyweb/");

            // Maximize
            driver.manage().window().maximize();
            Thread.sleep(8000);
            // Enter the UserName
            driver.findElementById("username").sendKeys("finoculus@mailinator.com");

            // Click on the Next button
            driver.findElementByXPath("//span[contains(text(), 'Next')]").click();

            // used Thread.sleep for the waiting purpose
            Thread.sleep(3000);

            // Enter the Password
            driver.findElementById("userpwd").sendKeys("Welcome@123");

            // used Thread.sleep for the waiting purpose
            Thread.sleep(3000);

            // Finding the element using Xpath for Next button
            driver.findElementByXPath("//button[@data-action='loginPwd']").click();

            // used Thread.sleep for the waiting purpose
            Thread.sleep(3000);


            driver.findElementByXPath("//span[text()='Classrooms']").click();

            Thread.sleep(3000);
            driver.findElementById("addClassRoom").click();

            Thread.sleep(3000);


            driver.findElementByXPath("//*[@data-role='tagsinput']").click();
            driver.findElementByXPath("//div@").sendKeys(Keys.ENTER, "GRADE A", Keys.ENTER, "GRADE B", Keys.ENTER, "GRADE C", Keys.ENTER);





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public void hitDownKey() {
    }
}
