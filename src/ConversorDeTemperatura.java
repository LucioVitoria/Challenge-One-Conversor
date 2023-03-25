import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorDeTemperatura {

	private String[] opcoesEscalas = { "Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius",
			"Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit" };
	private String escalas;
	private double Temperatura;
	private DecimalFormat df = new DecimalFormat("0.00");

	public ConversorDeTemperatura(String valor) {

		this.Temperatura = Double.parseDouble(valor);

	}

	public void converteTemperatura() {

		escalas = (String) JOptionPane.showInputDialog(null, "Escolha a escala que você quer converter: ",
				"Escalas termométricas: ", JOptionPane.QUESTION_MESSAGE, null, opcoesEscalas, opcoesEscalas[0]);

		switch (escalas) {

		case "Celsius para Fahrenheit":

			Temperatura = (Temperatura * 1.8) + 32;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " Fahrenheit.");

			break;

		case "Celsius para Kelvin":

			Temperatura = Temperatura + 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " Kelvin.");

			break;

		case "Fahrenheit para Celsius":

			Temperatura = (Temperatura - 32) * 5 / 9;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " graus Celsius.");

			break;

		case "Fahrenheit para Kelvin":

			Temperatura = ((Temperatura - 32) / 1.8) + 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " Kelvin.");

			break;

		case "Kelvin para Celsius":

			Temperatura = Temperatura - 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " graus Celsius.");

			break;

		case "Kelvin para Fahrenheit":

			Temperatura = 1.8 * (Temperatura - 273.15) + 32;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null,
					"O valor convertido é igual a " + df.format(Temperatura) + " Fahrenheit.");

			break;

		default:

			JOptionPane.showMessageDialog(null, "Valor inválido.");

		}
	}

}
