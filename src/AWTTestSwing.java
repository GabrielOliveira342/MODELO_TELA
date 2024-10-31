import java.awt.BorderLayout; //import da biblioteca BorderLayout
import java.awt.FlowLayout; //import da biblioteca FlowLayout 
import javax.swing.*; //importa todas as classes da interface grafica 

public class AWTTestSwing { //classe da janela 

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("AWT Test"); //cria a janela AWT Test
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cria o botão para o usuario sair 
		frame.setSize(400, 200); //define o tamanho da janela 
		frame.setLayout(new BorderLayout()); //define que a janela vai ser Border Layout 
		
		
		JLabel label1 = new JLabel ("Labell"); //rotulo chamado Labell 
		JTextField textfield1 = new JTextField(15); //cria um campo para texto 
		
		JPanel topPanel = new JPanel();  // cria um painel para o texto
		topPanel.setLayout(new FlowLayout()); //define que o painel sera Flow Layout
		topPanel.add(label1);
		topPanel.add(textfield1);
		
		JButton button1 = new JButton("Button 1"); //cria o botão 1 
		JButton button2 = new JButton("Button 2"); //cria o botão 2
		JButton button3 = new JButton("Button 3"); //cria o botão 3 
		
		JPanel buttonPanel = new JPanel(); //painel para organizar o botão 
		buttonPanel.setLayout(new FlowLayout()); //define para flowLayout 
		buttonPanel.add(button1);//adiciona os 3 botões para o painel
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		
		
		frame.add(topPanel, BorderLayout.NORTH); //adiciona o painel superior no NORTH
		frame.add(buttonPanel, BorderLayout.CENTER); // adiciona o painel de botões no centro da janela
		
		frame.setVisible(true); //mostra a janela na tela 
	}

}
