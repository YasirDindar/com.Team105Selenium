package dersCalismaDay03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPactSoruCozumu1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonuTesti =driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonuTesti.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else {
            System.out.println("delete butonu testi FAILED");
        }
        //4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonuTesti.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementsTesti = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElementsTesti.isDisplayed()){
            System.out.println("add remove elements testi PASSED");
        }else {
            System.out.println("add remove elements testi FAILED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
