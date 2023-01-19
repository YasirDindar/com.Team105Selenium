package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        //windows olanlar sonuna .exe yazmali
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver.close();

        /*
        1-selenium jar dosyalarini ve chromedriver driver'ini manuel olarak sisteme
        tanitmis olduk.

        Eger ferifox veya safari ile calismamiz gerekse bu defa da onlarin driverlarini
        indirip manuel olarak  9.satirda o driverlari sisteme tanitmamiz gerekir

         2- 11.satirda chromeriver() constructor'ini kulanarak bir obje olusturduk.
         bu objeyi kullanmazsak bile bu satirdan dolayi bos bir driver acilir.

         3-  driver.get(url) driver'i yazdigimiz url'e goturur
         url yazarken www yazmasak calisir
         ancak https:// yazmasak method calismaz.

         4- threap.sleep sure veririz ve o sure bitince driver.close() ile chrome'u kapatir.

         */
    }
}
