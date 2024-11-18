package electricity.billing.system;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class Project extends  JFrame{ 
    
    Project(){
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,850,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2); 
        JLabel image= new JLabel(i3);
        add(image); 
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb); 
        
        JMenu master= new JMenu("Master"); 
        master.setForeground(Color.BLUE);
        mb.add(master); 
        
        JMenuItem newcustomer= new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
        newcustomer.setBackground(Color.WHITE); 
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(newcustomer); 
        
        JMenuItem customerdetails= new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        customerdetails.setBackground(Color.WHITE); 
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails); 
        
        JMenuItem depositedetails= new JMenuItem("Deposite Details");
        depositedetails.setFont(new Font("monospaced",Font.PLAIN,12));
        depositedetails.setBackground(Color.WHITE); 
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositedetails.setIcon(new ImageIcon(image3));
        depositedetails.setMnemonic('N');
        depositedetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        master.add(depositedetails); 
        
        JMenuItem calculatebill= new JMenuItem("Bill  Details");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,12));
        calculatebill.setBackground(Color.WHITE); 
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        master.add(calculatebill); 
        
        JMenu info= new JMenu("Information"); 
        info.setForeground(Color.BLUE);
        mb.add(info);  
        
        JMenuItem updateinformation= new JMenuItem("Update Information");
        updateinformation.setFont(new Font("monospaced",Font.PLAIN,12));
        updateinformation.setBackground(Color.WHITE); 
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('F');
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        info.add(updateinformation);  
        
        JMenuItem viewinformation= new JMenuItem("View Information");
        viewinformation.setFont(new Font("monospaced",Font.PLAIN,12));
        viewinformation.setBackground(Color.WHITE); 
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinformation.setIcon(new ImageIcon(image6));
        viewinformation.setMnemonic('L');
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        info.add(viewinformation); 
        
        JMenu user= new JMenu("User"); 
        user.setForeground(Color.BLUE);
        mb.add(user); 
        
        JMenuItem paybill= new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,12));
        paybill.setBackground(Color.WHITE); 
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7 = icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('R');
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        user.add(paybill);  
        
        JMenuItem billdetails= new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        billdetails.setBackground(Color.WHITE); 
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8 = icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('B');
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        user.add(billdetails); 
        
        JMenu utility= new JMenu("Utility"); 
        utility.setForeground(Color.BLUE);
        mb.add(utility); 
        
        JMenuItem notepad= new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,12));
        notepad.setBackground(Color.WHITE); 
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10 = icon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        utility.add(notepad); 
        
        JMenuItem calculator= new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,12));
        calculator.setBackground(Color.WHITE); 
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        utility.add(calculator); 
         
        JMenu mexit= new JMenu("Exit"); 
        mexit.setForeground(Color.BLUE);
        mb.add(mexit); 
        
        JMenuItem exit= new JMenuItem("Exit");
        exit.setFont(new Font("monospaced",Font.PLAIN,12));
        exit.setBackground(Color.WHITE); 
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12 = icon12.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        mexit.add(exit); 
        
        setLayout(new FlowLayout());
        
        
        
        setVisible(true);
        
    
    }
public static void main(String[] args){
    new Project();
}
     
}
