package dersCalismaDay04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MavenClassWork2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@class='signin btn btn-info']")).click();
        //3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //6. once back yapin sonra online banking'e tiklayip Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement miktar = driver.findElement(By.xpath("//input[@class='span1']"));
        miktar.sendKeys("250");
        //8. tarih kismina “2020-09-10” yazdirin
        WebElement tarih = driver.findElement(By.xpath("//input[@class='span4 hasDatepicker']"));
        tarih.sendKeys("2020-09-10");
        //9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement succesfullyTesti = driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        if (succesfullyTesti.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        driver.close();
    }
}
