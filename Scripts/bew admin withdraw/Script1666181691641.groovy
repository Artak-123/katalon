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

WebUI.navigateToUrl('https://portal.playerms.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal/input_Sign in to your account_p-inputtext p_a34a83'), 
    'artak.nazaryan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Admin Portal/input_Sign in to your account_password'), 'hZu92AEoIEQRdcYCdFIbYw==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/img_Sign in to your account_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/span_LOGIN_p-ink'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/i_Dashboard_pi icon icon-arrow_left'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/span_Payments_p-ink'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Payments'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/span_Withdrawals_p-ink'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Withdrawals'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/span_Page                        1         _754f40'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Filters'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Columns'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Filters_ag-column-select-header'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/input_Filters_ag-32-input'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/input_Filters_ag-32-input'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Columns'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Select Partner'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal/input_Select Partner_p-multiselect-filter p_e83740'), 
    'tec')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/li_technabet'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_Reset'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Select Partner_ng-tns-c70-21 p-multisel_833b9c'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Select Partner_p-multiselect-trigger-i_442fb7'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Last 7 Days'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/span_Apply_p-ink'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_of_ag-icon ag-icon-next'))

WebUI.closeBrowser()

