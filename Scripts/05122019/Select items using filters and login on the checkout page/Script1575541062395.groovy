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

Mobile.tap(findTestObject('Get Oregrown in the search results/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Get Oregrown in the search results/android.widget.EditText0 - Search or type web address (1)'), 
    'qa.dutchie.dev', 0)

Mobile.tap(findTestObject('Get Oregrown in the search results/android.widget.TextView0 - qa.dutchie.dev'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Get Oregrown in the search results/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Get Oregrown in the search results/android.widget.EditText0 (1)'), 'Bend Oregon', 0)

Mobile.tap(findTestObject('Get Oregrown in the search results/android.view.View0 - BendOregon USA'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Oregrown - Edibles/android.view.View0 - Oregrown Delivery  Pickup available - 0.3 Miles Away'), 
    0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Oregrown - Edibles/android.widget.Spinner0 - Specials'), 0)

Mobile.tap(findTestObject('Oregrown - Edibles/android.widget.CheckedTextView0 - Edibles'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.view.View0 - Moxey Zen 251 CBDTHC Peppermint Mints THC 20 mgCBD 500 mg 40.00 (1)'), 
    0)

Mobile.tap(findTestObject('Items listed using filters/android.view.View0'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Items listed using filters/android.widget.Spinner0 - Topicals'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.widget.CheckedTextView0 - Vaporizers'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.view.View0 - Echo Electuary - Critical Cheese 1g Cartridge 1g- 50.00'), 
    0)

Mobile.tap(findTestObject('Items listed using filters/android.widget.Spinner0 - Vaporizers'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.widget.CheckedTextView0 - Tinctures'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.view.View0 - Select  Unflavored 11 Tincture  1oz THC 447 mgCBD 516 mg 70.00'), 
    0)

Mobile.tap(findTestObject('Items listed using filters/android.view.View0 - 3'), 0)

Mobile.tap(findTestObject('Items listed using filters/android.widget.Button0 - PROCEED TO CHECKOUT - 160.00'), 0)

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

WebUI.callTestCase(findTestCase('06122019/Clean browsing history'), [:], FailureHandling.STOP_ON_FAILURE)

