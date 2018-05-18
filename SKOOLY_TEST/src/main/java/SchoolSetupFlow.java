import constants.AppConstants;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class SchoolSetupFlow extends AppConstants{


    public static void main(String[] args) throws FileNotFoundException {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        Properties prop = new Properties();
        driver.manage().window().maximize();
        InputStream input = null;
        File file = new File("F:\\workspace\\skooly_worksapce\\skooly_testcase\\" +
                "SKOOLY_TEST\\src\\main\\resources\\properties\\skoolyapp.properties");
        input = new FileInputStream(file);

        try {

            readValuesFromPropertyFiles(prop, input);
            SignupSchool.signUpSchool(driver);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public void hitDownKey() {
    }


}
