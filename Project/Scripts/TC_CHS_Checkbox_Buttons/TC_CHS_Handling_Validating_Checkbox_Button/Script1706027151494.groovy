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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Medicaid_programs'))

unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Medicaid_programs'), 
    0)

if (unchecked == true) {
    System.out.println('Element Not Checked')

    WebUI.check(findTestObject('Object Repository/CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Medicaid_programs'))

    System.out.println('Element Checkeck')
}

WebUI.delay(3)

WebUI.verifyElementChecked(findTestObject('Object Repository/CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Medicaid_programs'), 
    0)

WebUI.setText(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    '31/01/2024')

WebUI.setText(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Hello Doctor')

WebUI.click(findTestObject('CURA Healthcare Service Button/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.closeBrowser()

