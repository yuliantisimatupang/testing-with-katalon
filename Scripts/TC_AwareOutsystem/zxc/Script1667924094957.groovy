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

WebUI.navigateToUrl('https://apps-sit.anteraja.id/AwareWebDashboard/Summary')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Login/input_Aware Web_Input_UsernameVal'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Login/a'))

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Sign in to your account/input_Sign in_loginfmt'), 'user01@anteraja.onmicrosoft.com')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Sign in to your account/input_Enter password_passwd'), 
    'acg361C+Ys0k5OUs+2/ZBA==')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Aware/OR_Coba1/Page_Aware Menu Portal/div_App Feedback is AvailableYou find error_04c6e2'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Aware Menu Portal/button_GOT IT'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Aware Menu Portal/div_Logout_text-align-center'))

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Home/input_Date From_b5-b1-b2-Date_input'), '2022-11-08')

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Home/input_Date To_b5-b1-b3-Date_input'), '2022-11-08')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/a_Summary'))

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Date From_b5-b1-b2-Date_input'), '2022-11-08')

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Date To_b5-b1-b3-Date_input'), '2022-11-08')

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Date From_b5-b1-b2-Date_input'), '2022-11-01')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Date To_b5-b1-b3-Date_input'))

WebUI.setText(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Date To_b5-b1-b3-Date_input'), '2022-11-02')

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_SD_b5-b3-l1-283_1-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_ND_b5-b3-l1-283_2-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_REG_b5-b3-l1-283_3-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_SDS_b5-b3-l1-283_4-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_ECO_b5-b3-l1-283_5-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_BIG_b5-b3-l1-283_6-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_FRS_b5-b3-l1-283_7-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_ICE_b5-b3-l1-283_8-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_CSD_b5-b3-l1-283_9-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/input_Service_b5-b3-l1-283_0-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Aware/OR_Coba1/Page_Summary/button_Apply Filter'))

WebUI.delay(10)

WebUI.closeBrowser()

