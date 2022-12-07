package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import data.Conexao;
import negocio.FichaAluno;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfP1;
	private JTextField tfP2;
	private JTextField tfTrabalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Conexao conexao = new Conexao("PostgreSql", "localhost", "5433", "POO", "", "root");
		conexao.conect();
		frame = new JFrame();
		frame.setBounds(100, 100, 328, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 60, 21);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblProva = new JLabel("Prova 1:");
		lblProva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProva.setBounds(10, 43, 60, 21);
		frame.getContentPane().add(lblProva);

		JLabel lblProva_1 = new JLabel("Prova 2:");
		lblProva_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProva_1.setBounds(10, 75, 60, 21);
		frame.getContentPane().add(lblProva_1);

		tfNome = new JTextField();
		tfNome.setBounds(99, 11, 163, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		tfP1 = new JTextField();
		tfP1.setColumns(10);
		tfP1.setBounds(99, 43, 163, 20);
		frame.getContentPane().add(tfP1);

		tfP2 = new JTextField();
		tfP2.setColumns(10);
		tfP2.setBounds(99, 75, 163, 20);
		frame.getContentPane().add(tfP2);

		JButton btAdd = new JButton("Add");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FichaAluno aluno = new FichaAluno(
						tfNome.getText(), 
						Double.parseDouble(tfP1.getText()), 
						Double.parseDouble(tfP2.getText()),
						Double.parseDouble(tfTrabalho.getText())
				);
			}
		});
		btAdd.setBounds(10, 138, 89, 23);
		frame.getContentPane().add(btAdd);

		JButton btListar = new JButton("Listar");
		btListar.setBounds(173, 138, 89, 23);
		frame.getContentPane().add(btListar);

		JLabel lblTrabalho = new JLabel("Trabalho:");
		lblTrabalho.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrabalho.setBounds(10, 107, 60, 21);
		frame.getContentPane().add(lblTrabalho);

		tfTrabalho = new JTextField();
		tfTrabalho.setColumns(10);
		tfTrabalho.setBounds(99, 107, 163, 20);
		frame.getContentPane().add(tfTrabalho);
	}
}
