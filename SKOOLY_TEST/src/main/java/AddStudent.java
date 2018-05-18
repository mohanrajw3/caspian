import constants.AppConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddStudent extends AppConstants{


    public static void addStudent(ChromeDriver driver) throws InterruptedException {
        driver.findElementById("addStudent").click();
        Thread.sleep(3000);
        driver.findElementById("studentId").sendKeys(studentid);
        driver.findElementById("studentName").sendKeys(studentName);
        driver.findElementByName("motherEmailId").sendKeys(motherEmail);
        driver.findElementByClassName("fstControls").click();
        driver.findElementByClassName("fstQueryInput").sendKeys("Hello World", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        driver.findElementByXPath("//span[text()='Add Student ']").click();
        String a = "window.open('"+baseUrl+"');";
        ((JavascriptExecutor) driver).executeScript(a);
    }


    //  public void hitDownKey(){
}

