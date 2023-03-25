
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {

	private BigDecimal valor;

	private String[] Moedas = { "Real Para Dólar", "Real Para Euro", "Real Para Libras", "Real Para Yenes",
			"Dólar Para Real", "Euros Para Real", "Libras Para Real", "Yenes Para Real" };

	private String listaConversao;
	private BigDecimal Dolar = new BigDecimal("5.22");
	private BigDecimal Euro = new BigDecimal("5.56");
	private BigDecimal Libra = new BigDecimal("6.28");
	private BigDecimal Yene = new BigDecimal("0.039");

	private DecimalFormat df = new DecimalFormat("0.00");

	public ConversorDeMoedas(String valor) {

		this.valor = new BigDecimal(valor);

	}

	public void escolherMoeda() {

		listaConversao = (String) JOptionPane.showInputDialog(null, "Qual será a sua conversão?: ", "Moedas",
				JOptionPane.QUESTION_MESSAGE, null, Moedas, Moedas[0]);

		switch (listaConversao) {

		case "Real Para Dólar":

			valor = valor.divide(Dolar, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é $ " + df.format(valor));

			break;

		case "Real Para Euro":

			valor = valor.divide(Euro, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é € " + df.format(valor));

			break;

		case "Real Para Libras":

			valor = valor.divide(Libra, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é £ " + df.format(valor));

			break;

		case "Reals Para Yenes":

			valor = valor.divide(Yene, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é ¥ " + df.format(valor));

			break;

		case "Dólar para Reais":

			valor = Dolar.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));

			break;

		case "Euro Para Real":
			valor = Euro.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));

			break;

		case "Libras Para Real":

			valor = Libra.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));

			break;

		case "Yenes para Real":

			valor = Yene.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));

			break;

		default:

			System.out.println("Opção Inválida.");
			break;

		}

	}

}
