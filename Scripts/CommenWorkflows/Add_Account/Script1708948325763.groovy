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

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

'STEP-04 : Enter all the details and select check box of also an influencer and click on Next\r\n\r\nExpected_Result : The popup should appear to select the contact \r\n\r\nActual_Result : The popup appears to select the contact'
Mobile.setText(findTestObject('Primery Details/FirstName'), str_FirstName, 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Primery Details/LastName'), str_LastName, 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Primery Details/MobileNumber'), str_MobileNumber, 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Create New Opportunity/Customer Type'), 0)

Mobile.sendKeys(findTestObject('Create New Opportunity/Type_CustomerType'), str_CustomerType, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/Searched CustomerType'), 0)

Mobile.checkElement(findTestObject('Primery Details/Influencer Checkbox'), 0)

Mobile.tap(findTestObject('Primery Details/Enter InfluencerType'), 0)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 0 //Mobile.sendKeys(findTestObject('Add Contact/Search - Add Contact'), str_NewContact, FailureHandling.STOP_ON_FAILURE)
        )
} else {
    println('Popup handled')
}

Mobile.setText(findTestObject('Primery Details/Enter InfluencerType'), str_InfluencerType, 0)

Mobile.scrollToText('Influencer type', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

bool_ProceedButton = Mobile.verifyElementExist(findTestObject('Primery Details/Proceed Button'), 30)

'STEP-05 : Select the Contact\r\n\r\nExpected_Result : The user should be able to select the contact\r\n\r\nActual_Result : The user select the contact'
if (bool_ProceedButton) {
    Mobile.tap(findTestObject('Primery Details/select Created Contact'), 0)

    'STEP-06 : Click on Proceed\r\n\r\nExpected_Result : The user should be able to click on proceed and the user is able to land on the vehicle information screen\r\n\r\nActual_Result : The user clicks on proceed and the user landed on the Vehicle information page'
    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Primery Details/Proceed Button'), 0)
} else {
    Mobile.tap(findTestObject('Additional Info/Cancel Button'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

