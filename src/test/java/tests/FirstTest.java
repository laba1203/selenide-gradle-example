package tests;

import com.codeborne.selenide.junit.ScreenShooter;

import org.junit.*;
import pages.GoogleSearchPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class FirstTest {

    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @BeforeClass
    public static void openGooglePage(){
        timeout = 10000;
        browser = "chrome";
        browserSize = "780x950";

        open("https://google.com");

    }

    @Test
    public void openGoogle(){
        String query = "github official site";

        String firstLink =
                new GoogleSearchPage()
                .search(query)
                .getFirstResultLink();

        Assert.assertEquals("Incorrect link in the first search result for query '"+query+"'",
                "https://github.com/",
                firstLink
        );

    }

    @AfterClass
    public static void closeDriver(){
        closeWebDriver();
    }

}
