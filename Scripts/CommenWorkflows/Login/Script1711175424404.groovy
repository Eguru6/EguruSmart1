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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(Str_URL, false)

Bool_Username = Mobile.waitForElementPresent(findTestObject('LockScreen/UsernaneText'), 10)

if (Bool_Username == true) {
    Mobile.tap(findTestObject('LockScreen/Username'), 0)

    Mobile.setText(findTestObject('LockScreen/Username'), Str_Username, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('LockScreen/Password'), 0)

    Mobile.setText(findTestObject('LockScreen/Password'), Str_Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('LockScreen/LoginButton'), 0)

    Mobile.tap(findTestObject('LockScreen/NewPin/NewPin1'), 0)

    Mobile.sendKeys(findTestObject('LockScreen/NewPin/NewPin1'), '1', FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('LockScreen/NewPin/NewPin2'), '2', 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/NewPin3'), '3', 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/NewPin4'), '4', 0)

    Mobile.tap(findTestObject('LockScreen/NewPin/ConfirmPin1'), 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/ConfirmPin1'), '1', 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/ConfirmPin2'), '2', 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/ConfirmPin3'), '3', 0)

    Mobile.setText(findTestObject('LockScreen/NewPin/ConfirmPin4'), '4', 0)

    Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 10)

    if (Bool_Offline == true) {
        Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 0)
    }
    
    Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 30)

    if (Bool_Offline == true) {
        Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 0)
    } // WebUI.setText(findTestObject('LockScreen/Pin 1'), '1')
    // WebUI.setText(findTestObject('LockScreen/Pin2'), '2')
    //WebUI.setText(findTestObject('LockScreen/Pin3'), '3')
    // WebUI.setText(findTestObject('LockScreen/Pin4'), '4')
    // Mobile.tap(findTestObject('LockScreen/LoginButton'), 0)
} else {
    Mobile.tap(findTestObject('LockScreen/Tap1'), 0)

    Mobile.setText(findTestObject('LockScreen/Text1'), '1', 0)

    Mobile.setText(findTestObject('LockScreen/Text2'), '2', 0)

    Mobile.setText(findTestObject('LockScreen/Text3'), '3', 0)

    Mobile.setText(findTestObject('LockScreen/Text4'), '4', 0)

    Mobile.tap(findTestObject('LockScreen/LoginButton'), 0)
}

