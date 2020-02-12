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

public class LoginPage {

	@Keyword
	def userLogsIn(def username, def password){
		WebUI.waitForElementClickable(findTestObject('Login/span_Username'), 10)
		WebUI.setText(findTestObject('Login/span_Username'), username)
		WebUI.setText(findTestObject('Login/span_Password'), password)
		WebUI.click(findTestObject('Login/input_Password_Submit'))
	}
}
