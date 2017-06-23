package project.pr1;

import org.testng.annotations.Test;

public class ParserTest {
	private Parser parser;
	
	@BeforeMethod
	public void beforeMethod() {
		parser = new Parser();
	}

	@Test
	public void tst_parseToChars(String number) {
	}
}
