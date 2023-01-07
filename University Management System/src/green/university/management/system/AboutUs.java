package green.university.management.system;


import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Green University Of Bangladesh");
            setBackground(new Color(173, 216, 230));
            setBounds(600, 350, 800, 600); 
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/gub.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 550, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Green University");
            l3.setForeground(new Color(0, 204, 0));
            l3.setFont(new Font("Courier new", Font.BOLD, 30));
            l3.setBounds(140, 40, 500, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Database Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Courier New", Font.BOLD, 30));
            l4.setBounds(70, 90, 600, 40);
            contentPane.add(l4);


            JLabel l6 = new JLabel("Developed By : GUB Students ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l8 = new JLabel("Md. Abu Taief siddique - 211902037 & Ibrahim Tanvir - 211902055");
            l8.setFont(new Font("Cambria", Font.BOLD, 20));
            l8.setBounds(70, 290, 1000, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - BSC. in CSE on going (6th Semester)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Website: https://green.edu.bd/");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


