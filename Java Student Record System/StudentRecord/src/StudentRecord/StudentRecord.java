package StudentRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecord {

	private JFrame frame;
	private JTextField txtStudentID;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtExamNumber;
	private JTextField txtMath;
	private JTextField txtEng;
	private JTextField txtBio;
	private JTextField txtChem;
	private JTextField txtPhy;
	private JTextField txtCS;
	private JTextField txtEcon;
	private JTextField txtScore;
	private JTextField txtAvg;
	private JTextField txtRank;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
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
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1450,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBorder(new LineBorder(new Color(176, 196, 222), 12));
		panel.setBounds(12, 13, 1034, 422);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtStudentID = new JTextField();
		txtStudentID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStudentID.setBounds(168, 25, 222, 26);
		panel.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStudentId.setBounds(51, 30, 115, 16);
		panel.add(lblStudentId);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFirstname.setBounds(57, 72, 75, 16);
		panel.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname:");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLastname.setBounds(57, 112, 75, 16);
		panel.add(lblLastname);
		
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourseCode.setBounds(36, 154, 96, 16);
		panel.add(lblCourseCode);
		
		JLabel lblExamNumber = new JLabel("Exam Number:");
		lblExamNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExamNumber.setBounds(25, 197, 130, 16);
		panel.add(lblExamNumber);
		
		JLabel lblGender = new JLabel("Date of Birth:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(36, 286, 96, 16);
		panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(67, 335, 65, 16);
		panel.add(lblAddress);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(168, 70, 222, 26);
		panel.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLastName.setColumns(10);
		txtLastName.setBounds(168, 110, 222, 26);
		panel.add(txtLastName);
		
		txtExamNumber = new JTextField();
		txtExamNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtExamNumber.setColumns(10);
		txtExamNumber.setBounds(168, 192, 222, 26);
		panel.add(txtExamNumber);
		
		JTextField txtDoB = new JTextField();
		txtDoB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDoB.setColumns(10);
		txtDoB.setBounds(168, 281, 222, 26);
		panel.add(txtDoB);
		
		JLabel lblGender_2 = new JLabel("Gender:");
		lblGender_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender_2.setBounds(70, 243, 65, 16);
		panel.add(lblGender_2);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Male", "Femate", "Other"}));
		comboBox2.setBackground(new Color(255, 255, 255));
		comboBox2.setBounds(168, 241, 222, 22);
		panel.add(comboBox2);
		comboBox2.setSelectedIndex(-1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"45-6032", "45-7504", "45-8124", "45-3028", "46-2439", "46-5581", "46-1030", "46-0092", "47-2390", "47-3740", "47-6114", "47-7741"}));
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBounds(168, 152, 222, 22);
		panel.add(comboBox1);
		comboBox1.setSelectedIndex(-1);

		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setBounds(168, 333, 222, 63);
		panel.add(jtxtAddress);
		
		JLabel lblMathematics = new JLabel("Mathematics:");
		lblMathematics.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMathematics.setBounds(546, 30, 115, 16);
		panel.add(lblMathematics);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnglish.setBounds(583, 60, 115, 16);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology:");
		lblBiology.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBiology.setBounds(583, 89, 115, 16);
		panel.add(lblBiology);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChemistry.setBounds(560, 120, 115, 16);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhysics.setBounds(583, 154, 115, 16);
		panel.add(lblPhysics);
		
		JLabel lblComputerScience = new JLabel("Computer Science:");
		lblComputerScience.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblComputerScience.setBounds(507, 192, 168, 16);
		panel.add(lblComputerScience);
		
		JLabel lblEconomics = new JLabel("Economics:");
		lblEconomics.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEconomics.setBounds(560, 227, 115, 16);
		panel.add(lblEconomics);
		
		JLabel lblTotalScore = new JLabel("Total Score:");
		lblTotalScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalScore.setBounds(546, 286, 115, 16);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAverage.setBounds(571, 315, 115, 16);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking:");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRanking.setBounds(571, 344, 115, 16);
		panel.add(lblRanking);
		
		txtMath = new JTextField();
		txtMath.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMath.setColumns(10);
		txtMath.setBounds(655, 25, 222, 26);
		panel.add(txtMath);
		
		txtEng = new JTextField();
		txtEng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEng.setColumns(10);
		txtEng.setBounds(655, 58, 222, 26);
		panel.add(txtEng);
		
		txtBio = new JTextField();
		txtBio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBio.setColumns(10);
		txtBio.setBounds(655, 89, 222, 26);
		panel.add(txtBio);
		
		txtChem = new JTextField();
		txtChem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtChem.setColumns(10);
		txtChem.setBounds(655, 120, 222, 26);
		panel.add(txtChem);
		
		txtPhy = new JTextField();
		txtPhy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPhy.setColumns(10);
		txtPhy.setBounds(655, 152, 222, 26);
		panel.add(txtPhy);
		
		txtCS = new JTextField();
		txtCS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCS.setColumns(10);
		txtCS.setBounds(655, 187, 222, 26);
		panel.add(txtCS);
		
		txtEcon = new JTextField();
		txtEcon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEcon.setColumns(10);
		txtEcon.setBounds(655, 222, 222, 26);
		panel.add(txtEcon);
		
		txtScore = new JTextField();
		txtScore.setEnabled(false);
		txtScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtScore.setColumns(10);
		txtScore.setBounds(655, 284, 222, 26);
		panel.add(txtScore);
		
		txtAvg = new JTextField();
		txtAvg.setEnabled(false);
		txtAvg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAvg.setColumns(10);
		txtAvg.setBounds(655, 315, 222, 26);
		panel.add(txtAvg);
		
		txtRank = new JTextField();
		txtRank.setEnabled(false);
		txtRank.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtRank.setColumns(10);
		txtRank.setBounds(655, 344, 222, 26);
		panel.add(txtRank);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(176, 196, 222), 12));
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setBounds(1058, 13, 362, 422);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(340, 17, -322, 55);
		panel_1.add(textArea);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setEnabled(false);
		jtxtTranscript.setBounds(30, 24, 298, 372);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(176, 196, 222), 12));
		panel_1_1.setBackground(new Color(128, 128, 128));
		panel_1_1.setBounds(12, 448, 1408, 92);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Exit");
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//exit button execution:
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to EXIT", "Student Result System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		
		
		btnNewButton_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1_1.setBounds(1218, 22, 157, 46);
		panel_1_1.add(btnNewButton_2_1_1_1_1);

		
		JButton btnNewButton_2_1_1_1_1_1 = new JButton("Reset");
		btnNewButton_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
				txtStudentID.setText(null);
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtExamNumber.setText(null);
				txtMath.setText(null);
				txtEng.setText(null);
				txtBio.setText(null);
				txtChem.setText(null);
				txtPhy.setText(null);
				txtCS.setText(null);
				txtEcon.setText(null);
			    txtScore.setText(null);
				txtAvg.setText(null);
				txtRank.setText(null);
				comboBox1.setSelectedIndex(-1);
				comboBox2.setSelectedIndex(-1);
			}
		});
		
		
		btnNewButton_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1_1_1.setBounds(929, 22, 157, 46);
		panel_1_1.add(btnNewButton_2_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1 = new JButton("Print");
		btnNewButton_2_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev){
					System.err.format("No Printer Found", ev.getMessage());
				}
				
			}
		});
		
		btnNewButton_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1_1_1_1.setBounds(627, 22, 157, 46);
		panel_1_1.add(btnNewButton_2_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1 = new JButton("Transcript");
		btnNewButton_2_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Result Record System\n"
				+ "-----------------------------------------\n"
				+ "Student ID is\t\t" + txtStudentID.getText()
				+ "\nFirstname is\t\t" + txtFirstName.getText()
				+ "\nLastname is\t\t" + txtLastName.getText()
				+ "\nMath:\t\t" + txtMath.getText()
				+ "\nEnglish:\t\t" + txtEng.getText()
				+ "\nBiology:\t\t" + txtBio.getText()
				+ "\nChemistry:\t\t" + txtChem.getText()
				+ "\nPhysics:\t\t" + txtPhy.getText()
				+ "\nComputer Science:\t" + txtCS.getText()
				+ "\nEconomics:\t\t" + txtEcon.getText()
				+ "\n-----------------------------------------\n"
				+ "\nTotal Score is\t\t" + txtScore.getText()
				+ "\nAverage is\t\t" + txtAvg.getText()
				+ "\nRank is\t\t" + txtRank.getText() + "\n");
			}
		});
		
		btnNewButton_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1_1_1_1_1.setBounds(332, 22, 157, 46);
		panel_1_1.add(btnNewButton_2_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1_1_1 = new JButton("Result");
		btnNewButton_2_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//total score, average
				double [] resultArray = new double [14];
				
				resultArray[0] = Double.parseDouble(txtMath.getText());
				resultArray[1] = Double.parseDouble(txtEng.getText());
				resultArray[2] = Double.parseDouble(txtBio.getText());
				resultArray[3] = Double.parseDouble(txtChem.getText());
				resultArray[4] = Double.parseDouble(txtPhy.getText());
				resultArray[5] = Double.parseDouble(txtCS.getText());
				resultArray[6] = Double.parseDouble(txtEcon.getText());
				
			    resultArray[7] = (resultArray[0]+resultArray[1]+resultArray[2]+resultArray[3]+resultArray[4]+resultArray[5]+resultArray[6])/7;
			    resultArray[8]=(resultArray[0]+resultArray[1]+resultArray[2]+resultArray[3]+resultArray[4]+resultArray[5]+resultArray[6]);
			    
			    String AverageScore = String.format("%.0f",resultArray[7]);
			    txtAvg.setText(AverageScore);
			    
			    String TotalScore = String.format("%.0f",resultArray[8]);
			    txtScore.setText(TotalScore); 
				
			    //rank
			    if(resultArray[8]>=700){
			    	txtRank.setText("First Class");
			    }
			    else if(resultArray[8]>=600){
			    	txtRank.setText("Second Class Upper");
			    }
			    else if(resultArray[8]>=500){
			    	txtRank.setText("Second Class Lower");
			    }
			    else {
			    	txtRank.setText("No Rank");
			    }
			    
			    //score bounds 0-100
			    int counter=0;
			    for(int i=0; i<=6; i++){
			    	if(resultArray[i]>100 || resultArray[i]<0){
			    		counter++;
			    		}
			    }
			    if(counter>=1){
			    		JFrame frame2 = new JFrame("Error");
			    		JOptionPane.showMessageDialog(frame2, "Individual scores have to be between 0 and 100.");
			    		txtAvg.setText("");
			    		txtScore.setText("");
			    		txtRank.setText("");
			    }		    
			}
		});
		

		btnNewButton_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1_1_1_1_1_1.setBounds(44, 22, 157, 46);
		panel_1_1.add(btnNewButton_2_1_1_1_1_1_1_1_1);
	}
};;