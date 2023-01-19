package dersCalismaDay04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MavenClassWork4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//input[@ placeholder='Username']")).sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@ placeholder='Password']")).sendKeys("secret_sauce");
        //4. Login tusuna basin
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun = driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[1]"));
        ilkUrun.click();
        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement seciliUrun=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));

        if (seciliUrun.isDisplayed()){
            System.out.println("ilk urun sepete eklenmis PASSED");

        }else {
            System.out.println("ilk urun sepete eklenmemis FAILED");
        }
        //9. Sayfayi kapatin
        driver.close();
    }
}
