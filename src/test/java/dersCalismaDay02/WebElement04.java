package dersCalismaDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
        //2- Arama kutusuna “city bike” yazip aratin
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //3- Görüntülenen sonuçların sayısını yazdırın
       List<WebElement> list= driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        for (WebElement each:list) {
            System.out.println("listede yer alan bisiklet sayisi : "+each.getSize());
        }

       //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("//img[@data-image-index='2']")).click();
        driver.close();
    }
}
