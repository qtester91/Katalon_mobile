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

//Before starting test case - clear history on mobile device
WebUI.callTestCase(findTestCase('29112019/Open Seattle dispensaries'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Have a Heart dispensary/android.view.View0 - Have a Heart (Greenwood) Delivery closed Pickup available - 6.0 Miles Away'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Do-Si-Pop - Willie\'s Reserve', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Have a Heart dispensary/android.view.View0 - Do-Si-Pop - Willies Reserve Hybrid THC 18.93 1g 10.00 18 oz 30.00'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Have a Heart dispensary/android.widget.Button0 - ADD TO CART - 10.00'), 0)

Mobile.tap(findTestObject('Have a Heart dispensary/android.view.View0 (1)'), 0)

Mobile.closeApplication()

