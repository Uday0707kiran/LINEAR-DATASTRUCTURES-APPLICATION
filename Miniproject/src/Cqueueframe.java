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

public class Cqueueframe extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cqueueframe frame = new Cqueueframe();
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
	public Cqueueframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(144, 24, 348, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setBackground(new Color(128, 0, 128));
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(46, 77, 158, 27);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(214, 71, 143, 27);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creation of queue
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message="Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
			}
		);
		createqueue.setForeground(new Color(0, 0, 255));
		createqueue.setFont(new Font("Constantia", Font.BOLD, 15));
		createqueue.setBounds(202, 109, 170, 37);
		contentPane.add(createqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(37, 131, 103));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(46, 174, 185, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(221, 165, 136, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion
				int elem;
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					++count;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(0, 0, 255));
		insert.setFont(new Font("Constantia", Font.BOLD, 15));
		insert.setBounds(383, 161, 109, 36);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletion
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+cq[f]);
					f= (f+1)%size;
					--count;
				}
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 15));
		delete.setBounds(204, 213, 168, 37);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
					System.out.println();
				}
			}
		});
		display.setForeground(new Color(0, 185, 92));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(188, 271, 199, 37);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(187, 255, 255));
		displaybox.setForeground(new Color(189, 0, 0));
		displaybox.setBounds(188, 319, 407, 33);
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
		btnNewButton.setBounds(31, 319, 118, 33);
		contentPane.add(btnNewButton);
	}

}
