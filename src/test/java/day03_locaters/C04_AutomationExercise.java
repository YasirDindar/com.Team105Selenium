package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExercise {
    public static void main(String[] args) {
       // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
       // 3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        if (linkListesi.size()==147){
            System.out.println("Link listesi testi PASSED");
        }else {
            System.out.println("Sayfada+ "+linkListesi.size()+" adet link var, test FAILED");
        }
       // 4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();
       // 5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("SpeciolOffer testi PASSED");
        }else {
            System.out.println("SpeciolOffer testi FAILED");
        }
        /*
        NoSuchElementException driver findElement ile aradigi bir elementi
        bulamazsa olusur.
         */
       // 6- Sayfayi kapatin
        driver.close();
    }
}
