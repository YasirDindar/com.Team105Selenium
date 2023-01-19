package day02_driver_Methodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari" +driver.manage().window().getSize());//(1382, 744)
        System.out.println("maximize window konum" +driver.manage().window().getPosition());//maximize window konum(-8, -8)

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscrean window boyutlari"+driver.manage().window().getSize());//(1366, 768)
        System.out.println("fullscrean window konumu"+driver.manage().window().getPosition());//fullscrean window konumu(0, 0)

        Thread.sleep(3000);

        //brower'i istedigimiz konuma ve boyuta getirelim

        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));

        Thread.sleep(3000);
        driver.close();
    }
}
