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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.EditText0 - Search or type web address'), 
    2)

Mobile.setText(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.EditText0 - Search or type web address (1)'), 
    'qa.dutchie.dev', 0)

Mobile.tap(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.TextView0 - qa.dutchie.dev'), 2)

Mobile.scrollToText('Chalice Farms', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Objects collected from web/Chalice farm link'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('De Terra - ROCKSTAR OG - 3.5g', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Chalice Farms/android.view.View0 - De Terra - ROCKSTAR OG - 3.5g Hybrid THC 26.07CBD 0.03 18 oz- 42.00 (1)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Chalice Farms/android.widget.Button0 - ADD TO CART - 42.00'), 0)

Mobile.tap(findTestObject('Chalice Farms/android.widget.Button0 - GOT IT'), 0)

WebUI.callTestCase(findTestCase('06122019/Clean browsing history'), [:], FailureHandling.STOP_ON_FAILURE)

