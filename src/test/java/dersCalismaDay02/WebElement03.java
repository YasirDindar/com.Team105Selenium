package dersCalismaDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement03 {
    public static void main(String[] args) {
        //Automation Exercise Link Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement>link= driver.findElements(By.tagName("a"));
        if (link.size()==147){
            System.out.println("Link testi PASSED");
        }else {
            System.out.println("Sayfada "+link.size()+" adet link vardir");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElement = driver.findElement(By.id("sale_image"));
        if (specialOfferElement.isDisplayed()){
            System.out.println("Special Offer testi PASSED");
        }else {
            System.out.println("Special Offer testi FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
