package main;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private static GUI window;
	private Calculator c;
	private JFrame frame;
	private ImageIcon icon;
	private ArrayList<Pokemon> pList;
	private JTextArea textArea;
	private JButton btnCompute;
	private JLabel lblAttacker;
	private JLabel lblDefender;		
	private JTextField textFieldNameA;
	private JTextField textFieldNameD;
	private JLabel lblHpA;
	private JLabel lblHpD;
	private JLabel lblBSA;
	private JLabel lblEVA;
	private JLabel lblBSD;
	private JLabel lblEVD;
	private JLabel lblPresettingA;
	private JLabel lblPresettingD;
	private JComboBox<String> comboBoxPresettingA;
	private JComboBox<String> comboBoxPresettingD;
	private JLabel lblNatureA;
	private JLabel lblNatureD;
	private JLabel lblAtkA;
	private JLabel lblDefA;
	private JLabel lblSAtkA;
	private JLabel lblSDefA;
	private JLabel lblSpdA;
	private JLabel lblAtkD;
	private JLabel lblDefD;
	private JLabel lblSAtkD;
	private JLabel lblSDefD;
	private JLabel lblSpdD;
	private JTextField textFieldBSHpA;
	private JTextField textFieldBSAtkA;
	private JTextField textFieldBSDefA;
	private JTextField textFieldBSSAtkA;
	private JTextField textFieldBSSDefA;
	private JTextField textFieldBSSpdA;
	private JTextField textFieldBSHpD;
	private JTextField textFieldBSAtkD;
	private JTextField textFieldBSDefD;
	private JTextField textFieldBSSAtkD;
	private JTextField textFieldBSSDefD;
	private JTextField textFieldBSSpdD;
	private JTextField textFieldEVHpA;
	private JTextField textFieldEVAtkA;
	private JTextField textFieldEVDefA;
	private JTextField textFieldEVSAtkA;
	private JTextField textFieldEVSDefA;
	private JTextField textFieldEVSpdA;
	private JTextField textFieldEVHpD;
	private JTextField textFieldEVAtkD;
	private JTextField textFieldEVDefD;
	private JTextField textFieldEVSAtkD;
	private JTextField textFieldEVSDefD;
	private JTextField textFieldEVSpdD;
	private JRadioButton[][] radioButtonNatureA;
	private JRadioButton[][] radioButtonNatureD;
	private ButtonGroup[] bGNature;
	private JLabel lblValueA;
	private JLabel lblValueD;
	private JTextField[] textFieldValueA;
	private JTextField[] textFieldValueD;
	private JLabel lblAtkCategory;
	private JLabel lblAtkType;
	private JLabel lblAtkPower;
	private JComboBox<String> comboBoxAtkCategory;
	private JTextField textFieldAtkType;
	private JTextField textFieldAtkPower;
	private JLabel lblAtkPowerC;
	private JLabel lblAtkC;
	private JLabel lblDefC;
	private JLabel lblDamageC;
	private JTextField textFieldAtkPowerC;
	private JTextField textFieldAtkC;
	private JTextField textFieldDefC;
	private JTextField textFieldDamageC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		window = new GUI();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.mainLoop();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		c = new Calculator();
		
		frame = new JFrame();
		icon = new ImageIcon("icon.png");
		frame.setBounds(100, 100, 800, 600);
		frame.setTitle("数据是不会说谎的！");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblAttacker = new JLabel("攻");
		lblAttacker.setBounds(10, 11, 30, 14);
		frame.getContentPane().add(lblAttacker);
		
		lblDefender = new JLabel("受");
		lblDefender.setBounds(387, 11, 30, 14);
		frame.getContentPane().add(lblDefender);
		
		btnCompute = new JButton("看见了！一巡之后！");
		btnCompute.setBounds(10, 375, 200, 50);
		frame.getContentPane().add(btnCompute);
		
		textArea = new JTextArea();
		textArea.setBounds(230, 375, 350, 150);
		frame.getContentPane().add(textArea);
		
		textFieldNameA = new JTextField();
		textFieldNameA.setBounds(70, 8, 96, 20);
		frame.getContentPane().add(textFieldNameA);
		textFieldNameA.setColumns(10);
		
		textFieldNameD = new JTextField();
		textFieldNameD.setBounds(447, 8, 96, 20);
		frame.getContentPane().add(textFieldNameD);
		textFieldNameD.setColumns(10);
		
		lblHpA = new JLabel("HP");
		lblHpA.setBounds(10, 89, 46, 14);
		frame.getContentPane().add(lblHpA);
		
		lblHpD = new JLabel("HP");
		lblHpD.setBounds(387, 89, 46, 14);
		frame.getContentPane().add(lblHpD);
		
		lblBSA = new JLabel("\u79CD\u65CF");
		lblBSA.setBounds(70, 64, 46, 14);
		frame.getContentPane().add(lblBSA);
		
		lblEVA = new JLabel("\u52AA\u529B");
		lblEVA.setBounds(120, 64, 46, 14);
		frame.getContentPane().add(lblEVA);
		
		lblBSD = new JLabel("\u79CD\u65CF");
		lblBSD.setBounds(447, 64, 46, 14);
		frame.getContentPane().add(lblBSD);
		
		lblEVD = new JLabel("\u52AA\u529B");
		lblEVD.setBounds(497, 64, 46, 14);
		frame.getContentPane().add(lblEVD);
		
		lblPresettingA = new JLabel("\u8BFB\u53D6\u9884\u8BBE");
		lblPresettingA.setBounds(10, 36, 60, 14);
		frame.getContentPane().add(lblPresettingA);
		
		lblPresettingD = new JLabel("\u8BFB\u53D6\u9884\u8BBE");
		lblPresettingD.setBounds(387, 36, 60, 14);
		frame.getContentPane().add(lblPresettingD);
		
		comboBoxPresettingA = new JComboBox<String>();
		comboBoxPresettingA.setBounds(70, 33, 96, 20);
		frame.getContentPane().add(comboBoxPresettingA);
		comboBoxPresettingA.addItem("极限物攻");
		comboBoxPresettingA.addItem("极限特攻");
		comboBoxPresettingA.addItem("满物攻");	
		comboBoxPresettingA.addItem("满特攻");
		comboBoxPresettingA.addItem("极限物耐");	
		comboBoxPresettingA.addItem("极限特耐");
		
		comboBoxPresettingD = new JComboBox<String>();
		comboBoxPresettingD.setBounds(447, 33, 96, 20);
		frame.getContentPane().add(comboBoxPresettingD);
		comboBoxPresettingD.addItem("极限物攻");
		comboBoxPresettingD.addItem("极限特攻");
		comboBoxPresettingD.addItem("满物攻");	
		comboBoxPresettingD.addItem("满特攻");
		comboBoxPresettingD.addItem("极限物耐");	
		comboBoxPresettingD.addItem("极限特耐");
		
		lblNatureA = new JLabel("\u6027\u683C + -");
		lblNatureA.setBounds(170, 64, 46, 14);
		frame.getContentPane().add(lblNatureA);
		
		lblNatureD = new JLabel("\u6027\u683C + -");
		lblNatureD.setBounds(547, 64, 46, 14);
		frame.getContentPane().add(lblNatureD);
		
		lblAtkA = new JLabel("\u653B\u51FB");
		lblAtkA.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(lblAtkA);
		
		lblDefA = new JLabel("\u9632\u5FA1");
		lblDefA.setBounds(10, 139, 46, 14);
		frame.getContentPane().add(lblDefA);
		
		lblSAtkA = new JLabel("\u7279\u653B");
		lblSAtkA.setBounds(10, 164, 46, 14);
		frame.getContentPane().add(lblSAtkA);
		
		lblSDefA = new JLabel("\u7279\u9632");
		lblSDefA.setBounds(10, 189, 46, 14);
		frame.getContentPane().add(lblSDefA);
		
		lblSpdA = new JLabel("\u901F\u5EA6");
		lblSpdA.setBounds(10, 214, 46, 14);
		frame.getContentPane().add(lblSpdA);
		
		lblAtkD = new JLabel("\u653B\u51FB");
		lblAtkD.setBounds(387, 114, 46, 14);
		frame.getContentPane().add(lblAtkD);
		
		lblDefD = new JLabel("\u9632\u5FA1");
		lblDefD.setBounds(387, 139, 46, 14);
		frame.getContentPane().add(lblDefD);
		
		lblSAtkD = new JLabel("\u7279\u653B");
		lblSAtkD.setBounds(387, 164, 46, 14);
		frame.getContentPane().add(lblSAtkD);
		
		lblSDefD = new JLabel("\u7279\u9632");
		lblSDefD.setBounds(387, 189, 46, 14);
		frame.getContentPane().add(lblSDefD);
		
		lblSpdD = new JLabel("\u901F\u5EA6");
		lblSpdD.setBounds(387, 214, 46, 14);
		frame.getContentPane().add(lblSpdD);
		
		textFieldBSHpA = new JTextField();
		textFieldBSHpA.setEditable(false);
		textFieldBSHpA.setBounds(70, 86, 40, 20);
		frame.getContentPane().add(textFieldBSHpA);
		textFieldBSHpA.setColumns(10);
		
		textFieldBSAtkA = new JTextField();
		textFieldBSAtkA.setEditable(false);
		textFieldBSAtkA.setBounds(70, 111, 40, 20);
		frame.getContentPane().add(textFieldBSAtkA);
		textFieldBSAtkA.setColumns(10);
		
		textFieldBSDefA = new JTextField();
		textFieldBSDefA.setEditable(false);
		textFieldBSDefA.setBounds(70, 136, 40, 20);
		frame.getContentPane().add(textFieldBSDefA);
		textFieldBSDefA.setColumns(10);
		
		textFieldBSSAtkA = new JTextField();
		textFieldBSSAtkA.setEditable(false);
		textFieldBSSAtkA.setBounds(70, 161, 40, 20);
		frame.getContentPane().add(textFieldBSSAtkA);
		textFieldBSSAtkA.setColumns(10);
		
		textFieldBSSDefA = new JTextField();
		textFieldBSSDefA.setEditable(false);
		textFieldBSSDefA.setBounds(70, 186, 40, 20);
		frame.getContentPane().add(textFieldBSSDefA);
		textFieldBSSDefA.setColumns(10);
		
		textFieldBSSpdA = new JTextField();
		textFieldBSSpdA.setEditable(false);
		textFieldBSSpdA.setBounds(70, 211, 40, 20);
		frame.getContentPane().add(textFieldBSSpdA);
		textFieldBSSpdA.setColumns(10);
		
		textFieldBSHpD = new JTextField();
		textFieldBSHpD.setEditable(false);
		textFieldBSHpD.setBounds(447, 86, 40, 20);
		frame.getContentPane().add(textFieldBSHpD);
		textFieldBSHpD.setColumns(10);
		
		textFieldBSAtkD = new JTextField();
		textFieldBSAtkD.setEditable(false);
		textFieldBSAtkD.setBounds(447, 111, 40, 20);
		frame.getContentPane().add(textFieldBSAtkD);
		textFieldBSAtkD.setColumns(10);
		
		textFieldBSDefD = new JTextField();
		textFieldBSDefD.setEditable(false);
		textFieldBSDefD.setBounds(447, 136, 40, 20);
		frame.getContentPane().add(textFieldBSDefD);
		textFieldBSDefD.setColumns(10);
		
		textFieldBSSAtkD = new JTextField();
		textFieldBSSAtkD.setEditable(false);
		textFieldBSSAtkD.setBounds(447, 161, 40, 20);
		frame.getContentPane().add(textFieldBSSAtkD);
		textFieldBSSAtkD.setColumns(10);
		
		textFieldBSSDefD = new JTextField();
		textFieldBSSDefD.setEditable(false);
		textFieldBSSDefD.setBounds(447, 186, 40, 20);
		frame.getContentPane().add(textFieldBSSDefD);
		textFieldBSSDefD.setColumns(10);
		
		textFieldBSSpdD = new JTextField();
		textFieldBSSpdD.setEditable(false);
		textFieldBSSpdD.setBounds(447, 211, 40, 20);
		frame.getContentPane().add(textFieldBSSpdD);
		textFieldBSSpdD.setColumns(10);
		
		textFieldEVHpA = new JTextField();
		textFieldEVHpA.setBounds(120, 86, 40, 20);
		frame.getContentPane().add(textFieldEVHpA);
		textFieldEVHpA.setColumns(10);
		textFieldEVHpA.setText("4");
		
		textFieldEVAtkA = new JTextField();
		textFieldEVAtkA.setBounds(120, 111, 40, 20);
		frame.getContentPane().add(textFieldEVAtkA);
		textFieldEVAtkA.setColumns(10);
		textFieldEVAtkA.setText("252");
		
		textFieldEVDefA = new JTextField();
		textFieldEVDefA.setBounds(120, 136, 40, 20);
		frame.getContentPane().add(textFieldEVDefA);
		textFieldEVDefA.setColumns(10);
		textFieldEVDefA.setText("0");
		
		textFieldEVSAtkA = new JTextField();
		textFieldEVSAtkA.setBounds(120, 161, 40, 20);
		frame.getContentPane().add(textFieldEVSAtkA);
		textFieldEVSAtkA.setColumns(10);
		textFieldEVSAtkA.setText("252");
		
		textFieldEVSDefA = new JTextField();
		textFieldEVSDefA.setBounds(120, 186, 40, 20);
		frame.getContentPane().add(textFieldEVSDefA);
		textFieldEVSDefA.setColumns(10);
		textFieldEVSDefA.setText("0");
		
		textFieldEVSpdA = new JTextField();
		textFieldEVSpdA.setBounds(120, 211, 40, 20);
		frame.getContentPane().add(textFieldEVSpdA);
		textFieldEVSpdA.setColumns(10);
		textFieldEVSpdA.setText("0");
		
		textFieldEVHpD = new JTextField();
		textFieldEVHpD.setBounds(497, 86, 40, 20);
		frame.getContentPane().add(textFieldEVHpD);
		textFieldEVHpD.setColumns(10);
		textFieldEVHpD.setText("252");
		
		textFieldEVAtkD = new JTextField();
		textFieldEVAtkD.setBounds(497, 111, 40, 20);
		frame.getContentPane().add(textFieldEVAtkD);
		textFieldEVAtkD.setColumns(10);
		textFieldEVAtkD.setText("0");
		
		textFieldEVDefD = new JTextField();
		textFieldEVDefD.setBounds(497, 136, 40, 20);
		frame.getContentPane().add(textFieldEVDefD);
		textFieldEVDefD.setColumns(10);
		textFieldEVDefD.setText("252");
		
		textFieldEVSAtkD = new JTextField();
		textFieldEVSAtkD.setBounds(497, 161, 40, 20);
		frame.getContentPane().add(textFieldEVSAtkD);
		textFieldEVSAtkD.setColumns(10);
		textFieldEVSAtkD.setText("0");
		
		textFieldEVSDefD = new JTextField();
		textFieldEVSDefD.setBounds(497, 186, 40, 20);
		frame.getContentPane().add(textFieldEVSDefD);
		textFieldEVSDefD.setColumns(10);
		textFieldEVSDefD.setText("4");
		
		textFieldEVSpdD = new JTextField();
		textFieldEVSpdD.setBounds(497, 211, 40, 20);
		frame.getContentPane().add(textFieldEVSpdD);
		textFieldEVSpdD.setColumns(10);
		textFieldEVSpdD.setText("0");
		
		lblValueA = new JLabel("\u503C");
		lblValueA.setBounds(230, 64, 46, 14);
		frame.getContentPane().add(lblValueA);
		
		lblValueD = new JLabel("\u503C");
		lblValueD.setBounds(607, 64, 46, 14);
		frame.getContentPane().add(lblValueD);
		
		lblAtkCategory = new JLabel("\u7C7B\u522B");
		lblAtkCategory.setBounds(10, 275, 46, 14);
		frame.getContentPane().add(lblAtkCategory);
		
		lblAtkType = new JLabel("\u5C5E\u6027");
		lblAtkType.setBounds(80, 275, 46, 14);
		frame.getContentPane().add(lblAtkType);
		
		lblAtkPower = new JLabel("\u5A01\u529B");
		lblAtkPower.setBounds(150, 275, 46, 14);
		frame.getContentPane().add(lblAtkPower);

		comboBoxAtkCategory = new JComboBox<String>();
		comboBoxAtkCategory.setBounds(10, 300, 60, 20);
		frame.getContentPane().add(comboBoxAtkCategory);
		comboBoxAtkCategory.addItem("物");
		comboBoxAtkCategory.addItem("特");
		comboBoxAtkCategory.addItem("特物");	
		
		textFieldAtkType = new JTextField();
		textFieldAtkType.setBounds(80, 300, 40, 20);
		frame.getContentPane().add(textFieldAtkType);
		textFieldAtkType.setColumns(10);
			
		textFieldAtkPower = new JTextField();
		textFieldAtkPower.setBounds(150, 300, 40, 20);
		frame.getContentPane().add(textFieldAtkPower);
		textFieldAtkPower.setColumns(10);
		
		lblAtkPowerC = new JLabel("\u5A01\u529B\u4FEE\u6B63");
		lblAtkPowerC.setBounds(230, 275, 75, 14);
		frame.getContentPane().add(lblAtkPowerC);
		
		lblAtkC = new JLabel("\u653B\u51FB\u529B\u4FEE\u6B63");
		lblAtkC.setBounds(305, 275, 75, 14);
		frame.getContentPane().add(lblAtkC);
		
		lblDefC = new JLabel("\u9632\u5FA1\u529B\u4FEE\u6B63");
		lblDefC.setBounds(380, 275, 75, 14);
		frame.getContentPane().add(lblDefC);
		
		lblDamageC = new JLabel("\u4F24\u5BB3\u4FEE\u6B63");
		lblDamageC.setBounds(455, 275, 75, 14);
		frame.getContentPane().add(lblDamageC);
		
		textFieldAtkPowerC = new JTextField();
		textFieldAtkPowerC.setBounds(230, 300, 40, 20);
		frame.getContentPane().add(textFieldAtkPowerC);
		textFieldAtkPowerC.setColumns(10);
		textFieldAtkPowerC.setText("1");
		
		textFieldAtkC = new JTextField();
		textFieldAtkC.setBounds(305, 300, 40, 20);
		frame.getContentPane().add(textFieldAtkC);
		textFieldAtkC.setColumns(10);
		textFieldAtkC.setText("1");
		
		textFieldDefC = new JTextField();
		textFieldDefC.setText("");
		textFieldDefC.setBounds(380, 300, 40, 20);
		frame.getContentPane().add(textFieldDefC);
		textFieldDefC.setColumns(10);
		textFieldDefC.setText("1");
		
		textFieldDamageC = new JTextField();
		textFieldDamageC.setBounds(455, 300, 40, 20);
		frame.getContentPane().add(textFieldDamageC);
		textFieldDamageC.setColumns(10);
		textFieldDamageC.setText("1");
		
		textFieldValueA = new JTextField[6];
		for (int i=0; i<6; i++) {
			textFieldValueA[i] = new JTextField();
			textFieldValueA[i].setEditable(false);
			textFieldValueA[i].setBounds(230, 86+25*i, 40, 20);
			frame.getContentPane().add(textFieldValueA[i]);
			textFieldValueA[i].setColumns(10);
		}
		
		textFieldValueD = new JTextField[6];
		for (int i=0; i<6; i++) {
			textFieldValueD[i] = new JTextField();
			textFieldValueD[i].setEditable(false);
			textFieldValueD[i].setBounds(607, 86+25*i, 40, 20);
			frame.getContentPane().add(textFieldValueD[i]);
			textFieldValueD[i].setColumns(10);
		}
		
		bGNature = new ButtonGroup[4];
		radioButtonNatureA = new JRadioButton[2][5];
		for (int i=0; i<2; i++){
			bGNature[i] = new ButtonGroup();
			for (int j=0; j<5; j++){
				radioButtonNatureA[i][j] = new JRadioButton();
				radioButtonNatureA[i][j].setBounds(170+i*25, 108+25*j, 23, 23);
				frame.getContentPane().add(radioButtonNatureA[i][j]);
				bGNature[i].add(radioButtonNatureA[i][j]);
			}
		}
		radioButtonNatureA[0][0].setSelected(true);
		radioButtonNatureA[1][1].setSelected(true);
		radioButtonNatureD = new JRadioButton[2][5];
		for (int i=0; i<2; i++){
			bGNature[i+2] = new ButtonGroup();
			for (int j=0; j<5; j++){
				radioButtonNatureD[i][j] = new JRadioButton();
				radioButtonNatureD[i][j].setBounds(547+i*25, 108+25*j, 23, 23);
				frame.getContentPane().add(radioButtonNatureD[i][j]);
				bGNature[i+2].add(radioButtonNatureD[i][j]);
			}
		}
		radioButtonNatureD[0][1].setSelected(true);
		radioButtonNatureD[1][2].setSelected(true);
		
		pList = new ArrayList<Pokemon>();
		try {
			Scanner s = new Scanner(new File("pokemon.txt"));
			while (s.hasNext()) {
				pList.add(new Pokemon(s.next(), s.next(), s.next(),
						s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), 
						s.nextInt(), s.nextInt()));
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	private void mainLoop() {
		
		comboBoxPresettingA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxPresettingA.getSelectedItem().equals("极限物攻")) {
					textFieldEVHpA.setText("4");
					textFieldEVAtkA.setText("252");
					textFieldEVDefA.setText("0");
					textFieldEVSAtkA.setText("0");
					textFieldEVSDefA.setText("0");
					textFieldEVSpdA.setText("252");
					radioButtonNatureA[0][0].setSelected(true);
					radioButtonNatureA[1][2].setSelected(true);
				}
				else if (comboBoxPresettingA.getSelectedItem().equals("极限特攻")) {
					textFieldEVHpA.setText("4");
					textFieldEVAtkA.setText("0");
					textFieldEVDefA.setText("0");
					textFieldEVSAtkA.setText("252");
					textFieldEVSDefA.setText("0");
					textFieldEVSpdA.setText("252");
					radioButtonNatureA[0][2].setSelected(true);
					radioButtonNatureA[1][0].setSelected(true);
				}
				else if (comboBoxPresettingA.getSelectedItem().equals("满物攻")) {
					textFieldEVHpA.setText("4");
					textFieldEVAtkA.setText("252");
					textFieldEVDefA.setText("0");
					textFieldEVSAtkA.setText("0");
					textFieldEVSDefA.setText("0");
					textFieldEVSpdA.setText("252");
					radioButtonNatureA[0][4].setSelected(true);
					radioButtonNatureA[1][2].setSelected(true);
				}
				else if (comboBoxPresettingA.getSelectedItem().equals("满特攻")) {
					textFieldEVHpA.setText("4");
					textFieldEVAtkA.setText("0");
					textFieldEVDefA.setText("0");
					textFieldEVSAtkA.setText("252");
					textFieldEVSDefA.setText("0");
					textFieldEVSpdA.setText("252");
					radioButtonNatureA[0][4].setSelected(true);
					radioButtonNatureA[1][0].setSelected(true);
				}
				else if (comboBoxPresettingA.getSelectedItem().equals("极限物耐")) {
					textFieldEVHpA.setText("252");
					textFieldEVAtkA.setText("0");
					textFieldEVDefA.setText("252");
					textFieldEVSAtkA.setText("0");
					textFieldEVSDefA.setText("0");
					textFieldEVSpdA.setText("4");
					radioButtonNatureA[0][1].setSelected(true);
					radioButtonNatureA[1][2].setSelected(true);
				}
				else if (comboBoxPresettingA.getSelectedItem().equals("极限特耐")) {
					textFieldEVHpA.setText("252");
					textFieldEVAtkA.setText("0");
					textFieldEVDefA.setText("0");
					textFieldEVSAtkA.setText("0");
					textFieldEVSDefA.setText("252");
					textFieldEVSpdA.setText("4");
					radioButtonNatureA[0][3].setSelected(true);
					radioButtonNatureA[1][0].setSelected(true);
				}
			}
		});
		
		comboBoxPresettingD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxPresettingD.getSelectedItem().equals("极限物攻")) {
					textFieldEVHpD.setText("4");
					textFieldEVAtkD.setText("252");
					textFieldEVDefD.setText("0");
					textFieldEVSAtkD.setText("0");
					textFieldEVSDefD.setText("0");
					textFieldEVSpdD.setText("252");
					radioButtonNatureD[0][0].setSelected(true);
					radioButtonNatureD[1][2].setSelected(true);
				}
				else if (comboBoxPresettingD.getSelectedItem().equals("极限特攻")) {
					textFieldEVHpD.setText("4");
					textFieldEVAtkD.setText("0");
					textFieldEVDefD.setText("0");
					textFieldEVSAtkD.setText("252");
					textFieldEVSDefD.setText("0");
					textFieldEVSpdD.setText("252");
					radioButtonNatureD[0][2].setSelected(true);
					radioButtonNatureD[1][0].setSelected(true);
				}
				else if (comboBoxPresettingD.getSelectedItem().equals("满物攻")) {
					textFieldEVHpD.setText("4");
					textFieldEVAtkD.setText("252");
					textFieldEVDefD.setText("0");
					textFieldEVSAtkD.setText("0");
					textFieldEVSDefD.setText("0");
					textFieldEVSpdD.setText("252");
					radioButtonNatureD[0][4].setSelected(true);
					radioButtonNatureD[1][2].setSelected(true);
				}
				else if (comboBoxPresettingD.getSelectedItem().equals("满特攻")) {
					textFieldEVHpD.setText("4");
					textFieldEVAtkD.setText("0");
					textFieldEVDefD.setText("0");
					textFieldEVSAtkD.setText("252");
					textFieldEVSDefD.setText("0");
					textFieldEVSpdD.setText("252");
					radioButtonNatureD[0][4].setSelected(true);
					radioButtonNatureD[1][0].setSelected(true);
				}
				else if (comboBoxPresettingD.getSelectedItem().equals("极限物耐")) {
					textFieldEVHpD.setText("252");
					textFieldEVAtkD.setText("0");
					textFieldEVDefD.setText("252");
					textFieldEVSAtkD.setText("0");
					textFieldEVSDefD.setText("0");
					textFieldEVSpdD.setText("4");
					radioButtonNatureD[0][1].setSelected(true);
					radioButtonNatureD[1][2].setSelected(true);
				}
				else if (comboBoxPresettingD.getSelectedItem().equals("极限特耐")) {
					textFieldEVHpD.setText("252");
					textFieldEVAtkD.setText("0");
					textFieldEVDefD.setText("0");
					textFieldEVSAtkD.setText("0");
					textFieldEVSDefD.setText("252");
					textFieldEVSpdD.setText("4");
					radioButtonNatureD[0][3].setSelected(true);
					radioButtonNatureD[1][0].setSelected(true);
				}
			}
		});
		
		btnCompute.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (checkInput()) {
					Pokemon A = null;
					for (Pokemon pm : pList) {
						if (pm.getName().equals(textFieldNameA.getText())) {
							A = pm;
							break;
						}
					}
					Pokemon D = null;
					for (Pokemon pm : pList) {
						if (pm.getName().equals(textFieldNameD.getText())) {
							D = pm;
							break;
						}
					}
					if (A == null || D == null)
						JOptionPane.showMessageDialog(frame,
								"未在数据库中发现，请做好数据收集工作！");
					else {
						// --------------- PM A ------------------
						double natureA[] = new double[5];
						for (int i = 0; i < 5; i++)
							natureA[i] = 1.0;
						for (int i = 0; i < 5; i++) {
							if (radioButtonNatureA[0][i].isSelected()) {
								if (!radioButtonNatureA[1][i].isSelected())
									natureA[i] = 1.1;
								else
									break;
							}
							if (radioButtonNatureA[1][i].isSelected())
								natureA[i] = 0.9;
						}

						int hpBsStatA = A.getHp();
						textFieldBSHpA.setText(Integer.toString(hpBsStatA));
						int hpStatA = c.getHp(hpBsStatA,
								Integer.parseInt(textFieldEVHpA.getText()));
						textFieldValueA[0].setText(Integer.toString(hpStatA));

						int atkBsStatA = A.getAtk();
						textFieldBSAtkA.setText(Integer.toString(atkBsStatA));
						int atkStatA = (int) (c.getOtherStat(atkBsStatA,
								Integer.parseInt(textFieldEVAtkA.getText())) * natureA[0]);
						textFieldValueA[1].setText(Integer.toString(atkStatA));

						int defBsStatA = A.getDef();
						textFieldBSDefA.setText(Integer.toString(defBsStatA));
						int defStatA = (int) (c.getOtherStat(defBsStatA,
								Integer.parseInt(textFieldEVDefA.getText())) * natureA[1]);
						textFieldValueA[2].setText(Integer.toString(defStatA));

						int sAtkBsStatA = A.getSAtk();
						textFieldBSSAtkA.setText(Integer.toString(sAtkBsStatA));
						int sAtkStatA = (int) (c.getOtherStat(sAtkBsStatA,
								Integer.parseInt(textFieldEVSAtkA.getText())) * natureA[2]);
						textFieldValueA[3].setText(Integer.toString(sAtkStatA));

						int sDefBsStatA = A.getSDef();
						textFieldBSSDefA.setText(Integer.toString(sDefBsStatA));
						int sDefStatA = (int) (c.getOtherStat(sDefBsStatA,
								Integer.parseInt(textFieldEVSDefA.getText())) * natureA[3]);
						textFieldValueA[4].setText(Integer.toString(sDefStatA));

						int spdBsStatA = A.getSpd();
						textFieldBSSpdA.setText(Integer.toString(spdBsStatA));
						int spdStatA = (int) (c.getOtherStat(spdBsStatA,
								Integer.parseInt(textFieldEVSpdA.getText())) * natureA[4]);
						textFieldValueA[5].setText(Integer.toString(spdStatA));

						// --------------- PM D ------------------
						double natureD[] = new double[5];
						for (int i = 0; i < 5; i++)
							natureD[i] = 1.0;
						for (int i = 0; i < 5; i++) {
							if (radioButtonNatureD[0][i].isSelected()) {
								if (!radioButtonNatureD[1][i].isSelected())
									natureD[i] = 1.1;
								else
									break;
							}
							if (radioButtonNatureD[1][i].isSelected())
								natureD[i] = 0.9;
						}

						int hpBsStatD = D.getHp();
						textFieldBSHpD.setText(Integer.toString(hpBsStatD));
						int hpStatD = c.getHp(hpBsStatD,
								Integer.parseInt(textFieldEVHpD.getText()));
						textFieldValueD[0].setText(Integer.toString(hpStatD));

						int atkBsStatD = D.getAtk();
						textFieldBSAtkD.setText(Integer.toString(atkBsStatD));
						int atkStatD = (int) (c.getOtherStat(atkBsStatD,
								Integer.parseInt(textFieldEVAtkD.getText())) * natureD[0]);
						textFieldValueD[1].setText(Integer.toString(atkStatD));

						int defBsStatD = D.getDef();
						textFieldBSDefD.setText(Integer.toString(defBsStatD));
						int defStatD = (int) (c.getOtherStat(defBsStatD,
								Integer.parseInt(textFieldEVDefD.getText())) * natureD[1]);
						textFieldValueD[2].setText(Integer.toString(defStatD));

						int sAtkBsStatD = D.getSAtk();
						textFieldBSSAtkD.setText(Integer.toString(sAtkBsStatD));
						int sAtkStatD = (int) (c.getOtherStat(sAtkBsStatD,
								Integer.parseInt(textFieldEVSAtkD.getText())) * natureD[2]);
						textFieldValueD[3].setText(Integer.toString(sAtkStatD));

						int sDefBsStatD = D.getSDef();
						textFieldBSSDefD.setText(Integer.toString(sDefBsStatD));
						int sDefStatD = (int) (c.getOtherStat(sDefBsStatD,
								Integer.parseInt(textFieldEVSDefD.getText())) * natureD[3]);
						textFieldValueD[4].setText(Integer.toString(sDefStatD));

						int spdBsStatD = D.getSpd();
						textFieldBSSpdD.setText(Integer.toString(spdBsStatD));
						int spdStatD = (int) (c.getOtherStat(spdBsStatD,
								Integer.parseInt(textFieldEVSpdD.getText())) * natureD[4]);
						textFieldValueD[5].setText(Integer.toString(spdStatD));

						// ---------------- Damage ----------------
						int damage = 0;
						int atkPower =  (int) (Double
								.parseDouble(textFieldAtkPower.getText()) * Double
								.parseDouble(textFieldAtkPowerC.getText()));
						int atk = 0;
						int def = 0;
						if (comboBoxAtkCategory.getSelectedItem().equals("物")) {
							atk = (int) (atkStatA * Double
									.parseDouble(textFieldAtkC.getText()));
							def = (int) (defStatD * Double
									.parseDouble(textFieldDefC.getText()));
						} else if (comboBoxAtkCategory.getSelectedItem()
								.equals("特")) {
							atk = (int) (sAtkStatA * Double
									.parseDouble(textFieldAtkC.getText()));
							def = (int) (sDefStatD * Double
									.parseDouble(textFieldDefC.getText()));
						} else if (comboBoxAtkCategory.getSelectedItem()
								.equals("特物")) {
							atk = (int) (sAtkStatA * Double
									.parseDouble(textFieldAtkC.getText()));
							def = (int) (defStatD * Double
									.parseDouble(textFieldDefC.getText()));
						}
						damage = (int) c.getDamage(atkPower, atk, def);
						String output = "伤害: " + Integer.toString(damage) + "\n";
						textArea.setText(output);
						damage = (int) (damage * Double
								.parseDouble(textFieldDamageC.getText()));
						if (textFieldAtkType.getText().equals(A.getType1()) ||
								textFieldAtkType.getText().equals(A.getType2())) {
							damage = (int) (1.5*damage);
						}
						if (D.getType2().equals("无"))
							damage = (int) (damage * c.getTypeC(
									textFieldAtkType.getText(), D.getType1()));
						else
							damage = (int) (damage * c.getTypeC(
									textFieldAtkType.getText(), D.getType1(),
									D.getType2()));
						output = "修正后: " + Integer.toString((int) (damage*0.85)) + " ~ " + Integer.toString(damage)
								+ "\n百分比: " + Double.toString(((int) (damage*0.85)) / (double)hpStatD*100)
								+ "% ~ " + Double.toString(damage*100.0/hpStatD) + "%";
						textArea.append(output);
					}
				}
			}
		});
	}
	
	private boolean checkInput() {
		if (textFieldNameA.getText().isEmpty()||
			textFieldNameD.getText().isEmpty()||
			textFieldAtkType.getText().isEmpty()||
			!checkNumber()) {
			JOptionPane.showMessageDialog(frame,
				    "数据输入错误！");
			return false;
		}
		return true;
	}
	
	private boolean checkNumber() {
		try {
			if (Integer.parseInt(textFieldEVHpA.getText())>255 || Integer.parseInt(textFieldEVHpA.getText())<0 ||
				Integer.parseInt(textFieldEVAtkA.getText())>255 || Integer.parseInt(textFieldEVAtkA.getText())<0 ||
				Integer.parseInt(textFieldEVDefA.getText())>255 || Integer.parseInt(textFieldEVDefA.getText())<0 ||
				Integer.parseInt(textFieldEVSAtkA.getText())>255 || Integer.parseInt(textFieldEVSAtkA.getText())<0 ||
				Integer.parseInt(textFieldEVSDefA.getText())>255 || Integer.parseInt(textFieldEVSDefA.getText())<0 ||
				Integer.parseInt(textFieldEVSpdA.getText())>255 || Integer.parseInt(textFieldEVSpdA.getText())<0 ||
				Integer.parseInt(textFieldEVHpD.getText())>255 || Integer.parseInt(textFieldEVHpD.getText())<0 ||
				Integer.parseInt(textFieldEVAtkD.getText())>255 || Integer.parseInt(textFieldEVAtkD.getText())<0 ||
				Integer.parseInt(textFieldEVDefD.getText())>255 || Integer.parseInt(textFieldEVDefD.getText())<0 ||
				Integer.parseInt(textFieldEVSAtkD.getText())>255 || Integer.parseInt(textFieldEVSAtkD.getText())<0 ||
				Integer.parseInt(textFieldEVSDefD.getText())>255 || Integer.parseInt(textFieldEVSDefD.getText())<0 ||
				Integer.parseInt(textFieldEVSpdD.getText())>255 || Integer.parseInt(textFieldEVSpdD.getText())<0 ||
				(Integer.parseInt(textFieldEVHpA.getText())+Integer.parseInt(textFieldEVAtkA.getText())+
				Integer.parseInt(textFieldEVDefA.getText())+Integer.parseInt(textFieldEVSAtkA.getText())+
				Integer.parseInt(textFieldEVSDefA.getText())+Integer.parseInt(textFieldEVSpdA.getText()))>510 ||
				(Integer.parseInt(textFieldEVHpD.getText())+Integer.parseInt(textFieldEVAtkD.getText())+
				Integer.parseInt(textFieldEVDefD.getText())+Integer.parseInt(textFieldEVSAtkD.getText())+
				Integer.parseInt(textFieldEVSDefD.getText())+Integer.parseInt(textFieldEVSpdD.getText()))>510 ||
				Integer.parseInt(textFieldAtkPower.getText())<=0 ||
				Double.parseDouble(textFieldAtkC.getText())<=0 || Double.parseDouble(textFieldDefC.getText())<=0 ||
				Double.parseDouble(textFieldAtkPowerC.getText())<=0 || Double.parseDouble(textFieldDamageC.getText())<=0)
				return false;
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}
}
 