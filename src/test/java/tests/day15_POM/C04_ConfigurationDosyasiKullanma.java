package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

public class C04_ConfigurationDosyasiKullanma {

      /*
        POM  de hedef test classinda
        manuel olarak hicbir Test Datayi girmemektir

        Test Datalari
        1-Kullanacagımız Web Driver = Driver classindan dinamik olarak kullaniyoruz
        2-Locate = Locateleri pages sayfalarindan dinamik olark kullaniyoruz
        3_Kullanilan Url,aranan kelime,expected icerik,dogru kullanici adi,
        yanlis kullanici adi,yanlis sifre ..gibi datalar
         */

    @Test
    public void test01() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+Keys.ENTER);

        String expectedicerik=ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedicerik));

        Driver.closeDriver();






    }
}
