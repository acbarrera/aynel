
import org.testng.annotations.Test;
import utilities.GetProperties;

public class primeraPrueba {

    @Test
    public void abrirBrowser(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
