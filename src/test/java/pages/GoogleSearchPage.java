package pages;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {

    public GSearchResultsPage search(String query){
        $("[name='q']").setValue(query).pressEnter();
        return new GSearchResultsPage();
    }

}
