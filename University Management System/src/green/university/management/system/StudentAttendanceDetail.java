/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package green.university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Student ID","Date Time","Class-1","Class-2"};
    String d[][]=new String[15][4];  
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("Students Attendence Lists");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance_student";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}