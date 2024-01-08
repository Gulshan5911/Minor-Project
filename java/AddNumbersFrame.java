import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddNumbersFrame extends JFrame implements ActionListener{
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JButton addButton;
    private JLabel resultLabel;
    private JTextField sumField;

    public AddNumbersFrame() {
        // Set up the frame
        setTitle("Add Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,1200);
        setLayout(null);

        // Create components
        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        addButton = new JButton("Add");
        resultLabel = new JLabel("SUM  : ");
        sumField = new JTextField();

	 // Set the position and size of components using setBounds()
        firstNumberLabel.setBounds(10, 10, 100, 30);
        firstNumberField.setBounds(120, 10, 150, 30);
        secondNumberLabel.setBounds(10, 50, 100, 30);
        secondNumberField.setBounds(120, 50, 150, 30);
        addButton.setBounds(120, 90, 80, 30);
        resultLabel.setBounds(100, 130, 60, 30);
        sumField.setBounds(180, 130, 100, 30);


        // Add components to the frame
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(addButton);
       

        // Add action listener to the button
 	addButton.addActionListener(this);

        
	setVisible(true);
  
    }
public void actionPerformed(ActionEvent ee) {
	int x=0;
	try{

	try{
		int firstNumber = Integer.parseInt(firstNumberField.getText());
		}catch(Exception e){
			float firstNumber = Float.parseFloat(firstNumberField.getText());
			float secondNumber = (float)Float.parseFloat(secondNumberField.getText());
			x=1;
			float result = firstNumber + secondNumber;
		   	String s=Float.toString(result);
		 	add(resultLabel);
        		add(sumField);
			resultLabel.setText("sum ");
                       sumField.setText(s);	}
		if(x!=1){
			try{
				int firstNumber = Integer.parseInt(firstNumberField.getText());
				int secondNumber = Integer.parseInt(secondNumberField.getText());
				int result = firstNumber + secondNumber;
		   		String s=Integer.toString(result);
				 add(resultLabel);
        			add(sumField);
                    		sumField.setText(s);
				resultLabel.setText("sum ");
				}catch(Exception e){
					int firstNumber = Integer.parseInt(firstNumberField.getText());
					float secondNumber = Float.parseFloat(secondNumberField.getText());
                		        float result = firstNumber + secondNumber;
		   			String s=Float.toString(result);
					 add(resultLabel);
        				add(sumField);
                   			 sumField.setText(s);	
					resultLabel.setText("sum ");
							}
					}
	}catch(Exception e){
				 add(resultLabel);
        			add(sumField);
				sumField.setText("Invalid Input");
				}


}



    public static void main(String[] args) {
        
                 new AddNumbersFrame();
                          }
      
}
