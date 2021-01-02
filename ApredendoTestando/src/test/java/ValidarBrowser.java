import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidarBrowser {
	
	MetodoTestando m =new MetodoTestando();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirefox() {
		m.abrirBrowser("https://www.e2etreinamentos.com.br", "Firefox");
	}
	@Test
	public void testChrome() {
		m.abrirBrowser("https://www.e2etreinamentos.com.br", "Chrome");
	}

}
