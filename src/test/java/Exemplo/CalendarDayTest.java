package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.DateTimeException;

public class CalendarDayTest
{
	private final CalendarDay calendar = new CalendarDay();

	@Test
	void testDataValida()
	{
		assertEquals("WEDNESDAY", calendar.findDay(5, 8, 2015));
	}

	@Test
	void testFevereiroBissexto()
	{
		assertEquals("THURSDAY", calendar.findDay(29, 2, 2024));
	}

	@Test
	void testDataInvalidaDia()
	{
		assertThrows(DateTimeException.class, () -> calendar.findDay(32, 1, 2026));
	}

	@Test
	void testMesInvalido()
	{
		assertThrows(DateTimeException.class, () -> calendar.findDay(1, 13, 2026));
	}

	@Test
	void testAnoInvalido()
	{
		assertThrows(IllegalArgumentException.class, () -> calendar.findDay(1, 1, -2026));
	}
}
