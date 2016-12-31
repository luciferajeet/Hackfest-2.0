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
import javax.swing.JPanel;

public class GUI extends JFrame implements KeyListener{

	JFrame welcomeFrame;

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
		// TODO Auto-generated method stub

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
