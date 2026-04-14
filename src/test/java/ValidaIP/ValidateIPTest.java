package ValidaIP;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateIPTest
{
	@Test
	void testIPValido()
	{
		ValidateIP v = new ValidateIP();
		assertTrue(v.validate("192.168.0.1"));
	}

	@Test
	void testIPInvalido()
	{
		ValidateIP v = new ValidateIP();
		assertFalse(v.validate("300.168.0.1"));
	}

	@Test
        void testIPValidoLimite()
        {
                ValidateIP v = new ValidateIP();
                assertTrue(v.validate("255.255.255.255"));
        }

	@Test
        void testIPInvalidoFormato()
        {
                ValidateIP v = new ValidateIP();
                assertFalse(v.validate("192.168.1"));
        }

	@Test
        void testIPComTexto()
        {
                ValidateIP v = new ValidateIP();
                assertFalse(v.validate("abc.def.ghi.jkl"));
        }
}
