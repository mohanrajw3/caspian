import constants.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddClassRoom extends AppConstants {

    public static void main(String[] args) {

        try {
            // WebDriver & Launch Browser
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");


            // Call Java Class to another Class
            //ClassName objName = new ClassName();
            ChromeDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 15);
            driver.get("http://sit01.getskooly.com/skoolyweb/");
            driver.manage().window().maximize();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            driver.findElementById("username").sendKeys("finoculus@mailinator.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Next')]")));
            driver.findElementByXPath("//span[contains(text(), 'Next')]").click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userpwd")));
            driver.findElementById("userpwd").sendKeys("Welcome@123");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-action='loginPwd']")));
            driver.findElementByXPath("//button[@data-action='loginPwd']").click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Classrooms']")));
            driver.findElementByXPath("//span[text()='Classrooms']").click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addClassRoom")));
            driver.findElementById("addClassRoom").click();
            Thread.sleep(3000);
            String classRoomnameScript = "$(\".bootstrap-tagsinput\").children().val(\"" + "My ClassRoom Spaced," + "\");";
            ((JavascriptExecutor) driver).executeScript(classRoomnameScript);
            driver.findElementByXPath("//button[@data-color=\"green\"]").click();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public void hitDownKey() {
    }
}
