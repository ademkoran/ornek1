package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualityDemyNegatifLoginTesti {
    @Test
public void test01(){
    //Qualitydemy ana sayfaya gidin
    Driver.getDriver().get("https://www.qualitydemy.com");

    //ilk login linkine tiklayin
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    qualitydemyPage.ilkLoginLinki.click();

    //kullanici adi olarak selenium
    qualitydemyPage.emailKutusu.sendKeys("selenium");

    //password olarak heyecandir girin
    qualitydemyPage.password.sendKeys("heyecandir");

    //login butonuna tıklayin
    qualitydemyPage.loginButonu.submit();

    //giris yapılamadıgını test edin
    Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

    //sayfayi kapatin
    Driver.closeDriver();





}

}
