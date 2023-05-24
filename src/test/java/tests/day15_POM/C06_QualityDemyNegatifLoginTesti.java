package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualityDemyNegatifLoginTesti {
    @Test
    public void gecersizIsimSifreTest(){

        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        //login linkine tiklayin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        //gecersiz username ve gecerli password yazin

        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdgecersizUsername"));
        qualitydemyPage.password.sendKeys(ConfigReader.getProperty("qdgecerlipassword"));

        //login butonuna tıklayin

        qualitydemyPage.loginButonu.submit();

        //giris yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();


    }
    @Test(groups = "smoke")
    public void gecersizIsimTest(){

        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        //login linkine tiklayin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        //gecersiz username ve gecerli password yazin

        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdgecersizUsername"));
        qualitydemyPage.password.sendKeys(ConfigReader.getProperty("qdgecerlipassword"));

        //login butonuna tıklayin

        qualitydemyPage.loginButonu.submit();

        //giris yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();


    }


}
