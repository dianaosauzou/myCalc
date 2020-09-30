
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.*;
import java.awt.event.*;
    public class myCalculator extends JFrame implements ActionListener {
    	
    //Declaring my variables
	static double gs=0,bs=0,results=0;
	static int operator=0;
	static JFrame calcFrame = new JFrame ("Casio g6xft+");
	JTextField input = new JTextField ("", 18);
	JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;
	String display = "";
	
	//Constructor
	public myCalculator ()
	{
		
		calcFrame.setSize(250, 250);//sets the size of the frame
		//Making the text field un-editable
		input.setEditable(false);
		//Setting the layout of my calculator

		calcFrame.setLayout(new MigLayout("align 50% 50%")); //aligns it to the center
		//Initializing variables
		a = new JButton("<- ");
		b = new JButton("CE");
		c = new JButton("C ");
		d = new JButton(" +");
		e = new JButton("7 ");
		f = new JButton("8 ");
		g = new JButton("9 ");
		h = new JButton("/  ");
		i = new JButton("4 ");
		j = new JButton("5 ");
		k = new JButton("6 ");
		l = new JButton("* ");
		m = new JButton("1 ");
		n = new JButton("2 ");
		o = new JButton("3 ");
		p = new JButton("- ");
		q = new JButton("0");
		r = new JButton(". ");
		s = new JButton("=");
		
		//adding variables to my JFrame
		calcFrame.add(input, "span ");//spans the whole row
		calcFrame.add(a);
		calcFrame.add(b);
		calcFrame.add(c);
		calcFrame.add(d, "wrap 5");//wraps to next row
		calcFrame.add(e);
		calcFrame.add(f);
		calcFrame.add(g);
		calcFrame.add(h,"wrap 5");//wraps to next row
		calcFrame.add(i);
		calcFrame.add(j);
		calcFrame.add(k);
		calcFrame.add(l,"wrap 5");//wraps to next row
		calcFrame.add(m);
		calcFrame.add(n);
		calcFrame.add(o);
		calcFrame.add(p,"wrap 5");
		calcFrame.add(q, "span 2 1,growx");//spans to a certain amount and grows
		calcFrame.add(r);
		calcFrame.add(s);
		
		//Adding action listeners to my JFrame
		a.addActionListener(this);	
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		m.addActionListener(this);
		n.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		q.addActionListener(this);
	    r.addActionListener(this);
		s.addActionListener(this);

	}
	
public void actionPerformed(ActionEvent e) {
	//event handling routines(getActionCommand gives me a string representation of the action command)
	// display is equal to the input on the text field and it keeps updating as more buttons are pressed, the
	//operator numbers are not displayed on the text field because I don't need them to be parsed
	if (e.getActionCommand().equals("9 ")){
		 display = input.getText();
	    input.setText(display + "9");
		}
	if (e.getActionCommand().equals("8 ")){
	 display = input.getText();
    input.setText(display + "8");
	}
	if (e.getActionCommand().equals("7 ")){
		 display = input.getText();
	    input.setText(display + "7");
		}
	if (e.getActionCommand().equals("6 ")){
		 display = input.getText();
	    input.setText(display + "6");
		}
	if (e.getActionCommand().equals("5 ")){
		 display = input.getText();
	    input.setText(display + "5");
		}
	if (e.getActionCommand().equals("4 ")){
		 display = input.getText();
	    input.setText(display + "4");
		}
	if (e.getActionCommand().equals("3 ")){
		 display = input.getText();
	    input.setText(display + "3");
		}
	if (e.getActionCommand().equals("2 ")){
		 display = input.getText();
	    input.setText(display + "2");
		}
	if (e.getActionCommand().equals("1 ")){
		 display = input.getText();
	    input.setText(display + "1");
		}
	if (e.getActionCommand().equals("0")){
		 display = input.getText();
	    input.setText(display + "0");
		}
	if (e.getActionCommand().equals(". ")){
		 display = input.getText();
	    input.setText(display + ".");
		}
	if (e.getActionCommand().equals("CE")){
	    input.setText(" ");
		}
//(getSource returns the object on where the event occurred)
		if (e.getSource()==(a)&& input.getText ().length() > 1)
		{
			  display = input.getText();
			  input.setText(input.getText().substring(0, input.getText ().length() - 1));
		}
		else if (e.getSource()==(a)&& !(input.getText().length() < 1))
		{   input.setText("0");
		
	    }
	
		
//double parse converts a string to a double
		if(e.getSource()==d)
		{
			//if the operator is equal to one, this is case one and so on and so forth
			gs=Double.parseDouble(input.getText());
			operator=1;
			input.setText("");
		} 
		
		if(e.getSource()==p)
		{
			gs=Double.parseDouble(input.getText());
			operator=2;
			input.setText("");
		}
		
		if(e.getSource()==l)
		{
			gs=Double.parseDouble(input.getText());
			operator=3;
			input.setText("");
		}
		
		if(e.getSource()==h)
		{
			gs=Double.parseDouble(input.getText());
			operator=4;
			input.setText("");
		}
		if(e.getSource()==s)
		{
	//the switch statements tests variables against a value or a case, gs takes in the value on the screen and then sets the input to blank and allows the user to click an operator so a user can input more numbers, 
	//when the user inputs a number and equals is pressed, the switch statement will test these variables against a case, which will be one of the four cases below
			bs=Double.parseDouble(input.getText());
			switch(operator)
			{
				case 1: results=gs+bs;
					break;
		
				case 2: results=gs-bs;
					break;
		
				case 3: results=gs*bs;
					break;
		
				case 4: results=gs/bs;
					break;
		
				default: results=bs;
			}
			input.setText(""+results);
			
				
		}
		
	// if the operator is clear,gs is set to 0 and bs will scan the input on the text field which has been set to 0 the result is set to 0 and then displayed to 0
		if(e.getSource()==c)
		{   
			input.setText("0");
			gs=0;
		bs=Double.parseDouble(input.getText());
		switch(operator)
		{
		case 1: results=gs+bs;
		break;

	  case 2: results=gs-bs;
		break;

	  case 3: results=gs*bs;
		break;

	  case 4: results=gs/bs;
		break;
	
	default: results=bs;
    input.setText("0");
			
		}
		}
			  }
  //main method for execution
     public static void main(String[] args) {
     myCalculator act = new myCalculator();

     calcFrame.setVisible(true);
   }
}
