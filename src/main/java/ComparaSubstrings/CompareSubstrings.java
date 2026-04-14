package ComparaSubstrings;

public class CompareSubstrings
{
	public String obterMenorEMaior(String s, int k)
	{
		String menor = s.substring(0, k);
		String maior = s.substring(0, k);

		for (int i = 1; i <= s.length() - k; i++)
		{
			String atual = s.substring(i, i + k);

			if (atual.compareTo(menor) < 0)
			{
				menor = atual;
			}

			if (atual.compareTo(maior) > 0)
			{
				maior = atual;
			}
		}

		return menor + "\n" + maior;
	}
}
