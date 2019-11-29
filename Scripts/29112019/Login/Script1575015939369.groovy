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

//Before starting test - clear history on mobile device

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Login Vendy/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Login Vendy/android.widget.EditText0 - Search or type web address (1)'), 'qa.dutchie.dev', 
    0)

Mobile.tap(findTestObject('Login Vendy/android.widget.TextView0 - qa.dutchie.dev'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login Vendy/android.widget.Button0 - Log In'), 0)

Mobile.setText(findTestObject('Login Vendy/android.widget.EditText0'), 'qtester97+1129b@gmail.com', 0)

Mobile.setText(findTestObject('Login Vendy/android.widget.EditText0 (1)'), 'validpassword', 0)

Mobile.tap(findTestObject('Login Vendy/android.widget.Button0 - LOG IN (1)'), 0)

Mobile.closeApplication()

