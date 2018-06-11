import constants.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class SetupWizard extends AppConstants{


    public static void preschoolSetUpWizrd(ChromeDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-step=\"1\"]")));
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@data-step=\"1\"]").click();
        driver.findElementById("groupName").sendKeys(AppConstants.programmeName);
        driver.findElementByXPath("//*[@data-step=\"2\"]").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-step=\"3\"]")));
        driver.findElementByXPath("//*[@data-step=\"3\"]").click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inviteTeachers")));
//        driver.findElementById("inviteTeachers").sendKeys(teacherId1,Keys.ENTER,teacherId2,Keys.ENTER,teacherId3,Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-step=\"4\"]")));
        driver.findElementByXPath("//*[@data-step=\"4\"]").click();
    }


    public static void skipTour(ChromeDriver driver){
        driver.findElementByXPath("//*[@data-skipstep=\"1\"]").click();
    }



}
