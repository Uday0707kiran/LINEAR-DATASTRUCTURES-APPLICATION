import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new SplashScreenDemo();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(138, 196, 206));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel heading = new JLabel("CHOOSE A DATA STRUCTRE");
		heading.setBackground(new Color(0, 255, 0));
		heading.setForeground(new Color(255, 255, 255));
		heading.setFont(new Font("Berlin Sans FB", Font.BOLD, 27));
		heading.setBounds(164, 11, 359, 34);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENEING CODE HERE
				Arrayframe af=new Arrayframe();
				af.setVisible(true);
						
						
						
			}
		});
		array.setBackground(new Color(255, 255, 255));
		array.setFont(new Font("Constantia", Font.BOLD, 16));
		array.setForeground(new Color(221, 100, 34));
		array.setBounds(252, 73, 147, 41);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENEING CODE HERE
				new Stackframe().setVisible(true);

			}
		});
		stack.setForeground(new Color(0, 128, 128));
		stack.setFont(new Font("Constantia", Font.BOLD, 16));
		stack.setBounds(47, 128, 168, 47);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENEING CODE HERE
				new Queueframe().setVisible(true);

			}
		});
		queue.setForeground(new Color(128, 0, 128));
		queue.setFont(new Font("Constantia", Font.BOLD, 16));
		queue.setBounds(252, 131, 146, 41);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.setForeground(new Color(0, 128, 0));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 16));
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CQUEUE WINDOW OPENEING CODE HERE
				new Cqueueframe().setVisible(true);

			}
		});
		cqueue.setBounds(425, 133, 215, 37);
		contentPane.add(cqueue);
		
		JButton singlist = new JButton("SINGLY LINKED LIST");
		singlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLIST WINDOW OPENEING CODE HERE
				new Sllframe().setVisible(true);

			}
		});
		singlist.setForeground(new Color(155, 0, 0));
		singlist.setFont(new Font("Constantia", Font.BOLD, 16));
		singlist.setBounds(204, 202, 251, 37);
		contentPane.add(singlist);
		
		JButton doublist = new JButton("DOUBLY LINKED LIST");
		doublist.setForeground(new Color(36, 5, 250));
		doublist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLIST WINDOW OPENEING CODE HERE
				new Dllframe().setVisible(true);

			}
		});
		doublist.setFont(new Font("Constantia", Font.BOLD, 16));
		doublist.setBounds(204, 261, 251, 37);
		contentPane.add(doublist);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\images (7).jpeg"));
		lblNewLabel.setBounds(0, 0, 668, 347);
		contentPane.add(lblNewLabel);
	}
}
