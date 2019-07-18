package chatting;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class View_Chatting extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Controller c;
	private JTextField chattingField;
	private JTextField myChatField;
	private JButton sendButton;
	
	private StringBuilder sb; 
	
	public View_Chatting() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		myChatField = new JTextField();
		panel.add(myChatField, BorderLayout.CENTER);
		myChatField.setColumns(10);
		myChatField.registerKeyboardAction(this, "enter", KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),JComponent.WHEN_FOCUSED);
		
		sendButton = new JButton("전송");
		panel.add(sendButton, BorderLayout.EAST);
		sendButton.addActionListener(this);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		chattingField = new JTextField();
		panel_1.add(chattingField, BorderLayout.CENTER);
		chattingField.setColumns(10);
		
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut_1, BorderLayout.SOUTH);
	}
	
	public void setController(Controller c) {
		this.c = c;		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sendButton || e.getActionCommand() == "send") {
			sb.delete(0, sb.length());
			sb.append(c.getNickname()+ " - " + myChatField.getText());
			chattingField.setActionCommand(sb.toString());
		}
	}	

}
