package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        ///* ...Exercise3...
        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //    fill the firstname
        driver.findElement(By.xpath("//a[text()='Tamam']")).click();
       WebElement firsname= driver.findElement(By.xpath("//input[@name='firstname']"));
       firsname.sendKeys("Yasir");
        //    fill the lastname
        WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("dindar");
        //    check the gender
      WebElement genderRadioButton= driver.findElement(By.xpath("//input[@id='sex-0']"));
       genderRadioButton.click();
       genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        //    check the experience
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        //    fill the date
        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("13.03.1995");
        //    choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("(//input[@name='tool'])[3]")).click();
        //    choose your continent -> Europa
        WebElement contient = driver.findElement(By.xpath("//option[text()='Europe']"));
        //    choose your command  -> Browser Commands
        WebElement command = driver.findElement(By.xpath("//option[text()='Browser Commands']"));
        //    click submit button
        driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        //
        driver.close();

    }
}
