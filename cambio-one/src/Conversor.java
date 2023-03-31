import javax.swing.JOptionPane;

public class Conversor {

	private double moeda;
	private String[] tipo = { "Selecione", "Real > Dólar", "Real > Euro", "Real > Libras Esterlinas",
			"Real > Libras Esterlinas", "Real > Peso Chileno", "Dólar > Real", "Euro > Real",
			"Libras Esterlinas > Real", "Peso argentino > Real", "Peso Chileno > Real" };

	public void MostrarCotacao() {
		String pergunta = (String) JOptionPane.showInputDialog(null, "Qual moeda você quer converter?", "moeda",
				JOptionPane.PLAIN_MESSAGE, null, tipo, "0");

		moeda = 0;
		try {
			moeda = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor:"));
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "Inserir somente valores númericos");
		}

		double calculo = 0;
		if (pergunta == "Real > Dólar") { // conversao para dolar
			calculo = moeda * 5.24;
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " US$");

		} else if (pergunta == "Real > Euro") { // conversao para Euro
			calculo = moeda * 5.61;
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " €");

		} else if (pergunta == "Real > Libras Esterlinas") { // conversao para Libras Esterlinas
			calculo = moeda * 6.43;
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " $");

		} else if (pergunta == "Real > Libras Esterlinas") { // conversao para Peso Argentino
			calculo = moeda * 0.26;
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " £");

		} else if (pergunta == "Real > Peso Chileno") { // conversao para Peso Chileno
			calculo = moeda * 0.63;
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " CLP$");

		} else if (pergunta == "Dólar > Real") { // conversao para Real
			calculo = Math.round(moeda / 5.61);
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " R$");

		} else if (pergunta == "Euro > Real") { // conversao para Real
			calculo = Math.round(moeda / 5.61);
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " R$");

		} else if (pergunta == "Libras Esterlinas > Real") { // conversao para Real
			calculo = Math.round(moeda / 6.43);
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " R$");

		} else if (pergunta == "Libras Esterlinas > Real") { // conversao para Real
			calculo = Math.round(moeda / 0.26);
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " R$");

		} else if (pergunta == "Peso Chileno > Real") { // conversao para Real
			calculo = Math.round(moeda / 0.63);
			JOptionPane.showMessageDialog(null, "O valor convertido fica em " + calculo + " R$");

		} else { // opcao invalida
			JOptionPane.showMessageDialog(null, "Opção Inválida", null, 0);

		}
	}
};
