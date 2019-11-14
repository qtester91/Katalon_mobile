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

Mobile.setText(findTestObject('Open Dutchie homepage/android.widget.EditText0 - Search or type web address'), 'qa.dutchie.dev', 
    0)

Mobile.tap(findTestObject('Open Dutchie homepage/android.widget.TextView0 - qa.dutchie.dev'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.scrollToText('Blooming Deals', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Captured dispensaries/android.view.View0 - Blooming Deals'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add item from Blooming Deals dispensary to cart/android.view.View0 - Cannabis Nation  ATF Sativa 1g 12.00 18 oz 40.00 14 oz 75.00 12 oz 150.00 1 oz 260.00'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add item from Blooming Deals dispensary to cart/android.widget.Button0 - ADD TO CART - 12.00'), 
    0)

