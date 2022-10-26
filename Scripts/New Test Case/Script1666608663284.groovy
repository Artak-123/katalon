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
'Set viewport size 1920x1080'
WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('https://portal.playerms.com/login')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Admin Portal/input_Sign in to your account_password'), 'hZu92AEoIEQRdcYCdFIbYw==')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal/input_Sign in to your account_p-inputtext p_a34a83'), 
    'artak.nazaryan')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Deposits'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Withdrawals'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Report By Partners'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Report By Providers'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_MAD Identification Count'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Emails'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Smses'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal/a_Partners'))

WebUI.closeBrowser()

