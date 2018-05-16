import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddStudent {

    public static void main(String[] args) {

        try {
            // WebDriver & Launch Browser
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

            // Call Java Class to another Class
            //ClassName objName = new ClassName();
            ChromeDriver driver = new ChromeDriver();


            // Load URL
            driver.get("http://sit01.getskooly.com/skoolyweb/");

            // Maximize
            driver.manage().window().maximize();

            Thread.sleep(6000);
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


            driver.findElementByXPath("//span[text()='Students']").click();

            Thread.sleep(3000);
            driver.findElementById("addStudent").click();

            Thread.sleep(3000);
//            //TODO Select Class

            driver.findElementById("studentId").sendKeys("129091");

            driver.findElementById("studentName").sendKeys("Mohan Raj");

            driver.findElementByName("studentphonenumber").sendKeys("898218881");

            driver.findElementByName("studentEmailId").sendKeys("jkshagsa@mailinator.com");

            driver.findElementByName("motherEmailId").sendKeys("jksgsa@mailinator.com");




            driver.findElementByClassName("fstControls").click();
            driver.findElementByClassName("fstQueryInput").sendKeys("Hello World",Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);




            driver.findElementByXPath("//span[text()='Add Student ']").click();


//            Select oSelect = new Select(driver.findElement(By.id("addStudentGradeBox")));
//
//            oSelect.selectByVisibleText("Junior KG");
            String a = "window.open('http://sit01.getskooly.com/skoolyweb/');";
            ((JavascriptExecutor)driver).executeScript(a);












        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    //  public void hitDownKey(){
}

