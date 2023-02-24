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

public class Sllframe extends JFrame {

	private JPanel contentPane;
	private JTextField elemrear;
	private JTextField elemfront;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sllframe frame = new Sllframe();
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
	public Sllframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		heading.setForeground(new Color(187, 0, 0));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(124, 25, 373, 27);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel.setForeground(new Color(179, 0, 179));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 88, 190, 34);
		contentPane.add(lblNewLabel);
		
		elemrear = new JTextField();
		elemrear.setBounds(220, 90, 156, 27);
		contentPane.add(elemrear);
		elemrear.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear

				Node temp;
				int elem=Integer.valueOf(elemrear.getText());
				
				Node newnode =new Node();
				
				newnode.data=elem;
				newnode.link=null;

				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at rear");
					elemrear.setText("");
					
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at rear");
					elemrear.setText("");
					
				}
			}
		});
		insertrear.setForeground(new Color(0, 0, 255));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 15));
		insertrear.setBounds(386, 85, 169, 34);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(179, 0, 179));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 139, 190, 34);
		contentPane.add(lblNewLabel_1);
		
		elemfront = new JTextField();
		elemfront.setColumns(10);
		elemfront.setBounds(220, 141, 156, 27);
		contentPane.add(elemfront);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem=Integer.valueOf(elemfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;

				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at front");
					elemfront.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at front");
					elemfront.setText("");
					
				}
				
			}
		});
		insertfront.setForeground(Color.BLUE);
		insertfront.setFont(new Font("Constantia", Font.BOLD, 15));
		insertfront.setBounds(386, 139, 169, 34);
		contentPane.add(insertfront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					first=null;

				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		btnDeleteRear.setForeground(new Color(255, 0, 0));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDeleteRear.setBounds(220, 199, 169, 34);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					first=first.link;

				}
			}
		});
		btnDeleteFront.setForeground(Color.RED);
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDeleteFront.setBounds(220, 244, 169, 34);
		contentPane.add(btnDeleteFront);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					displaybox.setText("");
				}
				else if(first.link==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else {
					Node temp=first;

					while(temp!=null)
					{
						msg=msg+" "+String.valueOf(temp.data);
						displaybox.setText(msg);
						temp=temp.link;
					}
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 64));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton.setBounds(191, 289, 236, 27);
		contentPane.add(btnNewButton);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(128, 0, 64));
		displaybox.setBackground(new Color(203, 252, 251));
		displaybox.setBounds(185, 327, 414, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("BACK HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 326, 118, 33);
		contentPane.add(btnNewButton_1);
	}

}
