package dersCalismaDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethods {

    //1. Yeni bir package olusturalim : day01
    //2. Yeni bir class olusturalim : C03_GetMethods
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Sayfa basligi Amazon iceriyor, test PASSED");
        }else {
            System.out.println("Sayfa basligi Amazon icermiyor, test FAILED");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl ="amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
        }
        //8. Sayfa handle degerini yazdirin
        driver.getWindowHandle();
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String pageSource =driver.getPageSource();
        String expectedPageSource = "alisveris";
        if (pageSource.contains(expectedPageSource)){
            System.out.println("Page source testi PASSED");
        }else {
            System.out.println("Page source'da alisveris kelimesi icermiyor, test FAILED");
        }

        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }

}
