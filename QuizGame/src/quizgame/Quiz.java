package quizgame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{ // to know what user did 
	
	String[] questions = { 
							"Which company created java?" ,
							"which year was java created?" ,
							"what was java originally called?",
							"who is credited with creating java"
							};
	String[][] options = { 
			{"Starwars","Microsoft","Sun Microsystems","Megatron"},
			{"1900","1989","2001","5224"},
			{"Javascrpit","Apple","Latte","Oak"},
			{"Steve jobs", "Bill Gates","James Gosling", "Me"}
						};
	char[] answers = {
			'C',
			'B',
			'D'
	}; 
	
	
	char guess; 
	char answer; 
	int index;
	int number_of_right_guess ; 
	int total_questions = questions.length;
	int result;
	int seconds=15; 
	
	JFrame frame = new JFrame(); 
	JTextField textfield = new JTextField(); 
	JTextArea textarea = new JTextArea() ;
	JButton button_a = new JButton();
	JButton button_b = new JButton();
	JButton button_c = new JButton();
	JButton button_d = new JButton();
	JLabel answer_label_a = new JLabel(); 
	JLabel answer_label_b = new JLabel(); 
	JLabel answer_label_c = new JLabel(); 
	JLabel answer_label_d = new JLabel(); 

	JLabel time_label = new JLabel();
	JLabel sc_left = new JLabel();
	JTextField nb_right = new JTextField(); 
	JTextField percentage = new JTextField(); 
	
	
	
	
	
	
	public Quiz() { // the constructor 
		// frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,1000);
		frame.getContentPane().setBackground(new Color(50,50,50)); 
		
		
		
		frame.setVisible(true);
	}
	public void nextQuestion() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) { // button cliking 
		// TODO Auto-generated method stub
		
	}
	public void displayCorrectAnswer() {
		
	}
	public void finalResults() {
		
	}
}
