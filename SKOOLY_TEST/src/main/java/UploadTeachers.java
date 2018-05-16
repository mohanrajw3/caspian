import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadTeachers {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "P:/Softwares/chromedriver.exe");

            ChromeDriver driver = new ChromeDriver();


            driver.get("http://sit2.skooly.us/skoolyweb/");

            driver.manage().window().maximize();
            Thread.sleep(8000);
            driver.findElementById("username").sendKeys("finoculus@mailinator.com");

            driver.findElementByXPath("//span[contains(text(), 'Next')]").click();

            Thread.sleep(3000);

            driver.findElementById("userpwd").sendKeys("Welcome@123");

            Thread.sleep(3000);

            driver.findElementByXPath("//button[@data-action='loginPwd']").click();

            Thread.sleep(3000);

            driver.findElementByXPath("//span[text()='Teachers']").click();

            Thread.sleep(3000);
            driver.findElementById("addTeacher").click();

            Thread.sleep(3000);


            WebElement uploadElement = driver.findElement(By.id("teachers-excel"));
            uploadElement.sendKeys("C:\\Users\\Raj\\Downloads\\teacher_upload.xlsx");

            Thread.sleep(3000);
            driver.findElement(By.id("uploadExcel")).click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public void hitDownKey() {
    }
}
