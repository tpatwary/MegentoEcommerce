package luma.us.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json" },		 	
		features = {".//Features/"}, 
        glue = {"luma.us.stepdefintaions","luma.us.hooks"}, 	
        	   dryRun = true, // why I get null point exception when I use false
              //monochrome = true, 
            		tags = "@smoke")   
public class Luma_MyRunner extends AbstractTestNGCucumberTests{
	

}
