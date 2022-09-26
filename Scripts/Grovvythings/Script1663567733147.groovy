import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]

println(mp.containsKey("TopicName"));
println(mp.containsKey("Topic"));

println(mp.get("TopicName"));
println(mp.get("Topic"));

println(mp.keySet());
mp.put("TopicID","1");
mp.put("TopicName","overideoldvalue");
println(mp);
'semicolan is not mandatory'
println(mp.size());

println(mp.values());

int[] array = [0,1,2,3];

for(int i in array) {
 println(i);
}

println(array[1])

String sample = "Hello world";
println(sample[4]); // Print the 5 character in the string
  https://www.tutorialspoint.com/groovy/groovy_strings.htm
//Print the 1st character in the string starting from the back
println(sample[-1]);
println(sample[1..2]);//Prints a string starting from Index 1 to 2
println(sample[4..2]);//Prints a string starting from Index 4 back to 2
int a=10;
println(a)
def p=20;
println(p)