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

Mobile.tap(findTestObject('Oregrown/android.view.View0 - Oregrown Delivery  Pickup available - 0.3 Miles Away'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mars Love Triangle', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('Mars Love product/android.view.View0 - Mars Love Triangle THC 24.58 1g 12.65 18 oz 38.50 14 oz 77.00 12 oz 132.00 1 oz 242.00'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mars Love product/android.widget.Button0 - ADD TO CART - 12.65'), 0)

Mobile.tap(findTestObject('Checkout/android.view.View0 - Pickup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mars Love product/android.view.View0 - 1'), 0)

Mobile.tap(findTestObject('Mars Love product/android.widget.Button0 - PROCEED TO CHECKOUT - 12.65'), 0)

Mobile.tap(findTestObject('Checkout - Login input fields/android.widget.EditText0'), 0)

Mobile.sendKeys(findTestObject('Checkout - Login input fields/android.widget.EditText0'), 'Jenny', FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Checkout - Login input fields/android.widget.EditText0 (1)'), 'Collins', FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Checkout - Login input fields/android.widget.EditText0 (2)'), '(206) 509-6995', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Checkout - Login input fields/android.widget.EditText0 (3)'), '10/02/1980', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Place order', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0 - PLACE ORDER'), 0)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.widget.Button0'), 0)

device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

Mobile.tap(findTestObject('Clear history/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Clear history/android.widget.TextView0 - History'), 0)

Mobile.tap(findTestObject('Clear history/android.widget.Button0 - Clear browsing data'), 0)

Mobile.tap(findTestObject('Clear history/android.widget.Button0 - Clear data'), 0)

Mobile.tap(findTestObject('Clear history/android.widget.TextView0'), 0)

Mobile.tapAndHold(findTestObject('Close tab/android.widget.ImageButton0'), 0, 0)

Mobile.tap(findTestObject('Close tab/android.widget.TextView0 - Close tab'), 0)

Mobile.tap(findTestObject('Add tab/android.widget.ImageButton0'), 0)

Mobile.closeApplication()

