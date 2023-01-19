package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteElementi = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteElementi.isDisplayed()){
            System.out.println("delete testi PASSED");
        }else {
            System.out.println("delete testi FAILED");
        }
        //4- Delete tusuna basin
        deleteElementi.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("add remove yazi testi PASSED");
        }else {
            System.out.println("add remove yazi testi FAILED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
