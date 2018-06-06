package test.java.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import java.util.logging.Level;
import java.util.logging.Logger;


@RunWith(Cucumber.class)
@Suite.SuiteClasses({test.java.FrameworkCore.AndroidManager.class})

@CucumberOptions(
        features = "Features"
        ,glue={"test.java.StepDefinitions","test.java.FrameworkCore"}
        ,format={"json:target/cucumber/cucumber.JSON","junit:target/cucumber/cucumber.xml"}
)

public class Runner {
    public static void main(String[] args) {
        Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
        System.out.println("Test Execution Started..");
        RunJunitTest();
        System.out.println("Test Execution Over..\n Generating Report");
        //GenerateHTMLReport();
        System.out.println("Report Generated..");

    }

    private static void RunJunitTest()
    {
        Result result = JUnitCore.runClasses(Runner.class);
    }
/*
    private static void GenerateHTMLReport()
    {
        File reportOutputDirectory = new File("D:\\projects\\FEP_QA\\automation\\target\\cucumber");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("D:\\projects\\FEP_QA\\automation\\target\\cucumber\\cucumber.JSON");
        String buildNumber = "1";
        String projectName = "Twistedpair.Test.Integration";
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setParallelTesting(parallelTesting);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }*/
}

