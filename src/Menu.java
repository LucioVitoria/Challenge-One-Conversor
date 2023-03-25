
import javax.swing.JOptionPane;

public class Menu {

	private String[] conversoes = { "Conversor de Moedas", "Conversor de Temperatura" };
	private String entradaConversao;
	private String valor;
	private Regex componentes = new Regex();

	public void escolherConversao() {

		entradaConversao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, conversoes, conversoes[0]);

		switch (entradaConversao) {

		case "Conversor de Moedas":

			valor = JOptionPane.showInputDialog("Digite um valor: ");

			if (!componentes.SoNumero(valor)) {

				JOptionPane.showMessageDialog(null, "Por Favor Digite Apenas números");

			} else {

				ConversorDeMoedas conversorMoedas = new ConversorDeMoedas(valor);
				conversorMoedas.escolherMoeda();

			}

			break;

		case "Conversor de Temperatura":

			valor = JOptionPane.showInputDialog("Digite um valor: ");

			if (!componentes.SoNumero(valor)) {

				JOptionPane.showMessageDialog(null, "Por Favor Digite Apenas números");

			} else {

				ConversorDeTemperatura conversorTemperatura = new ConversorDeTemperatura(valor);
				conversorTemperatura.converteTemperatura();

			}

			break;

		default:

			JOptionPane.showMessageDialog(null, "Valor inválido.");
			break;

		}
	}

	public String getValor() {

		valor = JOptionPane.showInputDialog("Digite um valor: ");

		if (!componentes.SoNumero(valor)) {

			JOptionPane.showMessageDialog(null, "Por Favor Digite Apenas números");

		}

		return valor;

	}

}
