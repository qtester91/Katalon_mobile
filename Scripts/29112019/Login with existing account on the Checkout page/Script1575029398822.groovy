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

//Before running test case clear history from mobile device

WebUI.callTestCase(findTestCase('29112019/Add item from Vaporizers on Oregrown'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Login with existing account on the Checkout page/android.view.View0 - Login'), 0)

Mobile.setText(findTestObject('Login with existing account on the Checkout page/android.widget.EditText0'), 'qtester97+1129b@gmail.com', 
    0)

Mobile.setText(findTestObject('Login with existing account on the Checkout page/android.widget.EditText0 (1)'), 'validpassword', 
    0)

Mobile.tap(findTestObject('Login with existing account on the Checkout page/android.widget.Button0 - LOG IN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Place order', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0 - PLACE ORDER'), 0)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0'), 0)

Mobile.closeApplication()

