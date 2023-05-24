package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {
    // 3 tane test methodu oluşturalım
    // 1. methodda amazona gidip URL'in amazon içerdiğini test edin
    // 2. methodda wise quarter ana sayfaya gidip title'ın wise quarter içerdiğini test edin
    // 3. methodda facebook ana sayfaya gidip, title'ın facebook içerdiğini test edin.
    // her methodda yeni driver oluşturup method sonunda driver ı kapatın

    @Test
    public void amazonTest() {
        // 1. methodda amazona gidip URL'in amazon içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }
    @Test
    public void wiseTest(){

        // 2. methodda wise quarter ana sayfaya gidip title'ın Wise Quarter içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik="Wise Quarter";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void facebookTest(){

        // 3. methodda facebook ana sayfaya gidip, title'ın Facebook içerdiğini test edin.
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedTitle="Facebook";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.closeDriver();




    }



}







