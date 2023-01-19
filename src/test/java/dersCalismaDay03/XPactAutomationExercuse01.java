package dersCalismaDay03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPactAutomationExercuse01 {
    public static void main(String[] args) throws InterruptedException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        //4. Click on 'Signup / Login' button
        //5. Verify 'New User Signup!' is visible
        //6. Enter name and email address
        //7. Click 'Signup' button
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button



        // 1. Tarayıcıyı başlatın

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anaSayfaKontrolu = driver.findElement(By.xpath("//div[@class='left-sidebar']"));
        if (anaSayfaKontrolu.isDisplayed()){
            System.out.println("ana sayfa testi PASSED");
        }else {
            System.out.println("ana sayfa testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }
        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        WebElement kullaniciKaydiTesti = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        if (kullaniciKaydiTesti.isDisplayed()){
            System.out.println("kullanici kaydi testi PASSED");
        }else {
            System.out.println("kullanici kaydi testi FAILED");
        }
        //6. Adı ve e-posta adresini girin
        WebElement isim=driver.findElement(By.xpath("//input[@type='text']"));
        isim.sendKeys("yasir");
        WebElement emailAdres=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        emailAdres.sendKeys("yasir@sel.com");

        //7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
        //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
        WebElement enterAccountInformationTesti = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        if (enterAccountInformationTesti.isDisplayed()){
            System.out.println("enter account information testi PASSED");
        }else {
            System.out.println("enter account information testi FAILED");
        }
        //9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
        driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
       // WebElement isim2=driver.findElement(By.xpath("//input[@id='name']"));
        //isim2.sendKeys("yasir");
        //WebElement emailAdres2 = driver.findElement(By.xpath("//input[@id='email']"));
        //emailAdres2.sendKeys("yasir@sel.com");
        WebElement parola = driver.findElement(By.xpath("//input[@type='password']"));
        parola.sendKeys("123456");

        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        WebElement isim3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        isim3.sendKeys("yasir");
        WebElement soyad = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        soyad.sendKeys("dindar");
        WebElement adress = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        adress.sendKeys("konya");
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        country.sendKeys("India");
        WebElement state = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        state.sendKeys("y");
        WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
        city.sendKeys("a");
        WebElement zipCode = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        zipCode.sendKeys("2");
        WebElement number = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
        number.sendKeys("122");
        //13. 'Hesap Oluştur düğmesini' tıklayın
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //14. 'HESAP OLUŞTURULDU!' görünür
        WebElement accountCreatedTesti = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        if (accountCreatedTesti.isDisplayed()){
            System.out.println("account created testi PASSED");
        }else {
            System.out.println("account created testi FAILED");
        }
        //15. 'Devam Et' düğmesini tıklayın
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        //16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        WebElement kullaniciAdiIleGirisYapildi = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        if (kullaniciAdiIleGirisYapildi.isDisplayed()){
            System.out.println("kullanici adi ile giris yapildi testi PASSED");
        }else {
            System.out.println("kullanici adi ile giris yapildi testi FAILED");
        }
        //17. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
        WebElement hesapDeleteTesti = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        if (hesapDeleteTesti.isDisplayed()){
            System.out.println("hesap silindi testi PASSED");
        }else {
            System.out.println("hesap silindi testi FAILED");
        }
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
