package day02_driver_Methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        //pageSource'un MEOW icerdigini test edin

        String pageSource = driver.getPageSource();
        //amazona gidip ctrl+u ya tuslarsak pagesource'nu gorebiliriz. Ya da buraya da getirebiliriz.
        //pagesource==>sayfa kaynagi
        String expectedKelime="MEOW";

        if (pageSource.contains(expectedKelime)){
            System.out.println("page source testi PASSED");
        }else {
            System.out.println("page source testi FAILED, MEOW bulunamadi ");
        }
        driver.close();

    }
}
