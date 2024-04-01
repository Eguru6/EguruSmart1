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
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword as ScrollToElementKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommenWorkflows/Login'), [('Str_URL') : 'C:\\Users\\sushil.gaikwad\\git\\EguruSmart1\\Application\\app-release (4).apk'
        , ('Str_Username') : 'DUSER145', ('Str_Password') : 'Soct#2023', ('AppPath') : 'bs://7ff0c9286ad199a5f95aa5eb8ca9619f5ca87b39'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 10)

Mobile.tap(findTestObject('TataMotars/PluseButton'), 0)

bool_Opportunity = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/OpportunityButton'), 0)

bool_Account = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Account'), 0)

bool_Customer = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Customer'), 0)

bool_Influencer = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Influencer'), 0)

bool_FollowUp = Mobile.verifyElementExist(findTestObject('TataMotars/Pluse Button/Follow Up'), 0)

(((bool_Opportunity && bool_Account) && (bool_Customer && bool_Influencer)) && bool_FollowUp) == false

'STEP-01 : Click on + icon\r\n\r\nExpected_Result : The pop up should appear and below 4 option should be listed\r\n1. Opportunity\r\n2. Customer\r\n3. Account\r\n4. Influencer'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('TataMotars/Pluse Button/Influencer'), 3)

bool_PrimaryDetails = Mobile.verifyElementExist(findTestObject('Primery Details/Primary Details'), 10)

bool_PrimaryDetails == true

'STEP-02 : Click on Influencer\r\n\r\nExpected_Result : TThe user successfully landed on the add Influencer  primary detail screen which contains the below options-:\r\n1. First Name - text box\r\n2. Last Name - text box\r\n3. Mobile Number - text box\r\n4. Influencer Type- Dropdown\r\n5. Customer- checkbox\r\n6. Back  - CTA\r\n7. Next - CTA\r\n8. Add More Information'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Primery Details/FirstName'), 0)

Mobile.setText(findTestObject('Primery Details/FirstName'), str_FirstName, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/LastName'), 0)

Mobile.setText(findTestObject('Primery Details/LastName'), str_LastName, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/MobileNumber'), 0)

Mobile.setText(findTestObject('Primery Details/MobileNumber'), str_MobileNumber, 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Bool_BackButton = Mobile.waitForElementPresent(findTestObject('Create Customer/Back Button'), 0)

Bool_NextButton = Mobile.waitForElementPresent(findTestObject('Vehicle information/NextButton'), 0)

(Bool_BackButton && Bool_NextButton) == true

'STEP-03 : Enter all the details in the respective field\r\n\r\nExpected_Result : The respective additional influencer fields are successfully shown and are-:\r\n1. PAN Card Number- Text box\r\n2. Email Id- Text Box\r\n3. Back- CTA\r\n4. Next- CTA'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Primery Details/Enter InfluencerType'), 0)

Mobile.sendKeys(findTestObject('Create Customer/Influencer Type'), str_InfluencerType, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

bool_Pincode = Mobile.verifyElementExist(findTestObject('Primery Details/Address Details/Pincode'), 10)

bool_Pincode == true

'STEP-04 : Click on Next\r\n\r\nExpected_Result : The user successfully land on the Address detail field'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Primery Details/Address Details/Pincode'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Primery Details/Address Details/Pincode'), str_Pincode, 0)

Bool_PinCode = Mobile.waitForElementPresent(findTestObject('Address details/ClickPincodeNo'), 5)

if (Bool_PinCode == true) {
    Mobile.tap(findTestObject('Address details/ClickPincodeNo'), 5)
}

Mobile.hideKeyboard()

Mobile.tap(findTestObject('NewObject/DropDownDistrict'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DropDownSearchedDistrict'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DropDownTaluka'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NewObject/DroDownSearchedTaluka'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

bool_CustomerAddedSuccessfully = Mobile.verifyElementExist(findTestObject('NewObject/Influencer added successfully'), 10)

bool_CustomerAddedSuccessfully == true

Bool_CustomerType = Mobile.waitForElementPresent(findTestObject('Create Customer/Influencer Type'), 2)

'STEP-05 : Enter all the details and Click on Next\r\n\r\nExpected_Result : The customer added successfully popup successfully appears with 2 CTA that is-\r\n1. Schedule Visit\r\n2. Skip for Now'
Mobile.takeScreenshot()

Mobile.closeApplication()

