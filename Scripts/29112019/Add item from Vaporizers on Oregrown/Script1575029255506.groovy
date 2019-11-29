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

WebUI.callTestCase(findTestCase('29112019/Filter Seeds on Oregrown dispensary'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Add item from Vaporizers type on Oregrown/android.widget.Spinner0 - Seeds'), 0)

Mobile.tap(findTestObject('Add item from Vaporizers type on Oregrown/android.widget.CheckedTextView0 - Vaporizers'), 0)

Mobile.tap(findTestObject('Add item from Vaporizers type on Oregrown/android.view.View0 - Angel Fire Wings 0.5g CBD Disposable - New York Sour Diesel .5g- 100.00'), 
    0)

Mobile.tap(findTestObject('Add item from Vaporizers type on Oregrown/android.view.View0 - 3'), 0)

Mobile.tap(findTestObject('Add item from Vaporizers type on Oregrown/android.widget.Button0 - PROCEED TO CHECKOUT - 105.50'), 
    0)

Mobile.closeApplication()

