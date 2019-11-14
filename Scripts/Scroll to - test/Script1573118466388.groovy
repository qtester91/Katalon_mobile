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

Mobile.tap(findTestObject('Open Dutchie homepage/android.widget.ImageButton0'), 0)

Mobile.setText(findTestObject('Open Dutchie homepage/android.widget.EditText0 - Search or type web address'), 'qa.dutchie.dev', 
    0)

Mobile.tap(findTestObject('Open Dutchie homepage/android.widget.TextView0 - qa.dutchie.dev'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.scrollToText('Chalice Farms', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Captured dispensaries/android.view.View0 - Chalice Farms'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('TJ\'s Gardens - MTF - 3.5g', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Captured products from Chalice farm/android.view.View0 - TJs Gardens - MTF - 3.5g THC 20.86CBD 0.07 18 oz- 31.20'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Captured objects/android.widget.Button0 - GOT IT'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Chalice Farms (Downtown)', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Captured objects/android.view.View0 - Dutchie logo'), 0)

