import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janelas_Jframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janelas_Jframe frame = new Janelas_Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janelas_Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 586, 58);
		contentPane.add(panel);
		
		JButton btnSimples = new JButton("Simples");
		btnSimples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome;
				nome = JOptionPane.showInputDialog(btnSimples, "Digite o seu nome:");
				
				JOptionPane.showMessageDialog(btnSimples, "O Nome é "  + nome);
			}
		});
		panel.add(btnSimples);
		
		JButton btnEntrada = new JButton("Entrada");
		panel.add(btnEntrada);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int retorno = 0;
				
				retorno = JOptionPane.showConfirmDialog(btnConfirmar, "Deseja sair?");
				
				if(retorno == 0) {
					JOptionPane.showMessageDialog(btnConfirmar, "Saindo");
				} else {
					JOptionPane.showMessageDialog(btnConfirmar, "Ficando");
				}
			}
		});
		panel.add(btnConfirmar);
		
		JButton btnOpcoes = new JButton("Opçoes");
		btnOpcoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int retorno = 0;
				retorno = JOptionPane.showOptionDialog(btnOpcoes, "Qual é a medida?", "Medidas para calcular", JOptionPane.OK_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, new String [] {"KM", "Milhas", "Jardas", "Polegadas"}, "KM");
						
			
			}
		});
		panel.add(btnOpcoes);
		
		JButton btnDialogo = new JButton("Diálogo");
		btnDialogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Forms_2 telaDialog = new Forms_2();
				telaDialog.setModal(true);
				telaDialog.setVisible(true);
			}
		});
		btnDialogo.setBounds(6, 76, 586, 174);
		contentPane.add(btnDialogo);
	}
}
