package exemplo;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ExemploTela extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JButton btnSalvar;
	private JButton btnSair;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploTela frame = new ExemploTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ExemploTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 176);
		contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {
				if(g instanceof Graphics2D) {
					Graphics2D g2d = (Graphics2D)g;
					Image image = new ImageIcon(
							ExemploTela.class.getResource("yosemite.png")).getImage();
					g2d.drawImage(image, 0, 0, null);
				}
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(23, 11, 44, 16);
		contentPane.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(74, 7, 279, 26);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(23, 56, 44, 15);
		contentPane.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(74, 51, 279, 26);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setBounds(24, 105, 106, 25);
		contentPane.add(btnSalvar);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		btnSair.setBounds(247, 105, 106, 25);
		contentPane.add(btnSair);
	}

	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();

		if (botao.equals(btnSalvar)) {
			String nome = tfNome.getText();
			String email = tfEmail.getText();

			JOptionPane.showMessageDialog(this, "Nome: " + nome + " E-mail: " + email);

			tfNome.setText("");
			tfEmail.setText("");
			tfNome.requestFocus();
		} else {
			System.exit(0);
		}
	}
}
