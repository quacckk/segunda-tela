//Victor Lima Silva
//Feito em: 14/08/2025
//Segunda aula de JAVA no 4° semestre
package tela_funcional;

import javax.swing.*;
import java.awt.event.*;

public class _tela_funfou {

	public static void main(String[] args) {
		JFrame painel = new JFrame();
		
		painel.setSize(900, 600);
		painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel.setVisible(true);
		painel.setLayout(null);
		painel.setLocationRelativeTo(null);
		
		JButton btnAbrir = new JButton();
		btnAbrir.setBounds(364, 250, 160, 30);
		
		painel.add(btnAbrir);
		
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirJanela();
				painel.setVisible(false);
			}
		});
	}
	public static void abrirJanela() {
		JFrame painel02 = new JFrame();
		JLabel texto = new JLabel("Victor Lima Silva", SwingConstants.CENTER);
		
		painel02.setSize(450, 300);
		painel02.setVisible(true);
		painel02.setLocationRelativeTo(null);
		painel02.setTitle("Segunda tela");
		painel02.add(texto);
		
	}

}
