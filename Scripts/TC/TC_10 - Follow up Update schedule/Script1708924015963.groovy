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

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 10)

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 5)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.tap(findTestObject('Home/Calendar'), 0)

bool_UpdateBtn = Mobile.verifyElementExist(findTestObject('ScheduleFollowUp/UpdateButton'), 0)

'STEP-01 : Click on Update on the user card\r\n\r\nExpected_Result : The user successfully landed on the update follow up page with the below details-:\r\n1. Update Status\r\n2. Cancel - CTA \r\n3. Update - CTA'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Follow Up page/New/RescheduleCheckbox'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Follow Up page/New/ClickReason'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Follow Up page/New/ClickReason'), Str_Reason, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Follow Up page/New/ClickIssueTypeNew'), 0)

Mobile.setText(findTestObject('Follow Up page/New/ClickIssueTypeNew'), 'Finance', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Follow Up page/New/ClickIssurTypeTextNew'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Follow Up page/New/ClickIssueDetailsNew'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Follow Up page/New/ClickIssueDetailsNew'), Str_IssueDetail, 0)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Follow Up page/New/CommentNew'), 10)

Mobile.setText(findTestObject('Follow Up page/New/CommentNew'), str_Comment, 30)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Follow Up page/New/ClickDuration'), 0, FailureHandling.STOP_ON_FAILURE)

'STEP-02 : Select the update status and fill all the details on the page\r\n\r\nExpected_Result : The user  fill all the details and they  able to click on the update successfully'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('ScheduleFollowUp/UpdateButton'), 0, FailureHandling.STOP_ON_FAILURE)

str_FollowUpSuccessfully = Mobile.verifyElementExist(findTestObject('Follow Up page/FollowUp-ActivityCreatedSuccessfully'), 
    30)

'STEP-03 : Click on Update\r\n\r\nExpected_Result : Activity updated Successfully popup  appeared'
Mobile.takeScreenshot()

