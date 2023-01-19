package dersCalismaDay03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPactSoruCozumu2 {
    public static void main(String[] args) {

        //1- bir class olusturun
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedBaslik = "Spend less";
        String actualBaslik = driver.getTitle();
        if (expectedBaslik.contains(actualBaslik)){
            System.out.println("baslik testi PASSED");
        }else {
            System.out.println("baslik testi FAILED");
            System.out.println(driver.getTitle());
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@id='acs-product-block-0'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@value='25']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("(//span[text()='$25.00'])[1]"));
        String expectedUrunUcreti ="$25.00";
        String actualUrunUcreti = urunUcreti.getText();
        if (expectedUrunUcreti.equals(actualUrunUcreti)){
            System.out.println("urun ucreti testi PASSED");
        }else {
            System.out.println("Urun ucreti testi FAILED");
            System.out.println(urunUcreti.getText());
        }
        //11-Sayfayi kapatin
        driver.close();
    }
}
