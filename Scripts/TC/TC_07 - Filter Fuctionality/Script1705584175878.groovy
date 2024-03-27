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

WebUI.callTestCase(findTestCase('CommenWorkflows/Login'), [('Str_URL') : 'C:\\Users\\sushil.gaikwad\\Katalon Studio\\tatamotarsdemoNew\\Application\\app-release (4).apk'
        , ('Str_Username') : 'DUSER145', ('Str_Password') : 'Soct#2023', ('AppPath') : 'bs://7ff0c9286ad199a5f95aa5eb8ca9619f5ca87b39'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 10)

Mobile.tap(findTestObject('Menu/Menu'), 0)

bool_Opportunities = Mobile.verifyElementExist(findTestObject('Menu/Opportunities'), 0)

bool_Contacts = Mobile.verifyElementExist(findTestObject('Menu/Contacts'), 0)

bool_Calendar = Mobile.verifyElementExist(findTestObject('Menu/Calendar'), 0)

bool_StockInfo = Mobile.verifyElementExist(findTestObject('Menu/Stock Information'), 0)

bool_Activities = Mobile.verifyElementExist(findTestObject('Menu/Activities'), 0)

bool_LostCases = Mobile.verifyElementExist(findTestObject('Menu/Lost Cases'), 0)

bool_PDOR = Mobile.verifyElementExist(findTestObject('Menu/PDOR'), 0)

bool_SyncMaster = Mobile.verifyElementExist(findTestObject('Menu/Sync Master'), 0)

bool_AboutUs = Mobile.verifyElementExist(findTestObject('Menu/About Us'), 0)

bool_LogOut = Mobile.verifyElementExist(findTestObject('Menu/Log Out'), 0)

((((((((bool_LogOut && bool_AboutUs) && bool_SyncMaster) && bool_PDOR) && bool_LostCases) && bool_Activities) && bool_StockInfo) && 
bool_Calendar) && bool_Contacts) && (bool_Opportunities == true)

'STEP-01 : Click on Menu\r\n\r\nExpected_Result : The pop up successfully appears wih below option-\r\n1. E- Guru- logo\r\n2. Opportunities\r\n3. Contact\r\n4. Calendar\r\n5. Stock Information\r\n6. Activities\r\n7. Lost Case\r\n8. PDOR\r\n9. Sync Master\r\n10. About Us\r\n11. Logout'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu/Opportunities'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Lost and Non Lost Functionality/C0 Summary Text'), 30)

bool_AllOpportunity = Mobile.verifyElementExist(findTestObject('Menu/All Opportunities'), 0)

bool_AllOpportunity == true

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu/FilterButton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Verification Status'), 0, FailureHandling.STOP_ON_FAILURE)

bool_Verified = Mobile.verifyElementExist(findTestObject('Filter/VerifiedFilter'), 0)

bool_NonVerified = Mobile.verifyElementExist(findTestObject('Filter/NonVerifiedFilter'), 0)

bool_ClearAll = Mobile.verifyElementExist(findTestObject('Menu/CLEAR ALL'), 0)

bool_Cancel = Mobile.verifyElementExist(findTestObject('Menu/Cancel'), 0)

bool_Apply = Mobile.verifyElementExist(findTestObject('Menu/Apply'), 0)

(((bool_Verified && bool_NonVerified) && bool_ClearAll) && bool_Cancel) && (bool_Apply == true)

'STEP-03 : Click on Filter icon and click on verification status\r\n\r\nExpected_Result : The user successfully land on the verification status option with below option-:\r\n1. Verified\r\n2. Non Verified\r\n3. Cancel\r\n4. Apply\r\n5. Clear All'
Mobile.takeScreenshot()

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 10)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.tap(findTestObject('NewObject/Verified'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Apply'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Lost and Non Lost Functionality/C0 Summary Text'), 30)

bool_AllOpportunity = Mobile.verifyElementExist(findTestObject('Menu/All Opportunities'), 30)

bool_AllOpportunity == true

'STEP-04 : Click on Verified and click on apply\r\n\r\nExpected_Result :The user successfully landed on the All opportunities page and all the verified opty\'s are displayed with "VRFD" token on each opty card successfully'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu/FilterButton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Verification Status'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/CLEAR ALL'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/Non Verified'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Apply'), 0, FailureHandling.STOP_ON_FAILURE)

bool_AllOpportunity = Mobile.verifyElementExist(findTestObject('Menu/All Opportunities'), 0)

bool_AllOpportunity == true

'STEP-05 : Go to Opportunity filter page Click on Clear All and click on Non Verified and click on apply \r\nExpected_Result :The user successfully landed on the All opportunities page and all the verified opty\'s are displayed with "NOT VRFD" token on each opty card successfully'
Mobile.takeScreenshot()

Mobile.closeApplication()

