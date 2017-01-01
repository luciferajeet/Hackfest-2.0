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
			aboutScreen();
		}

		else if(command.equals("Login")){
			loginScreen();
		}

		/*else{
			JOptionPane.showMessageDialog(this, "Hey this feature is in pro version You need to buy it. (`|_|`)", "Pro Required", JOptionPane.ERROR_MESSAGE);
		}*/
	}

	private void aboutScreen(){
		JFrame aboutFrame=new JFrame("About");
		aboutFrame.setSize(600,300);
		aboutFrame.setLocationRelativeTo(null);
		aboutFrame.setResizable(false);
		aboutFrame.setLayout(new GridLayout(6,1));
		aboutFrame.setDefaultCloseOperation(loginFrame.DISPOSE_ON_CLOSE);

		JPanel msg=new JPanel();
		JPanel msg1=new JPanel();
		JPanel msg2=new JPanel();
		JPanel msg3=new JPanel();
		JPanel msg4=new JPanel();
		JPanel msg5=new JPanel();

		JLabel txt=new JLabel("This Application has been developed by team Defaulting. This App is designed to");
		JLabel txt1=new JLabel("recommend tasks to the users which will reduce Greenhouse effect. The tasks would");
		JLabel txt2=new JLabel("be calibrated to maximize the impact of each task while keeping in mind the user's ");
		JLabel txt3=new JLabel("preference and convenience. The primary purpose of this tool is to minimize greenhouse");
		JLabel txt4=new JLabel("emission on user-by-user level to cut down the biggest non-industrial production");
		JLabel txt5=new JLabel("of global warming without the need of major expenditure and fewer lifestyle changes.");

		msg.add(txt);
		msg1.add(txt1);
		msg2.add(txt2);
		msg3.add(txt3);
		msg4.add(txt4);
		msg5.add(txt5);

		aboutFrame.add(msg);
		aboutFrame.add(msg1);
		aboutFrame.add(msg2);
		aboutFrame.add(msg3);
		aboutFrame.add(msg4);
		aboutFrame.add(msg5);

		aboutFrame.setVisible(true);

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
