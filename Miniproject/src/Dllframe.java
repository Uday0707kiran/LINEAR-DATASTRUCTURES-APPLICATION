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

public class Dllframe extends JFrame {

	private JPanel contentPane;
	private JTextField elemrear;
	private JTextField elemfront;
	private JTextField displaybox;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dllframe frame = new Dllframe();
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
	public Dllframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 655, 377);
		contentPane.add(contentPane_1);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(179, 0, 179));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 88, 190, 34);
		contentPane_1.add(lblNewLabel_1);

		elemrear = new JTextField();
		elemrear.setColumns(10);
		elemrear.setBounds(220, 90, 156, 27);
		contentPane_1.add(elemrear);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT REAR
				int elem=Integer.valueOf(elemrear.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;

				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at rear");
					elemrear.setText("");
				}
				else
				{
					Node temp=first;

					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at rear");
					elemrear.setText("");
				}
			}
		});
		insertrear.setForeground(Color.BLUE);
		insertrear.setFont(new Font("Constantia", Font.BOLD, 15));
		insertrear.setBounds(386, 85, 169, 34);
		contentPane_1.add(insertrear);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(179, 0, 179));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(36, 139, 190, 34);
		contentPane_1.add(lblNewLabel_1_1);

		elemfront = new JTextField();
		elemfront.setColumns(10);
		elemfront.setBounds(220, 141, 156, 27);
		contentPane_1.add(elemfront);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT FRONT
				int elem=Integer.valueOf(elemfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;

				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at front");
					elemfront.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element is inserted at front");
					elemfront.setText("");
				}
			}
		});
		insertfront.setForeground(Color.BLUE);
		insertfront.setFont(new Font("Constantia", Font.BOLD, 15));
		insertfront.setBounds(386, 139, 169, 34);
		contentPane_1.add(insertfront);

		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					first=null;
				}
				else
				{
					Node temp=first;

					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane_1, "Element deleted is "+temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		btnDeleteRear.setForeground(Color.RED);
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDeleteRear.setBounds(220, 187, 169, 34);
		contentPane_1.add(btnDeleteRear);

		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane_1, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		btnDeleteFront.setForeground(Color.RED);
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDeleteFront.setBounds(220, 237, 169, 34);
		contentPane_1.add(btnDeleteFront);

		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY FORWARD
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else
				{

					Node temp=first;
					while(temp!=null)
					{
						msg=msg+" "+String.valueOf(temp.data);
						displaybox.setText(msg);
						temp=temp.nextlink;
					}
					System.out.println();
				}
			}
		});
		btnDisplayForward.setForeground(new Color(0, 128, 64));
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDisplayForward.setBounds(36, 282, 236, 34);
		contentPane_1.add(btnDisplayForward);

		displaybox = new JTextField();
		displaybox.setForeground(new Color(128, 0, 64));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(203, 252, 251));
		displaybox.setBounds(212, 339, 414, 27);
		contentPane_1.add(displaybox);

		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(137, 22, 379, 27);
		contentPane_1.add(lblNewLabel);

		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY REVERSE
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else
				{

					Node temp=first;

					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+String.valueOf(temp.data);
						displaybox.setText(msg);
						temp=temp.prelink;
					}
				}
			}
		});
		btnDisplayReverse.setForeground(new Color(0, 128, 64));
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDisplayReverse.setBounds(345, 282, 236, 34);
		contentPane_1.add(btnDisplayReverse);
		
		JButton btnNewButton = new JButton("BACK HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 12));
		btnNewButton.setBounds(10, 338, 118, 33);
		contentPane_1.add(btnNewButton);
	}
}
