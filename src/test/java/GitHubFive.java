import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubFive {
    @BeforeAll
    static void setup() {Configuration.startMaximized = true; }

    @Test
    public void   IssueSearch() {

        //Открыть гитхаб
        open("https://github.com/");

        //В поисковой строке ввести название репозитория и нажать энтер
        $x("//input[@name='q']").click();
        $x("//input[@name='q']").val("AsterionMoloc/Five").pressEnter();

        //В результатах поиска нажать на ссылку репозитория
        $(By.linkText("AsterionMoloc/Five")).click();

        //В репозитории найти вкладку Issues и нажать на нее
        $x("//span[@data-content='Issues']").click();

        //Убедиться в том. что название соответствует IssueHW
        $x("//div[@id='issue_1']").shouldHave(text("IssueHW"));


    }
}
