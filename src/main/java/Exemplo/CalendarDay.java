package Exemplo;

import java.time.LocalDate;

public class CalendarDay
{
	public String findDay(int day, int month, int year)
	{
		if (year <= 0)
		{
			throw new IllegalArgumentException("Ano Invalido");
		}

		LocalDate data = LocalDate.of(year, month, day);
		return data.getDayOfWeek().toString();
	}
}
