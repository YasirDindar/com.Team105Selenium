package dersCalismaDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement02 {
    public static void main(String[] args) {
        //Automation Exercise Category Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        WebElement categoryElementi = driver.findElement(By.id("accordian"));

        //4- Category bolumunde 3 element oldugunu test edin
        if (categoryElementi.isDisplayed()){
            System.out.println("category testi PASSED");
        }else {
            System.out.println("category testi FAILED");
        }
        //5- Category isimlerini yazdirin
        System.out.println(categoryElementi.getText());
        //6- Sayfayi kapatin
        driver.close();
    }
}
