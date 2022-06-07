package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/LMSProject.feature",
        glue = {"stepDefinitions"},

        //***************OVERALL TESTCASE*******************

        tags = "@lms"

        //***************INDIVIDUAL TESTCASE*******************
        //tags="@testcase1"
        //tags="@testcase2"
       //tags="@testcase3"
        //tags="@testcase4"
       //tags="@testcase5"
        //tags="@testcase6"
        //tags="@testcase7"
        //tags="@testcase8"
        //tags="@testcase9"

)
public class LMSTestRunner {
}
