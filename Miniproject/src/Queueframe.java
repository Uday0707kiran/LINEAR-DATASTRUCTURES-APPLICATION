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

public class Queueframe extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	int r=-1;
	int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queueframe frame = new Queueframe();
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
	public Queueframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 160));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(187, 11, 245, 27);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(63, 75, 173, 27);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(228, 69, 112, 27);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton creatqueue = new JButton("CREATE QUEUE");
		creatqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creation of queue
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message="Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		creatqueue.setForeground(new Color(0, 128, 128));
		creatqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		creatqueue.setBounds(211, 110, 150, 38);
		contentPane.add(creatqueue);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setBounds(47, 181, 179, 20);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(228, 176, 112, 27);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible....Queue is Full!!");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(0, 128, 128));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(350, 175, 120, 32);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletion
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element delted is "+q[f]);
					++f;
				}
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 15));
		delete.setBounds(217, 222, 133, 38);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=f; i<=r; i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
					System.out.println();
				}
			}
		});
		display.setForeground(new Color(48, 122, 29));
		display.setFont(new Font("Constantia", Font.BOLD, 15));
		display.setBounds(151, 278, 262, 38);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 64, 128));
		displaybox.setBackground(new Color(209, 254, 252));
		displaybox.setBounds(151, 330, 451, 31);
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
