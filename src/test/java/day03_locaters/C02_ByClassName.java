package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Amazon'a gidip nutella icin arama yapin
        ilk sayfada cikan urunlerin icerisinde
        en yuksek fiyati bulun.
         */

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        List<WebElement>fiyatlarListesi = driver.findElements(By.className("a-price-whole"));

        System.out.println(fiyatlarListesi);
        //WebElements bir obje oldugundan direk yazdirilamaz.

        //bunun icin foraeach loop kullanilarak her bir web element uzerindeki yazilari tek tek yazdirmaliyiz


        for (WebElement each:fiyatlarListesi) {
            System.out.print(each.getText()+" ");//12 39 45 11 26 34 52 12 12 6 12 11 9 11 9 9 5 12 12 24 29 18 13
        }

        String fiyatStr ;
        Integer fiyatInt;
        Integer maxFiyat=0;
        for (WebElement each:fiyatlarListesi) {
            fiyatStr= each.getText();
            fiyatInt= Integer.parseInt(fiyatStr);

            if (fiyatInt>maxFiyat){
                maxFiyat=fiyatInt;
            }
        }
        System.out.println("");
        System.out.println("En yuksek urun fiyati : "+maxFiyat);

        /*
         en yuksek fiyati bulabilmemiz icin java bilgimizi kullanmaliyiz
         1- web elementlerden getText ile fiyati String olarak alin.
         2- string fiyati kiyaslama yapabilmek icin Integer'a cevirin
         3- en yuksek fiyati bulup yazdirin
         */


        Thread.sleep(3000);
        driver.close();
    }
}
