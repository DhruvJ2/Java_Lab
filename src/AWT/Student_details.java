package AWT;
import java.awt.*;
import java.awt.event.*; 

public class Student_details implements ActionListener { 
	
	public String name_info, rollno_info, age_info, address_info; 

	Frame f=new Frame("Student details"); 
	TextField name =new TextField(); 
	TextField rollno =new TextField(); 
	TextField age =new TextField(); 

	Checkbox male=new Checkbox("male"); 
	Checkbox female=new Checkbox("female"); 
	Checkbox other=new Checkbox("other"); 

	TextArea address=new TextArea(); 

	Label name_label=new Label("Name : "); 
	Label rollno_label=new Label("Roll no.: "); 
	Label age_label=new Label("Age : "); 
	Label gender_label=new Label("Gender : "); 
	Label address_label=new Label("Address : "); 

	Button submit =new Button("Submit"); 

	TextArea display_info=new TextArea("");
	
	Student_details(){ 
	
		f.setSize(700,800); 
		f.setVisible(true); 
		f.setLayout(null); 

		name_label.setBounds(50, 100, 100, 30); 
		rollno_label.setBounds(50, 150, 100, 30); 
		age_label.setBounds(50, 200, 300, 30); 
		gender_label.setBounds(50, 250, 100, 30); 
		address_label.setBounds(50, 300, 100, 30); 

		name.setBounds(100, 100, 200, 30); 
		rollno.setBounds(100, 150, 200, 30); 
		age.setBounds(100, 200, 200, 30); 
		male.setBounds(120, 250, 100, 30); 
		female.setBounds(220, 250, 100, 30); 
		other.setBounds(320, 250, 100, 30); 
		address.setBounds(100, 300, 500, 200); 

		submit.setBounds(300, 550, 100, 50); 
		submit.setBackground(Color.cyan); 
		submit.addActionListener(this);

		display_info.setBounds(100, 630, 300, 100);

		f.add(name); 
		f.add(rollno); 
		f.add(age); 
		f.add(male); 
		f.add(female); 
		f.add(other); 
		f.add(address); 

		f.add(name_label); 
		f.add(rollno_label); 
		f.add(age_label); 
		f.add(gender_label); 
		f.add(address_label); 

		f.add(submit); 

		f.add(display_info);
	} 

	public void actionPerformed(ActionEvent e) {
		name_info=name.getText();
		rollno_info=rollno.getText();
		age_info=age.getText();
		address_info=address.getText();
		String output = "Name : "+name_info+"\nRollno.: "+rollno_info+"\nAge : "+age_info+"\nAddress : "+address_info;
	
		display_info.setText(output);
	}

	public static void main(String args[]) { 
		new Student_details(); 
	} 
} 