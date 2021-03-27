import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class TestListener {
	
	
	@BeforeTestCase
	def navigateToLoginPage(){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl);
	}
	
	@AfterTestCase
	def closeBrowser(){
		WebUI.closeBrowser();
	}
}