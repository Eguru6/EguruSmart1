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

Mobile.tap(findTestObject('Home/Opportunities'), 0)

Mobile.tap(findTestObject('Lost and Non Lost Functionality/C0'), 30)

bool_Summary = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/C0 Summary Text'), 0)

bool_Target = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Target text'), 0)

bool_MTD = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/MTD text'), 0)

bool_ThisWeek = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/This Week text'), 0)

bool_Yesterday = Mobile.verifyElementExist(findTestObject('Lost and Non Lost Functionality/Yesterday text'), 0)

(((bool_Yesterday && bool_ThisWeek) && bool_MTD) && bool_Target) && (bool_Summary == true)

'STEP-01 : Click on C0\r\n\r\nExpected_Result : The user successfully landed on the C0 summary page with below option-:\r\n1. C0 Summary\r\n2. Target\r\n3. MTD\r\n4. This Week\r\n5. Yesterday'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('C1 Functionality/CREATE C1'), 0)

bool_LeadClassification = Mobile.verifyElementExist(findTestObject('C1 Functionality/Lead classification and PDOR'), 0)

bool_ExchangeInformation = Mobile.verifyElementExist(findTestObject('C1 Functionality/Exchange Information'), 0)

bool_VASInformation = Mobile.verifyElementExist(findTestObject('C1 Functionality/VAS Information'), 0)

bool_FleetInformation = Mobile.verifyElementExist(findTestObject('C1 Functionality/Fleet Information'), 0)

bool_GenerateQuotation = Mobile.verifyElementExist(findTestObject('C1 Functionality/Generate Quotation Button'), 0)

(((bool_LeadClassification && bool_ExchangeInformation) && bool_VASInformation) && bool_FleetInformation) && (bool_GenerateQuotation == 
true)

'STEP-02 : Click on Create C1\r\n\r\nExpected_Result : The user Successfully landed on the C1 detail page with below option-:\r\n1. Account Information\r\n2. Lead Classification & PDOR\r\n3. Exchange Information\r\n4. VAS Information\r\n5. Fleet Information\r\n6. Generate Quotation'
Mobile.takeScreenshot()

Bool_AccountInformation = Mobile.waitForElementPresent(findTestObject('C1 Functionality/Account Information'), 5)

if (Bool_AccountInformation == true) {
    Mobile.tap(findTestObject('C1 Functionality/Account Information'), 0)

    Mobile.tap(findTestObject('NewObject/CreateC1Search'), 0)

    Mobile.setText(findTestObject('NewObject/CreateC1Search'), 'Test', 0)

    Mobile.tap(findTestObject('NewObject/C1SearchText'), 0)

    Mobile.tap(findTestObject('NewObject/C1Add New Account'), 0)

    Mobile.tap(findTestObject('Add Account/Individual RadioButton'), 0)

    Mobile.tap(findTestObject('Add Account/Account Name'), 0)

    Mobile.setText(findTestObject('Add Account/Account Name'), str_AccountName, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Add Account/Main Phone Number'), 0)

    Mobile.setText(findTestObject('Add Account/Main Phone Number'), str_MainMobileNo, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

    Mobile.tap(findTestObject('Primery Details/Address Details/Pincode'), 0)

    Mobile.setText(findTestObject('Primery Details/Address Details/Pincode'), str_Pincode, 0)

    Mobile.hideKeyboard()

    Bool_Pin = Mobile.waitForElementPresent(findTestObject('NewObject/Searched PinCodeTC3'), 2)

    if (Bool_Pin == true) {
        '5'
        Mobile.tap(findTestObject('NewObject/Searched PinCodeTC3'), 0, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.tap(findTestObject('NewObject/DropDownDistrict'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('NewObject/SelectDestrict6'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('NewObject/DropDownTaluka'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('NewObject/SelectTaluka6'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)
} else {
    Mobile.tap(findTestObject('C1 Functionality/Lead classification and PDOR'), 0)
}

bool_MostLikelyTata = Mobile.verifyElementExist(findTestObject('C1 Functionality/Most Likely to buy tata'), 0)

bool_TataNotSure = Mobile.verifyElementExist(findTestObject('C1 Functionality/Likely TATA - but not sure'), 0)

bool_MostLikelyCompetition = Mobile.verifyElementExist(findTestObject('C1 Functionality/Most likely to buy competition'), 
    0)

(bool_MostLikelyTata && bool_TataNotSure) && (bool_MostLikelyCompetition == true)

'STEP-03 : Click On Lead classification & PDOR\r\n\r\nExpected_Result : The user successfully landed on the Create C1 lead classification page with the below option\r\n1. Most likely to buy Tata\r\n2. Likely Tata- but not sure\r\n3. Most likely to buy competition'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('C1 Functionality/Most Likely to buy tata'), 0)

Mobile.tap(findTestObject('C1 Functionality/LikelyPurchaseDate'), 0)

//Mobile.tap(findTestObject('C1 Functionality/Date'), 0)
Mobile.tap(findTestObject('C1 Functionality/OK'), 0)

Mobile.tap(findTestObject('C1 Functionality/PotentialDropOffReason'), 0)

Mobile.setText(findTestObject('C1 Functionality/PotentialDropOffReason'), str_PotentialDropOffReason, 0)

Mobile.tap(findTestObject('C1 Functionality/NotEligibleForFinance'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

bool_Cancel = Mobile.verifyElementExist(findTestObject('Menu/Cancel'), 0)

bool_Confirm = Mobile.verifyElementExist(findTestObject('C1 Functionality/Confirm'), 0)

bool_Confirm && (bool_Cancel == true)

'STEP-04 : Select one option, enter data and click on Next\r\n\r\nExpected_Result : "Are you sure, no competition involved popup appears successfully with 2 CTA-:\r\n1. Cancel\r\n2. Confirm'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('C1 Functionality/Confirm'), 0)

Mobile.tap(findTestObject('C1 Functionality/PotentialDropOffReason'), 0)

Mobile.setText(findTestObject('C1 Functionality/PotentialDropOffReason'), 'CIBIL', 0)

Mobile.tap(findTestObject('C1 Functionality/CIBIL'), 0)

Mobile.tap(findTestObject('C1 Functionality/FinancierSelected'), 0)

Mobile.setText(findTestObject('C1 Functionality/FinancierSelected'), str_FinancierSelect, 0)

Mobile.tap(findTestObject('C1 Functionality/No'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

bool_CustInfoExchange = Mobile.verifyElementExist(findTestObject('Additional Info/CustomerInterestedInExchange'), 30)

bool_CustInfoExchange == true

'STEP-05 : Enter all the details and click on Next\r\n\r\nExpected_Result :The user successfully landed on the Exchange information page'
Mobile.takeScreenshot()

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 5)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.tap(findTestObject('Additional Info/Yes RadioButton'), 0)

Bool_Quantity = Mobile.waitForElementPresent(findTestObject('Additional Info/TypeExchangeQuantity'), 5)

if (Bool_Quantity == true) {
    Mobile.tap(findTestObject('Additional Info/TypeExchangeQuantity'), 0)

    Mobile.setText(findTestObject('Additional Info/TypeExchangeQuantity'), str_ExchangeQty, 0)

    Mobile.hideKeyboard()

    '5'
    Bool_Quantity = Mobile.waitForElementPresent(findTestObject('Additional Info/TypeExchangeQuantity'), 5)
}

Bool_Quantity = Mobile.waitForElementPresent(findTestObject('Additional Info/ClickExcangeMake'), 5)

if (Bool_Quantity == true) {
    Mobile.tap(findTestObject('Additional Info/ClickExcangeMake'), 0)

    Mobile.setText(findTestObject('Additional Info/TypeExchageMake'), 'TATA', 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('C1 Functionality/SearchedMakeTATA'), 0)
}

Mobile.tap(findTestObject('Vehicle information/NextButton'), 5)

bool_VASInfo = Mobile.verifyElementExist(findTestObject('C1 Functionality/VAS_information/TextIntrested in VAS'), 60)

bool_VASInfo == true

'STEP-06 : Select the customer interest exchange option and click on Next\r\n\r\nExpected_Result :The user successfully landed on the VAS information page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Follow Up page/VAS NO'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.tap(findTestObject('C1 Functionality/TotalFleetSize'), 0)

Mobile.setText(findTestObject('C1 Functionality/TotalFleetSize'), str_TotalFleetSize, 0)

Mobile.tap(findTestObject('C1 Functionality/TataMotorsFleetSize'), 0)

Mobile.setText(findTestObject('Home/NewTataMotorsFleetSize'), str_TataMotorsFleetSize, 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

bool_Review = Mobile.verifyElementExist(findTestObject('C1 Functionality/Review'), 10)

bool_GenerateQuotation = Mobile.verifyElementExist(findTestObject('C1 Functionality/GenerateQuotation'), 10)

bool_Review && (bool_GenerateQuotation == true)

'STEP-07 : Enter the Fleet size information and click on Next \r\n\r\nExpected_Result :The user successfully landed on the review page with below detail-\r\n1. User name\r\n2. Lead Confirmation\r\n3. PDOP- Service\r\n4. Exchange Information\r\n5. Fleet Information\r\n6. Generate Quotation - CTA'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('C1 Functionality/Generate Quotation Button'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('C1 Functionality/VAS_information/QuotationSubmit'), 30)

bool_Popup = Mobile.verifyElementExist(findTestObject('C1 Functionality/OpportunitySuccessfullyUpdatedToC1StagePopup'), 
    60)

bool_Popup == true

'STEP-08 : Click On Generate Quotation and click on submit\r\n\r\nExpected_Result :Opportunity successfully updated to C1 stage pop up suucessfully appear'
Mobile.takeScreenshot()

Mobile.closeApplication()

