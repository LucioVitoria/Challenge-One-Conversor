
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int resultado = 5;

		while (resultado != JOptionPane.NO_OPTION && resultado != JOptionPane.CANCEL_OPTION) {

			try {

				Menu menu = new Menu();
				menu.escolherConversao();

			} catch (NumberFormatException | NullPointerException e) {

				NullPointerException nullException = new NullPointerException();
				NumberFormatException numberFexception = new NumberFormatException();
				if (e.getClass() == nullException.getClass()) {

					JOptionPane.showMessageDialog(null, "Necessário Digitar um valor");

				} else if (e.getClass() == numberFexception.getClass()) {

					JOptionPane.showMessageDialog(null, "Por Favor Digite Apenas números");

				}

			}

			resultado = JOptionPane.showConfirmDialog(null, "Continuar?");

		}

		JOptionPane.showMessageDialog(null, "Programa Finalizado");
	}

}
