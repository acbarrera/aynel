package practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class docusign_test {
    private WebDriver driver;

    @Test
    public WebDriver abrirNavegador(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        //System.setProperty("webdriver.chrome.driver",chromeDriverURL);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
        //driver.close();
    }
    @Test
    public void completeDocusignRegistrationForm(){
        driver = abrirNavegador("https://go.docusign.com/o/trial/");
        driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Carlos");
        driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Alvarez");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ejemplo@test.te");
        driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("65895475");
        driver.findElement(By.xpath("//input[@name=\"title\"]")).sendKeys("QA");

        Select industry = new Select(driver.findElement(By.name("ds_industry")));
        industry.selectByValue("Technology");
    }

    @Test
    public void defaultxPath(){
        driver = abrirNavegador("https://go.docusign.com/o/trial/");

        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_First_Name\"]/input")).sendKeys("Carlos");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Last_Name\"]/input")).sendKeys("Alvarez");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Email\"]/input")).sendKeys("ejemplo@test.te");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Phone\"]/input")).sendKeys("88895475");
        driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Job_Title\"]/input")).sendKeys("QA");

        Select industry = new Select(driver.findElement(By.xpath("//*[@id=\"dsFormLabel_Industry\"]/select")));
        industry.selectByValue("Technology");

    }
}
