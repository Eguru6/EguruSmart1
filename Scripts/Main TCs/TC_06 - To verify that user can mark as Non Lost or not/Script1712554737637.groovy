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

WebUI.callTestCase(findTestCase('CommenWorkflows/Login'), [('Str_URL') : 'C:\\Users\\sushil.gaikwad\\git\\EguruSmart1\\Application\\app-release (4).apk'
        , ('Str_Username') : 'DUSER145', ('Str_Password') : 'Soct#2023', ('AppPath') : 'bs://7ff0c9286ad199a5f95aa5eb8ca9619f5ca87b39'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 30)

Mobile.tap(findTestObject('Home/Opportunities'), 0)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/C0'), 0)

bool_Summary = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/C0 Summary Text'), 0)

bool_Target = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Target text'), 0)

bool_MTD = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/MTD text'), 0)

bool_ThisWeek = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/This Week text'), 0)

bool_Yesterday = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Yesterday text'), 0)

(((bool_Yesterday && bool_ThisWeek) && bool_MTD) && bool_Target) && (bool_Summary == true)

'STEP-01 : Click on C0\r\n\r\nExpected_Result : The user successfully landed on the C0 summary page with below option-:\r\n1. C0 Summary\r\n2. Target\r\n3. MTD\r\n4. This Week\r\n5. Yesterday'
Mobile.takeScreenshot()

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 10)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

//Mobile.scrollToText('Jyoti Kasle', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Additional Info/C0 Three Dots2'), 5)

Bool_Offline = Mobile.waitForElementPresent(findTestObject('Lost and Non Lost Functionality/Opportunity Details'), 10)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/Opportunity Details'), 0)

Mobile.waitForElementPresent(findTestObject('Lost and Non Lost Functionality/Schedule a follow up'), 5)

bool_CreateC1 = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/CREATE C1'), 0)

bool_Details = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/DETAILS'), 0)

bool_Details && (bool_CreateC1 == true)

'STEP-02 : Click on three dots of any opty card and select Opportunity detail option\r\n\r\nExpected_Result : The user successfully landed on the opty detail page with below option-:\r\n1. Create C1\r\n2. Details\r\n3. Schedule a follow up'
Mobile.takeScreenshot()

'Edit'
Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/Mark as Lost'), 0)

bool_LTC = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/LTC RadioButton'), 0)

bool_NotLTC = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Non LTC RadioButton'), 0)

bool_ReasonForLoss = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Reason for loss Field'), 
    0)

bool_MakeLostTo = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Make lost to field'), 0)

bool_ModelToLostTo = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Model lost to'), 0)

bool_Comment = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Comment'), 0)

((((bool_LTC && bool_NotLTC) && bool_ReasonForLoss) && bool_MakeLostTo) && bool_ModelToLostTo) && (bool_Comment == true)

'STEP-03 : Click on Edit icon and select Mark as Lost option \r\n\r\nExpected_Result : The user successfully land on the Mark as Lost option detail page with below field-:\r\n1. LTC\r\n2. Non LTC\r\n3. Reason for loss - dropdown\r\n4. Mark to lost to - dropdown\r\n5. Model lost to- dropdown\r\n6. Comment\r\n7. Cancel\r\n8. Mark as Lost'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Lost and Non Lost Functionality/Non LTC RadioButton'), 0)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/Reason for loss Field'), 0)

Mobile.setText(findTestObject('Lost and Non Lost Functionality/Reason for loss Field'), str_NonLTCReasonForLoss, 0)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/ReasonForLossDD'), 0)

Mobile.tap(findTestObject('Home/NewComment'), 0)

Mobile.setText(findTestObject('Home/NewComment'), str_Comment, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Lost and Non Lost Functionality/Mark as lost (1)'), 0)

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 10)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/LostCasesText'), 0)

'STEP-04 : Enter all the detail and click on Mark as Lost\r\n\r\nExpected_Result : "This Opty has been marked as lost view in lost cases" pop up successfully appear'
Mobile.takeScreenshot()

Mobile.closeApplication()

