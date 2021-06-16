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
      JLabel firstLabel = new JLabel("***PIcar 프로그램에 오신 것을 환영합니다.***");
      firstLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
      JLabel secondLabel = new JLabel("원하시는 서비스를 클릭해주세요.");
      secondLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
      firstLabel.setBounds(72, 10, 342, 40);
      secondLabel.setBounds(139, 60, 228, 27);
      getContentPane().add(firstLabel);
      getContentPane().add(secondLabel);
      
      
      JPanel buttonpanel = new JPanel();
      buttonpanel.setBounds(26,128,436,33);
      JButton btnPurchase = new JButton("자동차 구입");
      btnPurchase.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnPurchase.setBackground(SystemColor.activeCaption);
      buttonpanel.add(btnPurchase);
      btnPurchase.addActionListener(this);
      JButton btnInsurance = new JButton("자동차 보험");
      btnInsurance.setFont(new Font("맑은 고딕", Font.BOLD, 12));
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
      
         if(e.getActionCommand().equals("자동차 구입")) {
            Car.car();
            
         }
         else if(e.getActionCommand().equals("자동차 보험")) {
            try {
				Register.register();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
            
         }
            System.exit(0);
}
}
