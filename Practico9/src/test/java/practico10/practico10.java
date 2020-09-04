package practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class practico10 {
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
    @Test //ejercicio1
    public void forgotAccount(){
        driver = abrirNavegador("https://www.facebook.com/");
        driver.findElement(By.linkText("Forgot account?")).click();
    }
    @Test //ejercicio 2
    public void forgotAccountPartialLink(){
        driver = abrirNavegador("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Forgot ")).click();
    }

    @Test //ejercicio 3
    public void customSalesforceLink(){
        driver = abrirNavegador("https://login.salesforce.com/");
        driver.findElement(By.linkText("Use Custom Domain")).click();
        driver.findElement(By.id("mydomain")).sendKeys("as");
        driver.findElement(By.id("mydomainContinue")).click();
        driver.navigate().back();
    }
  
}
