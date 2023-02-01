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

WebUI.openBrowser(GlobalVariable.Aware_SiteURL)

WebUI.click(findTestObject('Aware/OR_Page_Login/btn_LoginOffice365'))

WebUI.verifyElementPresent(findTestObject('Aware/OR_Page_Login/div_PageOffice365'), GlobalVariable.G_Timeout)

WebUI.setText(findTestObject('Aware/OR_Page_Login/txt_emailOffice365'), Username)

WebUI.click(findTestObject('Aware/OR_Page_Login/btn_nextOffice365'))

WebUI.verifyElementPresent(findTestObject('Aware/OR_Page_Login/div_FormInputPassword'), GlobalVariable.G_Timeout)

WebUI.setText(findTestObject('Aware/OR_Page_Login/txt_passwordOffice365'), Password)

WebUI.click(findTestObject('Aware/OR_Page_Login/btn_SigninOffice365'))

WebUI.click(findTestObject('Aware/OR_Page_Login/btn_VerifyStaySignin'))

WebUI.verifyElementPresent(findTestObject('Aware/OR_Page_Login/div_Homepage'), GlobalVariable.G_Timeout_Long)

if (WebUI.verifyElementPresent(findTestObject('Aware/OR_Page_Login/div_popUp'), GlobalVariable.G_Timeout_Long)) {
    WebUI.click(findTestObject('Aware/OR_Page_Login/btn_gotIt'))
}

WebUI.delay(1)

