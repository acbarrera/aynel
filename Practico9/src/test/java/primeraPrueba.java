
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class primeraPrueba {

    @Test //ejercicio1
    public void abrirNavegador(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        //System.setProperty("webdriver.chrome.driver",chromeDriverURL);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //driver.close();
    }
    @Test  //ejercicio2
    public void mostrarTitulo(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println("**********titulo**************");
        System.out.println(driver.getTitle());
    }
    @Test //ejercicio3
    public void bbcMundo(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listP = driver.findElements(By.tagName("p"));
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));

        System.out.println("******Cantidad de etiquetas <h1> en "+ driver.getTitle()+"**********");
        System.out.println(listH1.size());
        System.out.println("****** Cantidad de etiquetas <p> en "+ driver.getTitle()+" **********");
        System.out.println(listP.size());
        System.out.println("****** Cantidad de etiquetas <h2> en "+ driver.getTitle()+" **********");
        System.out.println(listH2.size());
        System.out.println("****** Tres titulos <h2> de "+ driver.getTitle()+" **********");
        System.out.println(listH2.get(5));
        System.out.println(listH2.get(1));
        System.out.println(listH2.get(2));


        driver.close();
    }
}
