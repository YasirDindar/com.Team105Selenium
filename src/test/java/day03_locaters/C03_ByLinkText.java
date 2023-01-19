package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        /*
        Amazon anasayfaya gidin
        gift cards linkine tiklayin.
        gift cards sayfasina gittigini test edin.
         */
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //WebElement giftCardLinki = driver.findElement(By.linkText("Gift Cards"));
        Thread.sleep(4000);
        WebElement giftCardLinki= driver.findElement(By.partialLinkText("Gift"));
        giftCardLinki.click();

        //istenen sayfaya gittigini text etmek icin title'in Gift Cards icerdigini testedebiliriz.

        String expectedKelime = "Gift Cards";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift cards testi PASSED");
        }else {
            System.out.println("Gift cards testi FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
