import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stackframe extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stackframe frame = new Stackframe();
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
	public Stackframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setForeground(new Color(64, 128, 128));
		heading.setBounds(181, 21, 246, 27);
		contentPane.add(heading);

		JLabel lblNewLabel = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(48, 83, 191, 20);
		contentPane.add(lblNewLabel);

		sizefield = new JTextField();
		sizefield.setBounds(248, 81, 146, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creation of stack
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		createstack.setFont(new Font("Constantia", Font.BOLD, 12));
		createstack.setForeground(new Color(0, 0, 255));
		createstack.setBounds(248, 114, 146, 36);
		contentPane.add(createstack);

		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(48, 193, 191, 20);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setBounds(227, 191, 114, 20);
		contentPane.add(element);
		element.setColumns(10);

		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not Possible..Stack is Full!!");
					element.setText("");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}


		});
		push.setForeground(new Color(0, 0, 255));
		push.setFont(new Font("Constantia", Font.BOLD, 12));
		push.setBounds(354, 185, 106, 28);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+s[top]);
					--top;
				}

			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(227, 224, 114, 27);
		contentPane.add(pop);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top; i>=0; i--)
					{
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}


			}
		});
		display.setForeground(new Color(255, 0, 128));
		display.setFont(new Font("Constantia", Font.BOLD, 15));
		display.setBounds(152, 262, 259, 36);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 0, 0));
		displaybox.setBackground(new Color(193, 255, 255));
		displaybox.setBounds(152, 326, 437, 27);
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
		btnNewButton.setBounds(10, 325, 118, 33);
		contentPane.add(btnNewButton);
	}
}
