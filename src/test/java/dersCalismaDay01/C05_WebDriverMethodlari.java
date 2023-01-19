package dersCalismaDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_WebDriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        driver.get("https://www.facebook.com");
        String expectedTitle="facebook";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED");
            System.out.println(driver.getTitle());
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitle2 = "Walmart.com";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle2.contains(actualTitle2)){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("title testi FAILED");
            System.out.println(driver.getTitle());
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        //9.Browser’i kapatin
        driver.close();
    }
}
