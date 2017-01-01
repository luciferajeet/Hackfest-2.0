import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements KeyListener{

	JFrame welcomeFrame;
	JFrame loginFrame;

	JPanel namePanel;
	JPanel loginPanel;
	JPanel signupPanel;
	JPanel aboutPanel;

	JLabel welcomeText;

	JButton loginBtn,signupBtn,aboutBtn;

	public static void main(String[] args) {
		// TODO Auto-generated method stubbj
		GUI obj=new GUI();
	}

	public GUI(){
		welcomeFrame=new JFrame();
		welcomeFrame.setSize(300,300);
		welcomeFrame.setLayout(new GridLayout(4,1));
		welcomeFrame.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		welcomeFrame.setLocationRelativeTo(null);

		namePanel=new JPanel();
		loginPanel=new JPanel();
		signupPanel=new JPanel();
		aboutPanel=new JPanel();

		welcomeFrame.add(namePanel);
		welcomeFrame.add(loginPanel);
		welcomeFrame.add(signupPanel);
		welcomeFrame.add(aboutPanel);

		welcomeText=new JLabel("Application Name");
		welcomeText.setFont(new Font("SansSerif", Font.PLAIN, 16));

		namePanel.add(Box.createVerticalStrut(50));

		loginBtn=new JButton("Login");
		loginBtn.setActionCommand("Login");
		loginBtn.addActionListener(new ButtonClickListener());

		signupBtn=new JButton("Sign Up");
		signupBtn.setActionCommand("Sign Up");
		signupBtn.addActionListener(new ButtonClickListener());

		aboutBtn=new JButton("About");
		aboutBtn.setActionCommand("About");
		aboutBtn.addActionListener(new ButtonClickListener());

		loginPanel.add(loginBtn);
		signupPanel.add(signupBtn);
		aboutPanel.add(aboutBtn);
		namePanel.add(welcomeText);



		welcomeFrame.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try{
				String command=ae.getActionCommand();
				pageDecision(command);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void pageDecision(String command) {
		if(command.equalsIgnoreCase("about")){
			JOptionPane.showMessageDialog(this, "This Application has been developed by Ajeet Singh and Rishabh Thukral. (•_•) ( •_•)","Developers",JOptionPane.INFORMATION_MESSAGE);
		}

		else if(command.equals("Login")){
			loginScreen();
		}

		/*else{
			JOptionPane.showMessageDialog(this, "Hey this feature is in pro version You need to buy it. (`|_|`)", "Pro Required", JOptionPane.ERROR_MESSAGE);
		}*/
	}

	private void loginScreen() {
		// TODO Auto-generated method stub
		welcomeFrame.dispose();
		loginFrame=new JFrame();
		loginFrame.setSize(300,300);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setResizable(false);
		loginFrame.setLayout(new GridLayout(3,2));
		loginFrame.setDefaultCloseOperation(loginFrame.EXIT_ON_CLOSE);

		JPanel idPanel=new JPanel();
		JPanel pswrdPanel=new JPanel();
		JPanel loginBtnPanel=new JPanel();
		JPanel idInputPanel=new JPanel();
		JPanel pswrdInputPanel=new JPanel();

		JLabel idText=new JLabel("email:");
		idPanel.add(idText);
		loginFrame.add(idPanel);

		JTextField idInput=new JTextField(10);
		idInput.addKeyListener(this);
		idInputPanel.add(idInput);
		idInputPanel.add(Box.createHorizontalStrut(50));
		loginFrame.add(idInputPanel);


		JLabel pswrdText=new JLabel("password:");
		pswrdPanel.add(pswrdText);
		loginFrame.add(pswrdPanel);

		JTextField pswrdInput=new JTextField(10);
		pswrdInput.addKeyListener(this);
		pswrdInputPanel.add(pswrdInput);
		loginFrame.add(pswrdInputPanel);

		JButton login=new JButton("Login");
		login.setActionCommand("LoggedIn");
		login.addActionListener(new ButtonClickListener());
		loginBtnPanel.add(login);
		loginFrame.add(loginBtnPanel);

		loginFrame.setVisible(true);
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}



	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
