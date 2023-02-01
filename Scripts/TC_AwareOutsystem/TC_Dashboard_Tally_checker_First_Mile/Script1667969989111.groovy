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

WebUI.navigateToUrl('https://apps-sit.anteraja.id/AwareWebDashboard/TallyCheckerFirstMile')

WebUI.setText(findTestObject('Aware/OR_Tallychecker_First_Mile/input_Date From_Fm'), '2022-09-01')

WebUI.setText(findTestObject('Aware/OR_Tallychecker_First_Mile/input_Date To_Fm'), '2022-09-02')

WebUI.delay(5)

WebUI.click(findTestObject('Aware/OR_Tallychecker_First_Mile/checkbox_viewBy'))

WebUI.selectOptionByLabel(findTestObject('Aware/OR_Tallychecker_First_Mile/checkbox_region'), 'JABODETABEK', true)

WebUI.click(findTestObject('Aware/OR_Tallychecker_First_Mile/button_Apply Filter'))

WebUI.delay(10)

WebUI.closeBrowser()

