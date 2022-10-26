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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/h2_Sign in to your account'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/i_Dashboard_pi icon icon-arrow_left'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Bets'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Portal/ul_Bets'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/div_Previous Month_p-radiobutton p-component'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Select Partner_p-multiselect-trigger-i_bfb22b'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal/input_Select Partner_p-multiselect-filter p_e83740'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_Current Month_p-ripple p-element p-d_26cc93'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_9'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_17'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Columns'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/span_Filters'))

WebUI.closeBrowser()

