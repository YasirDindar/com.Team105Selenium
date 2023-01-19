package dersCalismaDay03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPactAutomationExercuse02 {
    public static void main(String[] args) {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        //4. Click on 'Signup / Login' button
        //5. Verify 'Login to your account' is visible
        //6. Enter correct email address and password
        //7. Click 'login' button
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible

        //1. Tarayıcıyı başlatın
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anaSayfaTesti = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        if (anaSayfaTesti.isDisplayed()){
            System.out.println("anasayfa testi PASSED");
        }else {
            System.out.println("anasayfa testi FAILED");
        }
        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
        WebElement hesabinizaGirisYapinElementi = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (hesabinizaGirisYapinElementi.isDisplayed()){
            System.out.println("hesabiniza giris yapin yazisi elementi testi PASSED");
        }else {
            System.out.println("hesabiniza giris yapin testi FAILED");
        }
        //6. Doğru e-posta adresini ve şifreyi girin
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        email.sendKeys("yasir@sel.com");
        WebElement parola = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        parola.sendKeys("123456");
        //7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        WebElement oturumAcildi = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        if (oturumAcildi.isDisplayed()){
            System.out.println("oturum acildi testi PASSED");
        }else {
            System.out.println("oturum acildi testi FAILED");
        }
        //9. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        //10. 'HESAP SİLİNDİ!' görünür
        WebElement deleteTesti = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        if (deleteTesti.isDisplayed()){
            System.out.println("delete testi PASSED");
        }else {
            System.out.println("delete testi FAILED");
        }
        driver.close();
    }
}
