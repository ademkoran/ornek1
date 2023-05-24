package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualityDemyLoginTesti {


    @Test
    public void test01() {

        // QUALITYDEMY ANA SAYFAYA GIDIN

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();


        // gecerli username ve sifre yi ilgili kutulara yazin

        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.password.sendKeys(ConfigReader.getProperty("qdgecerliPassword"));

        // login butonuna basin

        qualitydemyPage.loginButonu.submit();

        // basarili olarak giris yapildigini test edin

        Assert.assertTrue(qualitydemyPage.basariligiris.isDisplayed());

        // sayfayi kapatin

        Driver.closeDriver();

    }

}
