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

Mobile.tap(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.EditText0 - Search or type web address'), 
    2)

Mobile.setText(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.EditText0 - Search or type web address (1)'), 
    'qa.dutchie.dev', 0)

Mobile.tap(findTestObject('Open Dutchie/Navigate to Dutchie via Chrome/android.widget.TextView0 - qa.dutchie.dev'), 2)

Mobile.scrollToText('Blooming Deals', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Captured dispensaries/android.view.View0 - Blooming Deals'), 2)

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



