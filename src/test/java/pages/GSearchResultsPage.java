package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class GSearchResultsPage {

    private ElementsCollection getSearchResultsLinks(){
        return $$(".rc .r>a");
    }

    public String getFirstResultLink(){
        return getSearchResultsLinks().get(0).getAttribute("href");
    }



}
