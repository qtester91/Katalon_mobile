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

Mobile.tap(findTestObject('Colorado sunshine/android.view.View0 - Colorado Sunshine THC 19.75CBD 0.07 .8g- 8.33'), 0)

Mobile.delay(2)

not_run: Mobile.tap(findTestObject('Colorado sunshine/android.widget.Button0 - ADD TO CART - 8.33'), 0)

Mobile.tap(findTestObject('Checkout/android.view.View0 - Pickup'), 2)

Mobile.tap(findTestObject('Colorado sunshine/android.view.View0 - 1'), 2)

Mobile.tap(findTestObject('Colorado sunshine/android.widget.Button0 - PROCEED TO CHECKOUT - 8.33'), 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Checkout - Henry Lee/android.widget.EditText0 - first name'), 0)

Mobile.sendKeys(findTestObject('Checkout - Henry Lee/android.widget.EditText0 - first name'), 'Henry', FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Checkout - Henry Lee/android.widget.EditText0 - last name'), 'Lee', FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Checkout - Henry Lee/android.widget.EditText0 - phone'), '(206) 451-654', FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Checkout - Henry Lee/android.widget.EditText0 - date of birth'), '01/10/1981', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Place order', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0 - PLACE ORDER'), 0)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0'), 0)

WebUI.callTestCase(findTestCase('06122019/Clean browsing history'), [:], FailureHandling.STOP_ON_FAILURE)

