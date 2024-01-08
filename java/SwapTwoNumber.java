import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwapTwoNumber extends JFrame implements ActionListener{
    public JTextField firstNumberField;
    public JTextField secondNumberField;
    public JButton swapButton;
   public  JLabel output;

    public  SwapTwoNumber() {
        // Set up the frame
        setTitle("Swap Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,1200);
        setLayout(null);

        // Create components
        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        swapButton = new JButton("Swap");
	 output = new JLabel();
        

	 // Set the position and size of components using setBounds()
        firstNumberLabel.setBounds(10, 10, 100, 30);
        firstNumberField.setBounds(120, 10, 150, 30);
        secondNumberLabel.setBounds(10, 50, 100, 30);
        secondNumberField.setBounds(120, 50, 150, 30);
        swapButton.setBounds(120, 90, 80, 30);
	output.setBounds(120, 120, 80, 30);
        


        // Add components to the frame
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(swapButton);
	add(output);
       

        // Add action listener to the button
 	swapButton.addActionListener(this);

        
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
			float temp = firstNumber ;
                    firstNumberField.setText(Float.toString(secondNumber));
		    secondNumberField.setText(Float.toString(temp));
				}
		if(x!=1){
			try{
				int firstNumber = Integer.parseInt(firstNumberField.getText());
				int secondNumber = Integer.parseInt(secondNumberField.getText());
				int temp = firstNumber ;
		   		firstNumberField.setText(Integer.toString(secondNumber));
		    		secondNumberField.setText(Integer.toString(temp));
				}catch(Exception e){
					int firstNumber = Integer.parseInt(firstNumberField.getText());
					float secondNumber = Float.parseFloat(secondNumberField.getText());
                		        int temp = firstNumber ;
                  			firstNumberField.setText(Float.toString(secondNumber));
				       secondNumberField.setText(Integer.toString(temp));
						}
			}
	}catch(Exception e){
				output.setText("Invalid Input");
				}


}



    public static void main(String[] args) {
        
                 new SwapTwoNumber();
                          }
      
}
