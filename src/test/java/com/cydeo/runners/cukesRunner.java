package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
        "rerun:target/rerun.txt"

        },
        features="src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,//eğer herşeyi çalıştırmak istemiyorsam, bunu true yapıyorum.by default it is false.,
        tags= "" //bu şekilde( "" )boş olursa I am not limiting my executionwith any kind of tag.herşeyi execute.
        //so ı am saying to this runner class.go ahead and run everything inside this feature files.normalde
        // buraya tag.leryazıyoruz.

        //@employee and not @admin. gibi. "or" "and", "and not" şeklinde kullanımları var.
        //


)

public class cukesRunner {
}
