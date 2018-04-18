package Execution;

import org.testng.annotations.Test;

import Operations.LoginOperations;
import Repository.OpenBrowser;

public class ExecuteTest {
@Test
	public void Exe() throws Exception {
		
		OpenBrowser.browser();
		OpenBrowser.open();
		LoginOperations.Excel1();
	//	OpenBrowser.close();
		                                       
	}


	
}
