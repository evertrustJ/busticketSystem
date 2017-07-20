/*
 * James
 * 2017.4.10
 * */

package Travelling_Ticket;



// ******************* All imports **********************
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
//**********************************************************





public class Travelling {

	private JFrame platform;
	private JTextField textTax;
	private JTextField textSubTotal;
	private JTextField textTotal;
	protected JLabel txtTax;
	protected JLabel txtSubTotal;
	protected JLabel txtTotal;
	private JTextField textClass;
	private JTextField textTicket;
	private JTextField textAdult;
	private JTextField textChild;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textDate;
	private JTextField textTime;
	private JTextField textTicketNum;
	private JTextField textPrice;
	private JTextField textRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.platform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		platform = new JFrame();
		platform.getContentPane().setBackground(new Color(153, 255, 153));
		platform.setBounds(0, 0, 1196, 700);
		platform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		platform.getContentPane().setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(204, 204, 255));
		panelTitle.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelTitle.setBounds(10, 21, 746, 61);
		platform.getContentPane().add(panelTitle);
		
		// *********************** User Interface Design ********************************
		JLabel lblNewLabel = new JLabel("Travelling Ticketing System");
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 40));
		panelTitle.add(lblNewLabel);
		
		JLabel lblTicketType = new JLabel("Ticket Type");
		lblTicketType.setFont(new Font("Old English Text MT", Font.BOLD, 26));
		lblTicketType.setBounds(83, 92, 163, 32);
		platform.getContentPane().add(lblTicketType);
		
		final JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBackground(new Color(255, 204, 255));
		rdbtnStandard.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnStandard.setBounds(10, 183, 112, 26);
		platform.getContentPane().add(rdbtnStandard);
		
		final JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setBackground(new Color(255, 204, 255));
		rdbtnEconomy.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnEconomy.setBounds(10, 231, 112, 23);
		platform.getContentPane().add(rdbtnEconomy);
		
		final JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBackground(new Color(255, 204, 255));
		rdbtnFirstClass.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnFirstClass.setBounds(10, 276, 112, 23);
		platform.getContentPane().add(rdbtnFirstClass);
		
		final JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setBackground(new Color(204, 255, 255));
		rdbtnReturnTicket.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnReturnTicket.setBounds(179, 231, 131, 23);
		platform.getContentPane().add(rdbtnReturnTicket);
		
		final JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBackground(new Color(204, 255, 255));
		rdbtnSingleTicket.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnSingleTicket.setBounds(179, 185, 131, 23);
		platform.getContentPane().add(rdbtnSingleTicket);
		
		final JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBackground(SystemColor.info);
		rdbtnAdult.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnAdult.setBounds(10, 437, 73, 23);
		platform.getContentPane().add(rdbtnAdult);
		
		final JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBackground(SystemColor.info);
		rdbtnChild.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 16));
		rdbtnChild.setBounds(197, 437, 73, 23);
		platform.getContentPane().add(rdbtnChild);
		
		final JComboBox cmbDestination = new JComboBox();
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "North York", "Mississauga", "Toronto", "Kingston"}));
		cmbDestination.setFont(new Font("Old English Text MT", Font.BOLD, 24));
		cmbDestination.setBounds(57, 573, 213, 32);
		platform.getContentPane().add(cmbDestination);
		
		JSeparator sepType = new JSeparator();
		sepType.setBounds(0, 134, 341, 2);
		platform.getContentPane().add(sepType);
		
		JSeparator sepType1 = new JSeparator();
		sepType1.setBounds(377, 100, 778, 2);
		platform.getContentPane().add(sepType1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
		lblTax.setBounds(832, 120, 54, 32);
		platform.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
		lblSubtotal.setBounds(820, 185, 112, 32);
		platform.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
		lblTotal.setBounds(832, 255, 67, 32);
		platform.getContentPane().add(lblTotal);
		
		textTax = new JTextField();
		textTax.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		textTax.setBounds(994, 125, 131, 32);
		platform.getContentPane().add(textTax);
		textTax.setColumns(10);
		
		textSubTotal = new JTextField();
		textSubTotal.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		textSubTotal.setBounds(994, 185, 131, 31);
		platform.getContentPane().add(textSubTotal);
		textSubTotal.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		textTotal.setBounds(994, 255, 131, 31);
		platform.getContentPane().add(textTotal);
		textTotal.setColumns(10);
		// *************************************************************************
		
		
		
		// ********************* Calculation and Algorithms ***************************
		JButton btnNewButton = new JButton("Total");
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				double tax = 2.21;
				double MilesK8 = 15.00;
				double MilesK12 = 17.00;
				double MilesK20 = 18.00;
				double MilesK30 = 20.00;
				double totalCost;
				double eco = 4.00, fclass = 5.00;
				
				//North York 1 - K8 no discount - STD - ONEWAY - ONE Adult NIL Child
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 2 - K8  * 2 no discount- STD - RETURN - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK8 + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 3 - K8 discount - STD - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//North York 4 - K8 * 2 discount - STD - RETURN - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK8 + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//North York 11 - K8 no discount - ECONOMY - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK8 + eco) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 22 - K8  * 2 no discount- ECONOMY - RETURN - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * ((MilesK8 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK8 + eco) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 33 - K8 discount - ECONOMY - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK8 + eco) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//North York 44 - K8 * 2 discount - ECONOMY - RETURN - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * ((MilesK8 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK8 + eco) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//North York 111 - K8 no discount - FIRSTCLASS - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK8 + fclass) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 222 - K8  * 2 no discount- FIRSTCLASS - RETURN - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * ((MilesK8 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK8 + fclass) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//North York 333 - K8 discount - FIRSTCLASS - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * (MilesK8 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK8 + fclass) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//North York 444 - K8 * 2 discount - FIRSTCLASS - RETURN - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())
						&& cmbDestination.getSelectedItem().equals("North York")){
					totalCost = (tax * ((MilesK8 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK8 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK8 + fclass) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 1 - K12 no discount - STD - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 2 - K12 * 2 no discount - STD - RETURN - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK12 + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 3 - K12 discount - STD - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 4 - K12 * 2 discount - STD - RETURN - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK12 + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 11 - K12 no discount - ECONOMY - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK12 + eco) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 22 - K12 * 2 no discount - ECONOMY - RETURN - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * ((MilesK12 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK12 + eco) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 33 - K12 discount - ECONOMY - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK12 + eco) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 44 - K12 * 2 discount - ECONOMY - RETURN - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * ((MilesK12 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK12 + eco) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 111 - K12 no discount - FIRSTCLASS - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK12 + fclass) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 222 - K12 * 2 no discount - FIRSTCLASS - RETURN - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * ((MilesK12 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK12 + fclass) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Mississauga 333 - K12 discount - FIRSTCLASS - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * (MilesK12 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK12 + fclass) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Mississauga 444 - K12 * 2 discount - FIRSTCLASS - RETURN - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Mississauga")){
					totalCost = (tax * ((MilesK12 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK12 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK12 + fclass) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 1 - K12 no discount - STD - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 2 - K12 * 2 no discount - STD - RETURN - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK20 + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 3 - K12 discount - STD - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 4 - K12 * 2 discount - STD - RETURN - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK20 + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 11 - K12 no discount - ECONOMY - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK20 + eco) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 22 - K12 * 2 no discount - ECONOMY - RETURN - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * ((MilesK20 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK20 + eco) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 33 - K12 discount - ECONOMY - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK20 + eco) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 44 - K12 * 2 discount - ECONOMY - RETURN - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * ((MilesK20 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK20 + eco) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 111 - K12 no discount - FIRSTCLASS - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK20 + fclass) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 222 - K12 * 2 no discount - FIRSTCLASS - RETURN - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * ((MilesK20 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK20 + fclass) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Toronto 333 - K12 discount - FIRSTCLASS - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * (MilesK20 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK20 + fclass) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Toronto 444 - K12 * 2 discount - FIRSTCLASS - RETURN - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Toronto")){
					totalCost = (tax * ((MilesK20 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK20 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK20 + fclass) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 1 - K12 no discount - STD - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * MilesK30) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK30);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK30 + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 2 - K12 * 2 no discount - STD - RETURN - ONE Adult NIL Child
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK30 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK30 + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 3 - K12 discount - STD - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * MilesK30) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK30);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK30 + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 4 - K12 * 2 discount - STD - RETURN - ONE Child NIL Adult
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK30 * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK30 + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("STD");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 11 - K12 no discount - ECONOMY - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK30 + eco) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 22 - K12 * 2 no discount - ECONOMY - RETURN - ONE Adult NIL Child
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * ((MilesK30 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK30 + eco) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 33 - K12 discount - ECONOMY - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + eco));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK30 + eco) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 44 - K12 * 2 discount - ECONOMY - RETURN - ONE Child NIL Adult
				else if ((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * ((MilesK30 + eco) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + eco) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK30 + eco) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("ECONOMY");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 111 - K12 no discount - FIRSTCLASS - ONEWAY - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK30 + fclass) + totalCost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 222 - K12 * 2 no discount - FIRSTCLASS - RETURN - ONE Adult NIL Child
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * ((MilesK30 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", ((MilesK30 + fclass) + totalCost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("ONE");
					textChild.setText("NIL");
				}
				
				//Kingston 333 - K12 discount - FIRSTCLASS - ONEWAY - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * (MilesK30 + fclass)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + fclass));
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (MilesK30 + fclass) + totalCost - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("ONE WAY");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
				
				//Kingston 444 - K12 * 2 discount - FIRSTCLASS - RETURN - ONE Child NIL Adult
				else if ((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected()))
						&& cmbDestination.getSelectedItem().equals("Kingston")){
					totalCost = (tax * ((MilesK30 + fclass) * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					textTax.setText(sTax);
					String subTotal = String.format("$%.2f", (MilesK30 + fclass) * 2);
					textSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", (((MilesK30 + fclass) + totalCost) * 2) - 18);
					textTotal.setText(Total);
					textPrice.setText(Total);
					textClass.setText("FIRSTCLASS");
					textTicket.setText("RETURN");
					textAdult.setText("NIL");
					textChild.setText("ONE");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//-------------------Time--------------------
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				textTime.setText(tTime.format(timer.getTime()));
				
				//-------------------Date--------------------
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				textDate.setText(Tdate.format(timer.getTime()));
				
				textFrom.setText("Waterloo *");
				textTo.setText((String) cmbDestination.getSelectedItem() + " *");
				
				//------------Random Number Generator-----------
				int num1;
				String q1 = "";
				num1 = 1325 + (int)(Math.random()*4238);
				q1 += num1 + 1325;
				textTicketNum.setText(q1);
				
				// ***********************************************
				textRoute.setText("ANY");
				
			}
		});
		btnNewButton.setToolTipText("Total Cost of Ticket");
		btnNewButton.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 22));
		btnNewButton.setBounds(810, 35, 93, 32);
		platform.getContentPane().add(btnNewButton);
		
		
		// *************************** Button functions ***************************
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_2.setToolTipText("Exit System");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				platform = new JFrame ("Exit");
				if(JOptionPane.showConfirmDialog(platform, "Confirm if you want to exit", "Ticketing Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 22));
		btnNewButton_2.setBounds(1062, 35, 93, 32);
		platform.getContentPane().add(btnNewButton_2);
		
		JSeparator sepType2 = new JSeparator();
		sepType2.setBounds(0, 547, 341, 2);
		platform.getContentPane().add(sepType2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(351, 124, 2, 486);
		platform.getContentPane().add(separator_3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(UIManager.getColor("Button.shadow"));
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textTax.setText(null);
				textSubTotal.setText(null);
				textTotal.setText(null);
				textClass.setText(null);
				textTicket.setText(null);
				textAdult.setText(null);
				textChild.setText(null);
				textFrom.setText(null);
				textTo.setText(null);
				textDate.setText(null);
				textTime.setText(null);
				textTicketNum.setText(null);
				textPrice.setText(null);
				textRoute.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
			}
		});
		btnReset.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 22));
		btnReset.setBounds(939, 36, 93, 31);
		platform.getContentPane().add(btnReset);
		// ****************************************************************
		
		
		
		
		// ************************* User Interface Restpart ********************
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblClass.setBounds(23, 145, 112, 32);
		platform.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblTicket.setBounds(215, 147, 112, 32);
		platform.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblAdult.setBounds(23, 387, 112, 32);
		platform.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblChild.setBounds(215, 387, 112, 32);
		platform.getContentPane().add(lblChild);
		
		textClass = new JTextField();
		textClass.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textClass.setColumns(10);
		textClass.setBounds(10, 317, 131, 32);
		platform.getContentPane().add(textClass);
		
		textTicket = new JTextField();
		textTicket.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textTicket.setColumns(10);
		textTicket.setBounds(179, 317, 131, 32);
		platform.getContentPane().add(textTicket);
		
		textAdult = new JTextField();
		textAdult.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textAdult.setColumns(10);
		textAdult.setBounds(10, 490, 131, 32);
		platform.getContentPane().add(textAdult);
		
		textChild = new JTextField();
		textChild.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textChild.setColumns(10);
		textChild.setBounds(179, 490, 131, 32);
		platform.getContentPane().add(textChild);
		
		JSeparator sepInfo2 = new JSeparator();
		sepInfo2.setBounds(421, 382, 645, 2);
		platform.getContentPane().add(sepInfo2);
		
		JSeparator sepInfo1 = new JSeparator();
		sepInfo1.setBounds(0, 382, 341, 2);
		platform.getContentPane().add(sepInfo1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblFrom.setBounds(395, 437, 112, 32);
		platform.getContentPane().add(lblFrom);
		
		textFrom = new JTextField();
		textFrom.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textFrom.setColumns(10);
		textFrom.setBounds(556, 442, 162, 32);
		platform.getContentPane().add(textFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblTo.setBounds(802, 438, 112, 32);
		platform.getContentPane().add(lblTo);
		
		textTo = new JTextField();
		textTo.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textTo.setColumns(10);
		textTo.setBounds(963, 437, 162, 32);
		platform.getContentPane().add(textTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblDate.setBounds(395, 537, 112, 32);
		platform.getContentPane().add(lblDate);
		
		textDate = new JTextField();
		textDate.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textDate.setColumns(10);
		textDate.setBounds(556, 536, 162, 32);
		platform.getContentPane().add(textDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblTime.setBounds(802, 536, 112, 32);
		platform.getContentPane().add(lblTime);
		
		textTime = new JTextField();
		textTime.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textTime.setColumns(10);
		textTime.setBounds(963, 535, 162, 32);
		platform.getContentPane().add(textTime);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(1153, 76, 2, 534);
		platform.getContentPane().add(separator_6);
		
		JSeparator sepWhole = new JSeparator();
		sepWhole.setBounds(0, 633, 1155, 2);
		platform.getContentPane().add(sepWhole);
		
		JLabel lblTicketNo = new JLabel("Ticket No.");
		lblTicketNo.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblTicketNo.setBounds(395, 142, 112, 32);
		platform.getContentPane().add(lblTicketNo);
		
		textTicketNum = new JTextField();
		textTicketNum.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textTicketNum.setColumns(10);
		textTicketNum.setBounds(545, 145, 131, 32);
		platform.getContentPane().add(textTicketNum);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblPrice.setBounds(395, 222, 112, 32);
		platform.getContentPane().add(lblPrice);
		
		textPrice = new JTextField();
		textPrice.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textPrice.setColumns(10);
		textPrice.setBounds(545, 221, 131, 32);
		platform.getContentPane().add(textPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Old English Text MT", Font.BOLD, 20));
		lblRoute.setBounds(395, 307, 112, 32);
		platform.getContentPane().add(lblRoute);
		
		textRoute = new JTextField();
		textRoute.setFont(new Font("Informal Roman", Font.BOLD, 22));
		textRoute.setColumns(10);
		textRoute.setBounds(545, 306, 131, 32);
		platform.getContentPane().add(textRoute);
		// **********************************************************************
		
		
	}
}
