package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import negocio.Forca;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class App {

	private JFrame frame;
	
	private static int resId = 0;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Forca forca;
	private JTextField tfLetra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();  
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Inicio", null, panel, null);
		panel.setLayout(null);
		
		final JRadioButton rbFilmes = new JRadioButton("Filmes");
		rbFilmes.setSelected(true);
		buttonGroup.add(rbFilmes);
		rbFilmes.setBounds(250, 5, 113, 23);
		panel.add(rbFilmes);
		
		final JRadioButton rbNovelas = new JRadioButton("Novelas");
		buttonGroup.add(rbNovelas);
		rbNovelas.setBounds(368, 5, 113, 23);
		panel.add(rbNovelas);
		
		JRadioButton rbCarros = new JRadioButton("Carros");
		buttonGroup.add(rbCarros);
		rbCarros.setBounds(480, 5, 81, 23);
		panel.add(rbCarros);
		
		JButton btIniciar = new JButton("Iniciar");
		btIniciar.setBounds(360, 105, 89, 23);
		panel.add(btIniciar);
		
		JPanel Jogo = new JPanel();
		Jogo.setToolTipText("");
		tabbedPane.addTab("Jogo", null, Jogo, null);
		tabbedPane.setEnabledAt(1, false);
		Jogo.setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(getNextResource());
		lblImage.setBounds(10, 11, 327, 271);
		Jogo.add(lblImage);
		
		JLabel lblNewLabel = new JLabel("Letra");
		lblNewLabel.setBounds(403, 115, 49, 14);
		Jogo.add(lblNewLabel);
		
		tfLetra = new JTextField();
		tfLetra.setBounds(469, 112, 96, 20);
		Jogo.add(tfLetra);
		tfLetra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Já foram sorteadas: ");
		lblNewLabel_1.setBounds(403, 162, 261, 14);
		Jogo.add(lblNewLabel_1);
		
		JLabel lblSorteadas = new JLabel("");
		lblSorteadas.setToolTipText("xxx");
		lblSorteadas.setBounds(403, 219, 49, 14);
		Jogo.add(lblSorteadas);
		
		JButton btJogar = new JButton("Jogar");
		btJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char c = tfLetra.getText().charAt(0);
				
			}
		});
		btJogar.setBounds(403, 244, 89, 23);
		Jogo.add(btJogar);
		
		final JLabel lblPalavra = new JLabel("");
		lblPalavra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPalavra.setBounds(403, 331, 373, 14);
		Jogo.add(lblPalavra);
		
		
		btIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbFilmes.isSelected()) {
					forca = new Forca("Filmes");
				}else if (rbNovelas.isSelected()) {
					forca = new Forca("Novelas");
				}else {
					forca = new Forca("Carros");
				}
				tabbedPane.setEnabledAt(1, true);
				tabbedPane.setEnabledAt(0, false);
				tabbedPane.setSelectedIndex(1);
				lblPalavra.setText(forca.getPalavraPreenchida());
			}
		});
	}
	
	public ImageIcon getNextResource() {
		StringBuilder filePath = new StringBuilder("/res/drawable/");
		if (resId <= 6) 
			++resId;
		filePath.append(resId).append(".jpg");
		return new ImageIcon(App.class.getResource(filePath.toString()));

	}
}
