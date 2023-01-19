package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
    /*
      Q1 altında yeni bir sınıf oluşturun ana yöntem oluşturun
    Yolu Ayarla
    krom sürücüsü oluştur
    Pencereyi büyüt
    Google ana sayfasını açın https://www.google.com/.
    Aynı sınıfta Amazon ana sayfasına gidin https://www.amazon.com/
    Google'a geri git
    Amazon'a ilerleyin
    Sayfayı yenileyin
    Tarayıcıyı Kapat/Çık
    Ve son adım: konsolda "All Ok" yazdırın
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com/.");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        System.out.println("All ok");
    }
}
