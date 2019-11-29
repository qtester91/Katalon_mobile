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

// Test will not complete successfully because email address will be recognized as already used. In order to complete test - email address should be changed and history on mobile device cleared

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.EditText0 - Search or type web address'), 0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 - Search or type web address (1)'),
	'qa.dutchie.dev', 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.TextView0 - qa.dutchie.dev'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.Button0 - Sign Up'), 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 (1)'), 'Vendy', 0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 (2)'), 'Grey', 0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 (3)'), 'qtester97+1129b@gmail.com',
	0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 - Must be 8 characters'), 'validpassword',
	0)

Mobile.setText(findTestObject('Sign-up user that is under 21/android.widget.EditText0 (4)'), '(206) 509-6995', 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.Spinner0 - Month'), 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.CheckedTextView0 - 2'), 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.Spinner0 - Day'), 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.CheckedTextView0 - 3'), 0)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.Spinner0 - Year'), 0)

Mobile.scrollToText('1980', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sign-up page/Year drop-down'), 2)

Mobile.tap(findTestObject('Sign-up user that is under 21/android.widget.Button0 - CREATE MY ACCOUNT'), 0)

Mobile.closeApplication()
