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

Bool_Offline = Mobile.waitForElementPresent(findTestObject('LockScreen/NewPin/Offline Master Sync'), 5)

if (Bool_Offline == true) {
    Mobile.tap(findTestObject('LockScreen/NewPin/OkButton'), 0 //Mobile.sendKeys(findTestObject('Add Contact/Search - Add Contact'), str_NewContact, FailureHandling.STOP_ON_FAILURE)
        )
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

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

Mobile.tap(findTestObject('TataMotars/Pluse Button/OpportunityButton'), 3)

bool_AddContact = Mobile.verifyElementExist(findTestObject('Add Contact/AddContact'), 30)

bool_SearchAddContact = Mobile.verifyElementExist(findTestObject('Add Contact/Search - Add Contact'), 30)

bool_AddContact && (bool_SearchAddContact == true)

'STEP-02 : The user successfully  landed on the Add Opportunity screen with the below options-:\r\n1. Add Contact\r\n2. Search bar for existing contact search'
Mobile.takeScreenshot()

// Characters to choose from
def randomName = generateRandomName()

println("Random 5-character name: $randomName")

def minRange = 1

def maxRange = 1000

def randomInt = ThreadLocalRandom.current().nextInt(minRange, maxRange + 1)

def Result = "$randomName $randomInt"

Mobile.tap(findTestObject('Add Contact/Search - Add Contact'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('TataMotars/SearchBox'), Result, 0)

Mobile.hideKeyboard()

str_getNewContact = Mobile.getAttribute(findTestObject('TataMotars/SearchBox'), 'name', 0)

Result == str_getNewContact

'STEP-03 : The user successfully enters the name and respective name should be visible'
Mobile.takeScreenshot()

//Mobile.sendKeys(findTestObject('TataMotars/SearchBox'), 'Test1 Test1', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Add Contact/AddNewContactButton'), 0)

Mobile.setText(findTestObject('Primery Details/FirstName'), str_FirstName, 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Primery Details/LastName'), str_LastName, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/MobileNumber'), 0)

Mobile.setText(findTestObject('Primery Details/MobileNumber'), str_MobileNumber, 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Create New Opportunity/Customer Type'), 0)

Mobile.sendKeys(findTestObject('Create New Opportunity/Type_CustomerType'), str_CustomerType, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Bool_Customer = Mobile.waitForElementPresent(findTestObject('Create New Opportunity/Click_Customer'), 5)

if (Bool_Customer == true) {
    Mobile.tap(findTestObject('Create New Opportunity/Click_Customer'), 0)
}

Mobile.checkElement(findTestObject('Primery Details/Influencer Checkbox'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Create New Opportunity/Additional information'), 0)

Mobile.sendKeys(findTestObject('Primery Details/Enter InfluencerType'), Keys.chord(Keys.PAGE_UP))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Primery Details/Enter InfluencerType'), 0)

Mobile.setText(findTestObject('Create New Opportunity/Type Influencer'), str_InfluencerType, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)

bool_Pincode = Mobile.waitForElementPresent(findTestObject('Primery Details/Address Details/Pincode'), 5)

if (bool_Pincode == true) {
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

    Mobile.tap(findTestObject('NewObject/DroDownSearchedTaluka'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Primery Details/Address Details/NextButton'), 0)
}

bool_ProceedButton = Mobile.verifyElementExist(findTestObject('Primery Details/Proceed Button'), 30)

'STEP-04 : Enter all the details and select check box of also an influencer and click on Next\r\nExpected_Result : The popup successfully appears to select the contact'
Mobile.takeScreenshot()

if (bool_ProceedButton) {
    Mobile.tap(findTestObject('Create New Opportunity/ContactClickNew'), 0)

    'STEP-05 : Select the Contact\r\n\r\nExpected_Result : The user should be able to select the contact\r\n\r\nActual_Result : The user select the contact'
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Primery Details/Proceed Button'), 0)
} else {
    Mobile.tap(findTestObject('Additional Info/Cancel Button'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('TataMotars/EditButton'), 0)
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//Mobile.setText(findTestObject('TataMotars/CustomerType'), 'Retail Customer', 0)
//Mobile.hideKeyboard()
//Mobile.tap(findTestObject('Vehicle information/SelectCustomerType'), 0)
//Mobile.hideKeyboard()
//Mobile.tap(findTestObject('Vehicle information/SaveButton'), 0)
//bool_Next = Mobile.verifyElementNotVisible(findTestObject('TataMotars/NextButton'), 0)
/*if (bool_Next == true) {
    Mobile.tap(findTestObject('Additional Info/Cancel Button'), 0)

    Mobile.tap(findTestObject('TataMotars/EditButton'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('TataMotars/CustomerType'), 'Retail Customer', 0)

    Mobile.tap(findTestObject('Vehicle information/SelectCustomerType'), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Vehicle information/SaveButton'), 0)
} else {
    Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)
}*/
Mobile.verifyElementExist(findTestObject('Vehicle information/Vehicle information'), 30)

'STEP-06 : Click on Proceed\r\n\r\nExpected_Result : The user clicks on proceed and successfully land on the vehicle information page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Vehicle information/SelectProductLine'), 0)

Mobile.setText(findTestObject('Vehicle information/SelectProductLine'), str_ProductLine, 0)

Mobile.tap(findTestObject('Vehicle information/ClickSelectedProduct'), 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Vehicle information/SelectModel'), 0)

Mobile.setText(findTestObject('Vehicle information/SelectModel'), str_Model, 0)

Mobile.tap(findTestObject('Vehicle information/TapModel'), 0)

'STEP-07 : Select the Product line and model\r\n\r\nExpected_Result : The user should be able to select the product line and model option\r\n\r\nActual_Result : The user selects the product line option and model option'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.verifyElementVisible(findTestObject('Create New Opportunity/ClickVehicleApplication'), 0)

Mobile.tap(findTestObject('Create New Opportunity/ClickVehicleApplication'), 0)

'STEP-08 : Select the vehicle application and body type\r\n\r\nExpected_Result : The user should be land on the vehicle application and body type and should land on the select quantity\r\n\r\nActual_Result : The user landed on the vehicle application and body type and  landed on the select quantity'
Mobile.setText(findTestObject('Create New Opportunity/ClickVehicleApplication'), str_VehicleApplication, 0)

Mobile.tap(findTestObject('Create New Opportunity/SelectVehicleApplication'), 0)

Mobile.hideKeyboard()

Mobile.checkElement(findTestObject('Create New Opportunity/BodyType'), 0)

Mobile.tap(findTestObject('Create New Opportunity/BodyType'), 0)

Mobile.setText(findTestObject('Create New Opportunity/BodyType'), str_BodyType, 0)

Mobile.tap(findTestObject('Create New Opportunity/SelectBodyType'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

'STEP-08 : Select the vehicle application and body type\r\n\r\nExpected_Result : The user should be land on the vehicle application and body type and should land on the select quantity\r\n\r\nActual_Result : The user landed on the vehicle application and body type and  landed on the select quantity'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Additional Info/Quantity'), 0)

Mobile.setText(findTestObject('Additional Info/Quantity'), '1', 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.takeScreenshot()

'Tap on March'
Mobile.tap(findTestObject('Additional Info/AprilMonth'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'STEP-09 : Enter the quantity and click on Next\r\n\r\nExpected_Result : The user should be able to add the quantity and by clicking on Next the user should land on the select purchase month screen\r\n\r\nActual_Result : The user added the quantity and by clicking on Next the user  landed on the select purchase month screen'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.verifyElementVisible(findTestObject('Additional Info/SourceOfContact_Text'), 0)

Mobile.tap(findTestObject('Additional Info/Enter SourceOfContact'), 0)

Mobile.setText(findTestObject('Additional Info/Enter SourceOfContact'), str_SourceOfContact, 0)

Mobile.tap(findTestObject('Additional Info/Searched SourceOfContact'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.verifyElementVisible(findTestObject('Additional Info/CustomerInterestedInExchange'), 0)

'STEP-10 : Select the source of contact\r\n\r\nExpected_Result : The user should be able to select the contact and should landed on the customer interest option\r\n\r\nActual_Result : The user selects the contact and landed on the customer interest page'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Additional Info/Yes RadioButton'), 0)

bool_ExchangeQuantity = Mobile.verifyElementExist(findTestObject('Additional Info/SetQuantity'), 0)

bool_Make = Mobile.verifyElementExist(findTestObject('Additional Info/ClickMake'), 0)

bool_ExchangeQuantity && (bool_Make == true)

'STEP-11 : Select the customer interest option\r\n\r\nExpected_Result : The user should able to select the customer interest option and the exchange type option should be visible to the user\r\n\r\nActual_Result : The user selects the customer interest option and on the exchange type screen should appear'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Additional Info/SetQuantity'), 0)

Mobile.setText(findTestObject('Additional Info/SetQuantity'), str_ExchangeQuantity, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Additional Info/ClickMake'), 0)

Mobile.setText(findTestObject('Additional Info/SetMake'), str_Make, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Additional Info/SelectMake'), 0)

Mobile.tap(findTestObject('Vehicle information/NextButton'), 0)

Mobile.verifyElementVisible(findTestObject('Additional Info/ReviewOpty Text'), 0)

'STEP-12 : Enter the quantity and Make and click on Next\r\n\r\nExpected_Result : The user should be land on the review opty screen\r\n\r\nActual_Result : The user landed on the review opty screen'
Mobile.takeScreenshot()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add Account/SubmitButton'), 0)

Mobile.verifyElementVisible(findTestObject('Add Account/1 Opportunity successfully created popup'), 60)

'STEP-13 : Click on Submit\r\n\r\nExpected_Result : The user should be land on successful screen\r\n\r\nActual_Result : The user landed on the successful screen'
Mobile.takeScreenshot()

Mobile.closeApplication()

def generateRandomName() {
    def chars = ('A'..'Z') + ('a'..'z')

    def name = (1..5).collect({ 
            chars[new Random().nextInt(chars.size())]
        }).join()

    return name
}

