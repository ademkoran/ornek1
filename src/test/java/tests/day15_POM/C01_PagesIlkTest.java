package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.io.IOException;

public class C01_PagesIlkTest {


    @Test
    public void amazonTest() throws IOException {
        // amazon anasayfaya gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // Nutella icin arama yapalim
        // Arama kutusunun locate'i pages sayfasinda
        // POM'de pages sayfasindaki locate'lere erismek icin
        // pages sayfalarindan bir obje olusturulur.

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclarin Nutella icerdigini test edelim
        String expectedicerik = "Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedicerik));

        // sayfayi kapatalim
        Driver.closeDriver();













    }
}