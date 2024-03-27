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

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 10)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 5)
}

Mobile.verifyElementExist(findTestObject('TataMotars/HomeButton'), 10)

Mobile.tap(findTestObject('Home/Opportunities'), 0)

Mobile.tap(findTestObject('NewObject/CliKC1'), 30)

Mobile.verifyElementExist(findTestObject('NewObject/C1 Summary'), 30)

'STEP-01 : Click on Opportunities and click on C1\r\n\r\nExpected_Result :The user successfully landed on the all opporunities detail page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('NewObject/CREATE C1A'), 0)

Mobile.tap(findTestObject('NewObject/PDORClick'), 0)

Mobile.verifyElementExist(findTestObject('NewObject/ADD PDOR'), 30)

'STEP-02 : Click on Create C1A and click on PDOR\r\nExpected_Result :The Add PDOR CTA successfully displayed'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('NewObject/ADD PDOR'), 0)

Mobile.tap(findTestObject('C1 Functionality/Most Likely to buy tata'), 0)

Mobile.tap(findTestObject('C1 Functionality/LikelyPurchaseDate'), 0)

//Mobile.tap(findTestObject('C1 Functionality/Date'), 0)
Mobile.tap(findTestObject('C1 Functionality/OK'), 0)

Mobile.tap(findTestObject('C1 Functionality/PotentialDropOffReason'), 0)

Mobile.setText(findTestObject('C1 Functionality/PotentialDropOffReason'), str_PotentialDropOffReason, 0)

Mobile.tap(findTestObject('C1 Functionality/NotEligibleForFinance'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.verifyElementExist(findTestObject('NewObject/Potential drop off reason'), 30)

'STEP-03 : Click on Add PDOR and click on Next\r\n\r\nExpected_Result :The user successfully landed on the Create PDOR page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('C1 Functionality/PotentialDropOffReason'), 0)

Mobile.setText(findTestObject('C1 Functionality/PotentialDropOffReason'), 'CIBIL', 0)

Mobile.tap(findTestObject('C1 Functionality/CIBIL'), 0)

Mobile.tap(findTestObject('C1 Functionality/FinancierSelected'), 0)

Mobile.setText(findTestObject('C1 Functionality/FinancierSelected'), str_FinancierSelect, 0)

Mobile.tap(findTestObject('C1 Functionality/No'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Account/SubmitButton'), 10)

Mobile.verifyElementExist(findTestObject('NewObject/Potential Drop Off activity created successfully'), 30)

'STEP-04 : Enter all details and click on submit\r\n\r\nExpected_Result :Potential Drop Off Activity created successfully popup appeared'
Mobile.takeScreenshot()

Mobile.closeApplication()

