package TermProject;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;


public class Main extends JFrame implements ActionListener{
 


public Main() {
      
      getContentPane().setLayout(null);
      setSize(500,300);
      setLocationRelativeTo(null);
      JLabel firstLabel = new JLabel("***PIcar ���α׷��� ���� ���� ȯ���մϴ�.***");
      firstLabel.setFont(new Font("���� ���", Font.BOLD, 16));
      JLabel secondLabel = new JLabel("���Ͻô� ���񽺸� Ŭ�����ּ���.");
      secondLabel.setFont(new Font("���� ���", Font.PLAIN, 14));
      firstLabel.setBounds(72, 10, 342, 40);
      secondLabel.setBounds(139, 60, 228, 27);
      getContentPane().add(firstLabel);
      getContentPane().add(secondLabel);
      
      
      JPanel buttonpanel = new JPanel();
      buttonpanel.setBounds(26,128,436,33);
      JButton btnPurchase = new JButton("�ڵ��� ����");
      btnPurchase.setFont(new Font("���� ���", Font.BOLD, 12));
      btnPurchase.setBackground(SystemColor.activeCaption);
      buttonpanel.add(btnPurchase);
      btnPurchase.addActionListener(this);
      JButton btnInsurance = new JButton("�ڵ��� ����");
      btnInsurance.setFont(new Font("���� ���", Font.BOLD, 12));
      btnInsurance.setBackground(SystemColor.activeCaption);
      buttonpanel.add(btnInsurance);
      btnInsurance.addActionListener(this);

     getContentPane().add(buttonpanel);
     
   }

   public static void main(String[] args) {
      Main mainGui = new Main();
        mainGui.setVisible (true);
      
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      //Container contentPane =getContentPane();
      
         if(e.getActionCommand().equals("�ڵ��� ����")) {
            Car.car();
            
         }
         else if(e.getActionCommand().equals("�ڵ��� ����")) {
            try {
				Register.register();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
            
         }
            System.exit(0);
}
}
