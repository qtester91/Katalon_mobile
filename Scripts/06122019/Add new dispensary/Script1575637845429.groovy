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

Mobile.scrollToText('Learn more', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Add new dispensary/android.widget.Button0 - LEARN MORE'), 0)

Mobile.scrollToText('Getting started on dutchie is free and takes just minutes. A member of our team will follow up immediately to walk you through the platform and answer any questions.', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add new dispensary/android.view.View0 - LETS GET STARTED'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Add new dispensary/android.widget.EditText0 (1)'), 'Katalon dispensary', 0)

Mobile.setText(findTestObject('Add new dispensary/android.widget.EditText0 (2)'), '(602) 509-6995', 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.Spinner0 - State'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.CheckedTextView0 - Arizona'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.Button0 - CONTINUE'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.view.View0 - SELECT FILE'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.view.View0 - SELECT FILE (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add new dispensary/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Add new dispensary/android.widget.ImageView0 (4)'), 0)

Mobile.closeApplication()

