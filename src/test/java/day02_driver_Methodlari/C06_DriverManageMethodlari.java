package day02_driver_Methodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        implicitlyWait gittigimiz sayfa acilincaya veya aradigimiz webelement bulunucaya kadar
        driver'in bekleyebilecegi maximum sureyi belirler.
         */

        //bu dortlu her test method'unun basina yazilacak
        driver.close();
    }
}
