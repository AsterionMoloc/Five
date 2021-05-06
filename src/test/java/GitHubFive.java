import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class GitHubFive {
    @BeforeAll
    static void setup() {Configuration.startMaximized = true; }

    @Test
    public void   IssueSearch() {

        open("https://github.com/");
        $x("//input[@name='q']").click();
        $x("//input[@name='q']").val("eroshenkoam/allure-example").pressEnter();

        $("body").shouldHave(Condition.text("eroshenkoam/allure-example")).click();








        


    }
}
