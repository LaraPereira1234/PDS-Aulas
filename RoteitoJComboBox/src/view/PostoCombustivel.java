package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import model.Calculos;
import model.ComboBox;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ButtonGroup;

public class PostoCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtPreco500;
	private JTextField txtPreco1L;
	private JTextField txtQuantidade500;
	private JTextField txtQuantidade2;
	private JTextField txtQuantAbas;
	private JTextField txtDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostoCombustivel frame = new PostoCombustivel();
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
	public PostoCombustivel() {
		Calculos c = new Calculos();
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 226, 134);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[74px][1px][1px][1px][13px][4px][1px][42px][26px][1px]", "[20px][20px][20px][20px]"));
		
		
		
		
		JLabel lblOleoDiesel = new JLabel("Oleo Diesel:");
		panel.add(lblOleoDiesel, "cell 0 0,alignx left,aligny center");
		
		txtOleoDiesel = new JTextField();
		txtOleoDiesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.vDiesel = Float.valueOf(txtOleoDiesel.getText());
			}
		});
		panel.add(txtOleoDiesel, "cell 4 0 5 1,alignx left,aligny top");
		txtOleoDiesel.setColumns(10);
		
		JLabel label = new JLabel("");
		panel.add(label, "cell 4 0,alignx right,aligny center");
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1, "cell 6 0,alignx left,aligny center");
		
		JLabel lblNewLabel = new JLabel("Gas. Comum:");
		panel.add(lblNewLabel, "cell 0 1,alignx left,aligny center");
		
		txtGasComum = new JTextField();
		txtGasComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.vComum = Float.valueOf(txtGasComum.getText());
			}
		});
		panel.add(txtGasComum, "cell 4 1 5 1,alignx left,aligny top");
		txtGasComum.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2, "cell 1 1,alignx left,aligny center");
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		panel.add(lblGasAditivada, "cell 0 2,alignx left,aligny center");
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3, "cell 8 1,alignx left,aligny center");
		
		txtGasAditivada = new JTextField();
		txtGasAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.vAditiva = Float.valueOf(txtGasAditivada.getText());
			}
		});
		panel.add(txtGasAditivada, "cell 4 2 5 1,alignx left,aligny top");
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol, "cell 0 3,alignx left,aligny center");
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4, "cell 2 2,alignx left,aligny center");
		
		JLabel label_5 = new JLabel("");
		panel.add(label_5, "cell 3 2,alignx left,aligny center");
		
		txtEtanol = new JTextField();
		txtEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.vEtanol = Float.valueOf(txtEtanol.getText());
			}
		});
		panel.add(txtEtanol, "cell 4 3 5 1,alignx left,aligny top");
		txtEtanol.setColumns(10);
		
		JLabel label_6 = new JLabel("");
		panel.add(label_6, "cell 9 2,alignx left,aligny center");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(246, 11, 241, 134);
		contentPane.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[63px][86px][]", "[20px][20px]"));
		
		
		JLabel lblPrecoFrascoMotor = new JLabel("Frasco 500ml");
		panel_1.add(lblPrecoFrascoMotor, "cell 0 0,alignx left,aligny center");
		
		txtPreco500 = new JTextField();
		txtPreco500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.v500ml = Float.valueOf(txtPreco500.getText());
			}
		});
		txtPreco500.setText("");
		panel_1.add(txtPreco500, "cell 1 0,alignx left,aligny top");
		txtPreco500.setColumns(10);
		
		JLabel lblPrecoFrasco1L = new JLabel("Frasco 1L");
		panel_1.add(lblPrecoFrasco1L, "cell 0 1,alignx left,aligny center");
		
		txtPreco1L = new JTextField();
		txtPreco1L.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.v1L = Float.valueOf(txtPreco1L.getText());
			}
		});
		panel_1.add(txtPreco1L, "cell 1 1,alignx left,aligny top");
		txtPreco1L.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 143, 477, 114);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[78px][86px][68px][][61px][]", "[14px][24px][20px]"));
		
		
		JLabel lblQuantidade = new JLabel("    Quantidade");
		panel_2.add(lblQuantidade, "cell 1 0,alignx left,aligny top");
		
		JLabel lblValorPagar = new JLabel("Valor a Pagar");
		panel_2.add(lblValorPagar, "cell 3 0,alignx left,aligny top");
		
		JLabel lblTotalOleo = new JLabel("Total Oleo");
		panel_2.add(lblTotalOleo, "cell 5 0,alignx right,aligny top");
		
		JLabel lblOleoMotor500 = new JLabel("Frasco de 500ml");
		panel_2.add(lblOleoMotor500, "cell 0 1,alignx left,aligny center");
		
		JLabel lblValor500 = new JLabel("");
		panel_2.add(lblValor500, "cell 3 1,grow");
		
		JLabel lblTotal2 = new JLabel("");
		panel_2.add(lblTotal2, "cell 5 1,grow");
		
		txtQuantidade500 = new JTextField();
		txtQuantidade500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.q500ml = Float.valueOf(txtQuantidade500.getText());
				lblValor500.setText("R$ "+ c.c500ml());
			    lblTotal2.setText("R$ "+ c.totalOleo());
			}
		});
		panel_2.add(txtQuantidade500, "cell 1 1,alignx left,aligny center");
		txtQuantidade500.setColumns(10);
		
		panel_2.add(lblValor500);
		
		panel_2.add(lblTotal2);
	
		
		JLabel lblOleoMotor1 = new JLabel("Frasco de 1L");
		panel_2.add(lblOleoMotor1, "cell 0 2,alignx left,aligny center");
		
		JLabel lblValor1L = new JLabel("");
		panel_2.add(lblValor1L, "cell 3 2,grow");
		
		txtQuantidade2 = new JTextField();
		txtQuantidade2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.q1L = Float.valueOf(txtQuantidade2.getText());
				lblValor1L.setText("R$ "+ c.c1L());
				lblTotal2.setText("R$ "+ c.totalOleo());
			}
		});
		panel_2.add(txtQuantidade2, "cell 1 2,alignx left,aligny top");
		txtQuantidade2.setColumns(10);
		
		panel_2.add(lblValor1L);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 258, 239, 129);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[104px][10px][36px][10px][62px]", "[20px][20px][22px]"));
		
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 0 0,alignx left,aligny center");
		
		JComboBox<ComboBox> comboBox = new JComboBox<ComboBox>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_3.add(comboBox, "cell 2 0 3 1,alignx left,aligny top");
		comboBox.setToolTipText("");
		comboBox.addItem(ComboBox.Diesel);
		comboBox.addItem(ComboBox.Comum);
		comboBox.addItem(ComboBox.Aditivada);
		comboBox.addItem(ComboBox.Etanol);
		
		JLabel lblQuantidadeAbas = new JLabel("Quantidade de Litros:");
		panel_3.add(lblQuantidadeAbas, "cell 0 1,alignx left,aligny center");
		
		JLabel lblTotalComb2 = new JLabel("");
		panel_3.add(lblTotalComb2, "cell 4 2,grow");
		
		txtQuantAbas = new JTextField();
		txtQuantAbas.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int posicao = comboBox.getSelectedIndex();
				float qLitros = Float.valueOf(txtQuantAbas.getText());
				if(posicao == 0)
				{
					lblTotalComb2.setText("R$ "+ c.Diesel(qLitros));
				}
				else if(posicao == 1)
				{
					lblTotalComb2.setText("R$ "+ c.Comum(qLitros));
				}
				else if(posicao == 2)
				{
					lblTotalComb2.setText("R$ "+ c.Aditiva(qLitros));
				}
				else if(posicao == 3)
				{
					lblTotalComb2.setText("R$ "+ c.Etanol(qLitros));
				}
			}
		});
		panel_3.add(txtQuantAbas, "cell 2 1 3 1,alignx left,aligny top");
		txtQuantAbas.setColumns(10);
		
		JLabel lblTotalComb = new JLabel("Total Combustivel:");
		panel_3.add(lblTotalComb, "cell 0 2 3 1,alignx right,aligny bottom");
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(259, 258, 228, 129);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[63px][24px][17px][5px][2px][10px][86px]", "[23px][6px][23px][15px]"));
		
		
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		buttonGroup.add(rdbtnVista);
		panel_4.add(rdbtnVista, "cell 0 0,alignx left,aligny top");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_4.add(rdbtnPrazo, "cell 0 2,alignx left,aligny top");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 0 3 3,alignx left,aligny center");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 6 0 1 3,alignx left,aligny center");
		txtDias.setColumns(10);
		
		JLabel lblPagar = new JLabel("Total a Pagar:");
		panel_4.add(lblPagar, "cell 0 3 3 1,alignx right,aligny top");
		
		JLabel lblTotalPagar = new JLabel("");
		panel_4.add(lblTotalPagar, "cell 4 3 3 1,alignx left,growy");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnVista.isSelected()) 
				{
					String total = c.TotalPagarVista();
					lblTotalPagar.setText("R$ "+total);
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer dias = Integer.valueOf(txtDias.getText());
					if(dias <= 30)
					{
						String total = c.totalPagarPrazo();
						lblTotalPagar.setText("R$ "+total);
					}
					else if(dias > 30)
					{
						String total = c.totalPagarPrazo30();
						lblTotalPagar.setText("R$ "+total);
					}
				}
			}
		});
		btnCalcular.setBounds(40, 404, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnCalculo = new JButton("Novo Calculo");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOleoDiesel.setText(null);
			    txtGasComum.setText(null);
				txtGasAditivada.setText(null);
				txtEtanol.setText(null);
				txtPreco500.setText(null);
				txtPreco1L.setText(null);
				txtQuantidade500.setText(null);
				txtQuantidade2.setText(null);
				txtQuantAbas.setText(null);
				txtDias.setText(null);
				lblValor500.setText("-");
				lblValor1L.setText("-");
				lblTotalComb2.setText("-");
				lblTotalPagar.setText(null);
				lblTotal2.setText("-");
			}
		});
		btnCalculo.setBounds(189, 404, 110, 23);
		contentPane.add(btnCalculo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(350, 404, 89, 23);
		contentPane.add(btnFechar);
	}
}
