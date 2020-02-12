package pages
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class DashboardPage {
	
	@Keyword
	def clickMenus(){
		WebUI.click(findTestObject('Dashboard/b_Admin'))
		WebUI.click(findTestObject('Dashboard/b_Leave'))
		WebUI.click(findTestObject('Dashboard/b_PIM'))
	}
	
	@Keyword
	def userLogsOut(){
		WebUI.click(findTestObject('Dashboard/a_Welcome Admin'))
		WebUI.click(findTestObject('Dashboard/a_Logout'))
	}
	
}
