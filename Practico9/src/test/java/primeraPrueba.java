
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.security.Key;
import java.security.KeyStore;
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
    @Test //ejercicio3  falta imprimir
    public void bbcMundo(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listP = driver.findElements(By.tagName("p"));
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));
        List<WebElement> listH3 = driver.findElements(By.tagName("h3"));

        System.out.println("******Cantidad de etiquetas <h1> en "+ driver.getTitle()+"**********");
        System.out.println(listH1.size());

        System.out.println("****** Cantidad de etiquetas <p> en "+ driver.getTitle()+" **********");
        System.out.println(listP.size());

        System.out.println("****** Cantidad de etiquetas <h2> en "+ driver.getTitle()+" **********");
        System.out.println(listH2.size());

        System.out.println("****** Tres titulos <h2> de: "+ driver.getTitle()+" **********");
        for (int i =0; i <= 2; i++){
            System.out.println(listH2.get(i));
        }

        System.out.println("******Cantidad de etiquetas <h3> en "+ driver.getTitle()+"**********");
        System.out.println(listH3.size());
        System.out.println("****** Tres titulos <h3> de: "+ driver.getTitle()+" **********");
        for (int i =0; i <= 2; i++){
            System.out.println(listH3.get(i));
        }
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.close();
    }
    @Test //ejercio 4
    public void bbcMundoLinks(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        System.out.println("***************Todos los Likns del sitio: "+driver.getTitle()+"******************");
        List<WebElement> listLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : listLinks){
            System.out.println(link.getText());
        }

        List<WebElement> listaP = driver.findElements(By.tagName("p"));
        System.out.println("***************Lista de etiquetas <p> en el sitio*******************");
        System.out.println(listaP.size());

        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.close();
    }
    @Test //ejercicio 5
    public void bbcMundoListas(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

         List<WebElement> listaLi = driver.findElements(By.tagName("li"));
         for (WebElement li: listaLi){
             System.out.println(li.getText());
         }
         List<WebElement> listaP = driver.findElements(By.tagName("p"));
         for (WebElement p:listaP){
             System.out.println(p.getText());
         }

         driver.manage().window().maximize();
         driver.navigate().refresh();
         driver.close();
    }
    @Test //ejercicio 6
    public void getTitleTest(){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        if (title == "Google")
             System.out.println("Prueba pasada");
        else
            System.out.println("Prueba Fallida");

        driver.close();
    }
    //ajercicio 9
    private WebDriver getGoolgleDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\aynel\\Practico9\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        return driver;
    }
    @Test // ejercicio 10
    public void searchInGoogle (){
        WebDriver driver = getGoolgleDriver("https://www.google.com/");
        driver.findElement(By.cssSelector("[name='q'")).sendKeys("WebElement" + Keys.ENTER);
    }
    @Test //ejercicio 11
    public void searchInGoogleAndGoBack(){
        WebDriver driver = getGoolgleDriver("https://www.google.com/");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("[name='q'")).sendKeys("selenium driver" + Keys.ENTER);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
    @Test //ejercicio 12
    public void getBrowserSizes(){
        WebDriver driver = getGoolgleDriver("https://www.facebook.com/");
        System.out.println(driver.manage().window().getSize().height);
        System.out.println(driver.manage().window().getSize().width);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize().height);
        System.out.println(driver.manage().window().getSize().width);
    }
    
}
