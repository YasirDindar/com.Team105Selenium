package dersCalismaDay04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MavenClassWork {
    public static void main(String[] args) {
        //Class Work Amazon Search Test
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones", Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim

        WebElement sonucSayisi = driver.findElement(By.xpath("//span[text()='1-16 of 247 results for']"));
        System.out.println(sonucSayisi.getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        //6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> tumBasliklar = driver.findElements(By.xpath("//span[@class='a-list-item']"));
        for (WebElement each:tumBasliklar
             ) {
            System.out.println(each.getText());
        }
        driver.close();

    }
}
