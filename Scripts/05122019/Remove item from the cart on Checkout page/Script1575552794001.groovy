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

//Before running this test case clear history from mobile device
WebUI.callTestCase(findTestCase('29112019/Open Have a Heart dispensary'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Proceed to Checkout from Have a Heart/android.view.View0 - 1'), 0)

Mobile.tap(findTestObject('Remove item from shopping cart on checkout page/android.widget.Button0 - PROCEED TO CHECKOUT - 12.00'), 
    0)

Mobile.tap(findTestObject('Remove item from shopping cart on checkout page/android.widget.Image0 - x-grey'), 0)

Mobile.tap(findTestObject('Remove item from shopping cart on checkout page/android.widget.Button0 - KEEP SHOPPING'), 0)

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

