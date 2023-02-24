import javax.swing.*;
import java.awt.*;

public class SplashScreenDemo {

	JFrame frame;
	JLabel image=new JLabel(new ImageIcon("C:\\Users\\user\\Downloads\\images (2).jpeg"));
	JProgressBar progressBar=new JProgressBar();
	JLabel message=new JLabel();//Crating a JLabel for displaying the message
	private final JLabel lblNewLabel = new JLabel("WELCOME TO DATA STRUCTURES!!!");
	SplashScreenDemo()
	{
		createGUI();
		addImage();
		addProgressBar();
		addMessage();
		runningPBar();
	}
	public void createGUI(){
		frame=new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setSize(681,433);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(226, 226, 226));
		frame.setVisible(true);

	}
	public void addImage(){
		image.setLocation(0, 0);
		image.setSize(681,360);
		frame.getContentPane().add(image);
	}
	public void addText()
	{

	}
	public void addMessage()
	{
		message.setText("Please Wait............");
		message.setBounds(250,320,200,40);//Setting the size and location of the label
		message.setForeground(Color.black);//Setting foreground Color
		message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
		frame.getContentPane().add(message);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(85, 65, 539, 227);

		frame.getContentPane().add(lblNewLabel);
	}
	public void addProgressBar(){
		progressBar.setBounds(134,392,400,30);
		progressBar.setBorderPainted(true);
		progressBar.setStringPainted(true);
		progressBar.setBackground(new Color(0, 0, 0));
		progressBar.setForeground(new Color(255, 0, 0));
		progressBar.setValue(0);
		frame.getContentPane().add(progressBar);
	}
	public void runningPBar(){
		int i=0;//Creating an integer variable and intializing it to 0

		while( i<=100)
		{
			try{
				Thread.sleep(50);//Pausing execution for 50 milliseconds
				progressBar.setValue(i);//Setting value of Progress Bar
				message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
				i++;
				if(i==100)
					frame.dispose();
			}catch(Exception e){
				e.printStackTrace();
			}



		}
	}
	
}