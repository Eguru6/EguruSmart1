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
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom

WebUI.callTestCase(findTestCase('CommenWorkflows/Login'), [('Str_URL') : 'C:\\Users\\sushil.gaikwad\\git\\EguruSmart1\\Application\\app-release (4).apk'
        , ('Str_Username') : 'DUSER145', ('Str_Password') : 'Soct#2023', ('AppPath') : 'bs://7ff0c9286ad199a5f95aa5eb8ca9619f5ca87b39'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 10)

'\r\n'
Mobile.tap(findTestObject('TataMotars/PluseButton'), 0)

bool_Opportunity = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/OpportunityButton'), 0)

bool_Account = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Account'), 0)

bool_Customer = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Customer'), 0)

bool_Influencer = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Influencer'), 0)

bool_FollowUp = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Follow Up'), 0)

(((bool_Opportunity && bool_Account) && (bool_Customer && bool_Influencer)) && bool_FollowUp) == false

'STEP-01 : Click on + icon\r\n\r\nExpected_Result : The pop up should appear and below 4 option should be listed\r\n1. Opportunity\r\n2. Customer\r\n3. Account\r\n4. Influencer'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('TataMotars/Pluse Button/Account'), 3)

bool_AccountInfo = Mobile.verifyElementExist(findTestObject('C1 Functionality/Account Information'), 30)

bool_AccountName = Mobile.verifyElementExist(findTestObject('Add Account/Account Name'), 30)

bool_MainPhoneNumber = Mobile.verifyElementExist(findTestObject('Add Account/Main Phone Number'), 30)

(bool_AccountInfo && bool_AccountName) && (bool_MainPhoneNumber == true)

'STEP-02 : Click on Account\r\n\r\nExpected_Result : The user successfully landed on the Account Information screen with the below options-:\r\n1. Account Type\r\n2. Account Name\r\n3. Main Phone Number\r\n4. PAN Numer\r\n5. Back \r\n6. Next'
Mobile.takeScreenshot()

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 5)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.tap(findTestObject('Add Account/Individual RadioButton'), 0)

def minRange = 1

def maxRange = 1000

def randomInt = ThreadLocalRandom.current().nextInt(minRange, maxRange + 1)

def Result = "$str_AccountName $randomInt"

Mobile.tap(findTestObject('Add Account/Account Name'), 0)

Mobile.setText(findTestObject('Add Account/Account Name'), Result, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Account/Main Phone Number'), 0)

Mobile.setText(findTestObject('Add Account/Main Phone Number'), str_MainMobileNo, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

bool_Pincode = Mobile.verifyElementExist(findTestObject('Primery Details/Address Details/Pincode'), 30)

'STEP-03 : Enter details and click on Next\r\n\r\nExpected_Result : The user successfully land on the Business Address page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Primery Details/Address Details/Pincode'), 0)

Mobile.setText(findTestObject('Primery Details/Address Details/Pincode'), str_Pincode, 0)

Mobile.hideKeyboard()

Bool_Pin = Mobile.waitForElementPresent(findTestObject('NewObject/Searched PinCodeTC3'), 2)

if (Bool_Pin == true) {
    '5'
    Mobile.tap(findTestObject('NewObject/Searched PinCodeTC3'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('NewObject/DropDownDistrict'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DropDownSearchedDistrict'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DropDownTaluka'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DroDownSearchedTaluka'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Next', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 3)

Mobile.verifyElementExist(findTestObject('Menu/Opportunities'), 30)

'STEP-04 : Enter details on the business address and click on Next\r\n\r\nExpected_Result : Account Created successfully popup appears'
Mobile.takeScreenshot()

Mobile.closeApplication()

