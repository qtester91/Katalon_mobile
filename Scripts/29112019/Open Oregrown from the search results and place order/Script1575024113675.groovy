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

//Before running the test case clear history from mobile device

WebUI.callTestCase(findTestCase('29112019/Get Oregrown in the search results'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Oregrown/android.view.View0 - Oregrown Delivery  Pickup available - 0.3 Miles Away'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mule Fuel', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Oregrown/android.view.View0 - Mule Fuel THC 24.27CBD 0.08 1g 12.00 18 oz 40.00 14 oz 80.00 12 oz 140.00 1 oz 250.00'), 
    0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Oregrown/android.widget.Button0 - ADD TO CART - 12.00'), 0)

Mobile.tap(findTestObject('Have a Heart dispensary/android.view.View0'), 0)

Mobile.tap(findTestObject('Oregrown/android.view.View0 - 1'), 0)

Mobile.tap(findTestObject('Oregrown/android.widget.Button0 - PROCEED TO CHECKOUT - 12.00'), 0)

Mobile.closeApplication()

