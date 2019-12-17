package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private PageObjectManager pageObjectManager;

    public TestContext(){
        WebDriverManager webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(WebDriverManager.getDriver());
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}