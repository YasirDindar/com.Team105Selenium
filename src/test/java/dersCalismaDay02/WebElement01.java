package dersCalismaDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement01 {
    public static void main(String[] args) throws InterruptedException {
        //Amazon Arama Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");
        //3- amazon arama kutusunu locate edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //4- arama kutusuna “Nutella” yazdirin
        aramaKutusu.sendKeys("Nutella");
        //5- arama islemini yapabilmek icin ENTER tusuna basin
        aramaKutusu.submit();
        Thread.sleep(3000);
        driver.close();
    }
}
