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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.awwwards.com/')

WebUI.click(findTestObject('Object Repository/Page_Awwwards - Website Awards - Best Web D_c22321/div_MENU'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Awwwards - Website Awards - Best Web D_c22321/a_Winners'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Awwwards - Website Awards - Best Web D_c22321/a_Winners'))

halaman_tujuan = WebUI.getUrl()

WebUI.verifyMatch(halaman_tujuan, 'https://www.awwwards.com/websites/', false)

WebUI.closeBrowser()

