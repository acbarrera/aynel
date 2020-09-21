package practico11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class spotify_test {
    private WebDriver driver;

    @Test
    public WebDriver setBaseURL(String url) {
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        //System.setProperty("webdriver.chrome.driver",chromeDriverURL);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
    /*Crear un método llamado spotifyByName
Ingresar al sitio: https://www.spotify.com/uy/signup/
Completar todos los campos con xpath name*/
}
