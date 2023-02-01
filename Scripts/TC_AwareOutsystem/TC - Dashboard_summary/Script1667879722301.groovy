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

//WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/btn_click_dashboard'))

//WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/btn_click_summary'))

WebUI.navigateToUrl('https://apps-sit.anteraja.id/AwareWebDashboard/Summary')

WebUI.setText(findTestObject('Aware/OR_Page_Dashboard_Summary/div_startDate'), '2022-09-01')

WebUI.setText(findTestObject('Aware/OR_Page_Dashboard_Summary/div_endDate'), '2022-09-02')

WebUI.uncheck(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_SD'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_REG'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_DOK'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_SDS'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_ICE'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/checkbox_service_ECO'))

WebUI.click(findTestObject('Aware/OR_Page_Dashboard_Summary/btn_applyFilter'))

WebUI.delay(15)

WebUI.closeBrowser()

