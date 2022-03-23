package FuncaoLinear;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame{
	private Funcao fun;
	public Main(Funcao f) {
		fun = f;
		editarJanela();
	}

	public void editarJanela() {
		setSize(415,438);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		add(new PlanoCartesiano(fun.getPontos()));
		
	}
	
	public static void main(String[] args) {
		 String a = JOptionPane.showInputDialog("Digite o valor do a: "),b = JOptionPane.showInputDialog("Digite um valor entre -5 a 5 para o b: ");	
		 Funcao f = new Funcao(a,b);
		 new Main(f);

	}

}
