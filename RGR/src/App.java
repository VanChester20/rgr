
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class App implements ActionListener{
	
	Api api=new Api();
	JTextField param1,param2;
	JLabel res,res2;
	JButton mult;
	int a,b;
	
	public App() {
		JFrame frame=new JFrame();//creating instance of JFrame  
		frame.setTitle("App");
        
		mult=new JButton("Ðàññ÷¸ò");//creating instance of JButton  
		param1=new JTextField();
		param2=new JTextField();
		res=new JLabel("Ðåçóëüòàò:");
		res2=new JLabel();
		
		param1.setBounds(50, 100, 70, 30);
		param2.setBounds(160, 100, 70, 30);
		mult.setBounds(270,100,100, 30);//x axis, y axis, width, height  
		res.setBounds(50, 150, 100, 30);
		res2.setBounds(90, 150, 100, 30);
		   
		frame.add(param1);
		frame.add(param2);
		frame.add(mult);//adding button in JFrame  
		frame.add(res);
		frame.add(res2);
		mult.addActionListener(this);
		          
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main( String[] args ){
    	new App();
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			int result=api.calcArea(Integer.valueOf(param1.getText()), Integer.valueOf(param2.getText()));
			res2.setText(String.valueOf(result));
		}catch(NumberFormatException e) {
			res2.setText("Error");
		}
	}
	
	
}
