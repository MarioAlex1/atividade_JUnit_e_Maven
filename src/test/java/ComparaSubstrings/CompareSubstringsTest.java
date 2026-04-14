package ComparaSubstrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareSubstringsTest
{
	@Test
	void testExemplo()
	{
		CompareSubstrings c = new CompareSubstrings();
		assertEquals("ava\nwel", c.obterMenorEMaior("welcometojava", 3));
	}

	@Test
        void testKIgualString()
        {
                CompareSubstrings c = new CompareSubstrings();
                assertEquals("java\njava", c.obterMenorEMaior("java", 4));
        }

	@Test
        void testKIgualUm()
        {
                CompareSubstrings c = new CompareSubstrings();
                assertEquals("a\nv", c.obterMenorEMaior("java", 1));
        }

	@Test
        void testValoresRepetidos()
        {
                CompareSubstrings c = new CompareSubstrings();
                assertEquals("aa\naa", c.obterMenorEMaior("aaaa", 2));
        }

	@Test
        void testMaiusculoMinusculo()
        {
                CompareSubstrings c = new CompareSubstrings();
                assertEquals("A\na", c.obterMenorEMaior("Aa", 1));
        }
}
