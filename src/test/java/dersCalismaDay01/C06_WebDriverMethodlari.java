package dersCalismaDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_WebDriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("title testi FAILED");
            System.out.println(driver.getTitle());
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String expectedUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.contains(actualUrl)){
            System.out.println("url testi PASSED");
        }else {
            System.out.println("url testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String expextedTitle2 = "Amazon";
        String actualTitle2 = driver.getTitle();
        if (expextedTitle2.contains(actualTitle2)){
            System.out.println("title2 testi PASSED");
        }else {
            System.out.println("title2 testi FAILED");
            System.out.println(driver.getTitle());
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın
        String expectedUrl2 = "https://www.amazon.com/";
        String actualUrl2 = driver.getCurrentUrl();
        if (expectedUrl2.equals(actualUrl2)){
            System.out.println("url2 testi PASSED");
        }else {
            System.out.println("url2 testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        //11.Sayfayi kapatin
        driver.close();
    }
}
