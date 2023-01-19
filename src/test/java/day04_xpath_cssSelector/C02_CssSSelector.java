package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedBaslik = "Spend less";
        String actualBaslik = driver.getTitle();
        if (expectedBaslik.contains(actualBaslik)){
            System.out.println("sayfa basligi testi PASSED");
        }else {
            System.out.println("sayfa basligi testi FAILED");
            System.out.println(driver.getTitle());
        }
        //6- Gift Cards sekmesine basin
        Thread.sleep(3000);
        driver.findElement(By.linkText("Gift Cards")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcretElementi = driver.findElement(By.xpath("//span[text()='$25.00']"));
        String expectedUcret = "$25.00";
        String actualUcretYazisi = urunUcretElementi.getText();
        if (expectedUcret.equals(actualUcretYazisi)){
            System.out.println("gift cards ucret testi PASSED");
        }else {
            System.out.println("gift cards ucret testi FAILED");
        }
        System.out.println(urunUcretElementi.getText());
        Thread.sleep(3000);
        driver.close();
        //11-Sayfayi kapatin
    }
}
