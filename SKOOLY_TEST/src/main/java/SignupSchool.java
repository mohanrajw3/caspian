import constants.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignupSchool extends AppConstants {

    public static void signUpSchool(ChromeDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get(signUpUrl);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("educationType")));
        Select eduType = new Select(driver.findElement(By.id("educationType")));
        eduType.selectByValue("K");
        driver.findElementById("regschoolname").sendKeys(schoolName);
        driver.findElementByXPath("//*[@data-action='reg-schoolname']").click();
        driver.findElementById("regemailId").sendKeys(userEmail);
        driver.findElementByXPath("//*[@data-action='reg-Emailid']").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNo")));
        driver.findElementById("phoneNo").sendKeys(phoneNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-action='reg-phonenumber']")));
        driver.findElementByXPath("//*[@data-action='reg-phonenumber']").click();
        Thread.sleep(1000);
        String opt1 = "$(\"[data-index=1]\").val(\"1\");";
        String opt2 = "$(\"[data-index=2]\").val(\"2\");";
        String opt3 = "$(\"[data-index=3]\").val(\"3\");";
        String opt4 = "$(\"[data-index=4]\").val(\"4\");";
        String opt5 = "$(\"[data-index=5]\").val(\"5\");";
        String opt6 = "$(\"[data-index=6]\").val(\"6\");";
        ((JavascriptExecutor) driver).executeScript(opt1);
        ((JavascriptExecutor) driver).executeScript(opt2);
        ((JavascriptExecutor) driver).executeScript(opt3);
        ((JavascriptExecutor) driver).executeScript(opt4);
        ((JavascriptExecutor) driver).executeScript(opt5);
        ((JavascriptExecutor) driver).executeScript(opt6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regOtpBtn")));
        driver.findElementById("regOtpBtn").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userpwd")));
        driver.findElementById("userpwd").sendKeys(password);
        driver.findElementById("passwordBtn").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        Select titles = new Select(driver.findElement(By.id("title")));
        titles.selectByValue(title);
        driver.findElementById("regusername").sendKeys(userName);
        String clickNext = "$('[data-action=\"reg-username\"]').trigger(\"click\");";
        ((JavascriptExecutor) driver).executeScript(clickNext);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmRegistration")));
        driver.findElementById("confirmRegistration").click();
    }
}
