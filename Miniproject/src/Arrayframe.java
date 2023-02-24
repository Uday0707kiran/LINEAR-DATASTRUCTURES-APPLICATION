import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Arrayframe extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField arrpos;
	private JTextField deletetf;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arrayframe frame = new Arrayframe();
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
	public Arrayframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel arrayds = new JLabel("ARRAY DATA STRUCTURE");
		arrayds.setForeground(new Color(255, 128, 64));
		arrayds.setFont(new Font("Constantia", Font.BOLD, 20));
		arrayds.setBounds(225, 25, 252, 27);
		contentPane.add(arrayds);
		
		JLabel arraylength = new JLabel("ENTER ARRAY LENGTH :");
		arraylength.setForeground(new Color(128, 0, 64));
		arraylength.setFont(new Font("Constantia", Font.BOLD, 16));
		arraylength.setBounds(55, 76, 189, 20);
		contentPane.add(arraylength);
		
		length = new JTextField();
		length.setBounds(249, 74, 118, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
				
				
			}
		});
		createarray.setFont(new Font("Sitka Small", Font.BOLD, 12));
		createarray.setForeground(new Color(0, 128, 255));
		createarray.setBounds(232, 105, 165, 33);
		contentPane.add(createarray);
		
		JLabel insertarray = new JLabel("INSERT AN INTEGER ELEMENT :");
		insertarray.setForeground(new Color(0, 64, 128));
		insertarray.setFont(new Font("Constantia", Font.BOLD, 15));
		insertarray.setBounds(34, 163, 236, 19);
		contentPane.add(insertarray);
		
		element = new JTextField();
		element.setBounds(280, 161, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(arrpos.getText());
				arr[pos]=elem;
				String message="Element "+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				arrpos.setText("");
				
			}
		});
		insert.setFont(new Font("Sitka Small", Font.BOLD, 12));
		insert.setForeground(new Color(0, 128, 255));
		insert.setBounds(585, 162, 89, 23);
		contentPane.add(insert);
		
		JLabel lblNewLabel = new JLabel("DELETE POSITION :");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(118, 222, 152, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POSITION");
		lblNewLabel_1.setForeground(new Color(128, 64, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(386, 164, 79, 20);
		contentPane.add(lblNewLabel_1);
		
		arrpos = new JTextField();
		arrpos.setBounds(475, 161, 96, 20);
		contentPane.add(arrpos);
		arrpos.setColumns(10);
		
		deletetf = new JTextField();
		deletetf.setBounds(280, 220, 96, 20);
		contentPane.add(deletetf);
		deletetf.setColumns(10);
		
		JButton posdlt = new JButton("DELETE");
		posdlt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deletetf.getText());
				arr[pos]=0;
				String message="Element deleted at the position "+pos;
				JOptionPane.showMessageDialog(posdlt, message);
				deletetf.setText("");
				
			}
		});
		posdlt.setForeground(new Color(0, 128, 255));
		posdlt.setFont(new Font("Constantia", Font.BOLD, 12));
		posdlt.setBounds(386, 219, 91, 23);
		contentPane.add(posdlt);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg=" ";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
				
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setForeground(new Color(0, 128, 0));
		display.setBounds(162, 265, 303, 40);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(218, 252, 251));
		displaybox.setForeground(new Color(0, 64, 128));
		displaybox.setBounds(162, 332, 512, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 12));
		btnNewButton.setBounds(10, 331, 118, 33);
		contentPane.add(btnNewButton);
	}
}
