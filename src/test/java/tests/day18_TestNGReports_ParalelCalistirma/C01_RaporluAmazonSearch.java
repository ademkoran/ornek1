package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_RaporluAmazonSearch extends TestBaseRapor {
    @Test
    public void test01() throws IOException {
        extentTest=extentReports.createTest("Amzon arama testi",
                                  "kullanici istedigi kelimeyi aratabilmeli");

        //amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon anasayfa gider");

        //nutella icin arama yapşin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.AramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        extentTest.info("Arama kutusuna belirlenen aranacak kelime yazar ve aratir");

        //arama sonuclarinin nutella icerdigini test edin

        String actualSonucyazisi=amazonPage.aramaSonucuEementi.getText();
        String expectedIcerik=ConfigReader.getProperty("amazonExpectedIcerik");
        Assert.assertTrue(actualSonucyazisi.contains(expectedIcerik));
        extentTest.pass("belirlenen aranacak kelime aratildiginda,arama sonucunda expected icerik olarak yazdirir");
        Driver.closeDriver();
    }
}
