package dersCalismaDay04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MavenClassWork3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        //3- cookies uyarisini kabul ederek kapatin
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        WebElement googleBasligiTesti = driver.findElement(By.xpath("//img[@alt='Google']"));
        if (googleBasligiTesti.isDisplayed()){
            System.out.println("google basligi testi PASSED");
        }else {
            System.out.println("google basligi testi FAILED");
        }
        //5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nutella");
        driver.findElement(By.xpath("(//input[@role='button'])[1]")).click();
        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucSayisi.getText());
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin

        //8- Sayfayi kapatin
        driver.close();
    }
}
