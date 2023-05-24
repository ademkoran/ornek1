package tests.day15_POM;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest {
    @Test(groups ="smoke" )
    public void test01() throws InterruptedException {
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage=new QualitydemyPage();

        // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();



        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.password.sendKeys("Nevzat152032");


        // login butonuna basin


        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapildigini test edin

        Assert.assertTrue(qualitydemyPage.basariligiris.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();




    }
}