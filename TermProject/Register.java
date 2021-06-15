package TermProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Info{
   private String name;
   private String birth;
   private String product;
   private String start_date;  // ���� ���� ��¥ (=���� �����ϴ� ��¥ ) <- ����ڷκ��� �Է¹޾Ƽ� ����     //���߿� ���� ������ �������� ���� �Ǵ��� �� �޷¿��� ���� ��¥ �ҷ��ͼ� ��
   private double duration; // ���� ��ȿ �Ⱓ  - ���� ȸ�� ���� �ٸ��� ���� - ������ ����޴� �Ⱓ (���ԱⰣ�� �ٸ�)
   private double pay_duration; // ���� ���� �Ⱓ (����Ḧ �����ϴ� �Ⱓ/ ���� ��� ���ԱⰣ�� 10��, ����Ⱓ�� 20���� ��� ������ 10�� ���ȸ� ���� 20�� ���� ���� ����) 
   private String due_date;  // ���� ���� ��¥ ( ���� ���� ��¥ + duration = ���� ���� ��¥ )
   static private int numberOfCustomer=0; // �� ��ϵ� �� �� (�Ѹ��� �űԵ���� ������ 1����)
   private double total_insurance_pay;  // �� ����� (���̿� ����, ������� ��� ���� ������ ���� ���� ����)
   private double fee;
   /* �� �̸� ���� �Լ� */
   public String getname() {
      return name;
   }
   /* �� ������� ���� �Լ� */
   public String getbirth() {
      return birth;
   }
   /* �ű� ���� �Ѹ� �߰��� ������ ��ü �� �� 1����  */
   static public void addgetNumber() {
      numberOfCustomer++;
   }
   /* ��ü ��ϵ� �� �� ���� */
   static public int getNumber() {      // �� �� ���� get
      return numberOfCustomer;
   }
   /* name, birth setter  */
   public void setBasicInfo(String name, String birth) {   // �̸�/������� set
      this.name = name;
      this.birth = birth;
   }
   /* product setter */
   public void setProduct(String product) {
      this.product = product;
   }
   /* start_date setter */
   public void setStartDate(String start_date) {
      this.start_date = start_date;
   }
   /* duration setter */
   public void setDuration(double duration) {
      this.duration = duration;
   }
   /* pay_duration setter */
   public void setPayDuration(double pay_duration) {
      this.pay_duration = pay_duration;
   }
  
   /* due_date setter */
   public void setDueDate() {
      /* String ���� �Է¹��� start_date�� ������ �ٲ� �� + duration �ؼ� ��/��/�� �� due_date ����ؼ� �� �����ϱ� */
   }
   
}

class Age{
   private static double ageValue=0;
   public static double byAge(int age) {
      // ���Ŀ� ���� ���� ���� ���̺��� �ٸ��� ���ؼ� ���� 
      switch(age/10) {
      case 2: {  // 20��
         if(age < 25 ) {
            ageValue = 0.4;
            return ageValue;
         }
         else if( age >= 25 ) {
            ageValue = 0.35;
            return ageValue;
         }
         break;
      }
      case 3: {   // 30��
         if(age < 35 ) {
            ageValue = 0.35;
            return ageValue;
         }
         else if( age >= 35 ) {
            ageValue = 0.3;
            return ageValue;
         }
         break;
      }
      case 4: {
         if(age < 45 ) {
            ageValue = 0.25;
            return ageValue;
         }
         else if( age >= 45 ) {
            ageValue = 0.25;
            return ageValue;
         }// 40��
         break;
      }
      case 5: {
         if(age < 55 ) {
            ageValue = 0.3;
            return ageValue;
         }
         else if( age >= 55 ) {
            ageValue = 0.35;
            return ageValue;
         }// 50��
         break;
      }
      case 6: {
         if(age < 65 ) {
            ageValue = 0.35;
            return ageValue;
         }
         else if( age >= 65 ) {
            ageValue = 0.4;
            return ageValue;
         }// 60��
         break;
      }
      case 7:    // �� �̻�
      default:{
         if(age < 75 ) {
            ageValue = 0.4;
            return ageValue;
         }
         else if( age >= 75 ) {
            ageValue = 0.5;
            return ageValue;
         }
         break;
      }
      }
      
      return 0;
      
   }
   
}
class Accident{
	private static double weight;
	public static double byAccident(boolean accident) { // ��� ���� ���� ��� ����ġ 
		if(accident==true) {
			weight= 0.3;
			return weight;
		}
		else if(accident!=true) {
			weight =0;
			return weight;
		}
		return 0;
	}
}
class Product{
   private int age;  // ����� ����
   private boolean accident; // ��� ����
   private double fee;
   int base;
   double ageAlpha;// = Age.byAge(age);
   double weightVal;
   public void setAge(int age) {
      this.age = age;
      ageAlpha=Age.byAge(this.age);
   }
   
   public void setAccident(boolean accident) {
      this.accident = accident;
      weightVal = Accident.byAccident(this.accident);
   }
   public void setFee(double fee)
   {
	   this.fee = fee;
   }
   public double getFee()
   {
	   return fee;
   }
  
   public void calculate() {
      //double ageAlpha = Age.byAge(age);
      //double weight;
      //double fee=0; //������ ������ ����ݾ�
       //�� ȸ���� �⺻ ����ݾ�
      
   }
   /* �������̵� */
   public void set(Info person) {
      
   }
   
}

/* �����ػ� ���� ȸ�� */
class Hyundai extends Product{
   
   /* ������ - ����, ������� set */
   public Hyundai(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("Hyundai");
      person.setPayDuration(10);   // ���Ƿ� ����
      person.setDuration(20);   // ���Ƿ� ����
   }
   public void calculate()
   {
	   int base = 11000;
	   double fee = base + base*ageAlpha+ base*weightVal;
	   System.out.println();
	   System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
	   setFee(fee);
	   System.out.println("===========================================");
	   System.out.println();
   }
   
   
}
/* �Ｚȭ�� ���� ȸ�� */
class Samsung extends Product{
   
   /* ������ - ����, ������� set */
   public Samsung(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("Samsung");
      person.setPayDuration(10);   
      person.setDuration(20);   
   }
   public void calculate() {
      int base = 12000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* DB���غ��� ���� ȸ�� */
class DB extends Product{
   
   /* ������ - ����, ������� set */
   public DB(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("DB");
      person.setPayDuration(5);   
      person.setDuration(15);  
   }
   public void calculate() {
      int base = 10000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* �޸���ȭ�� ���� ȸ�� */
class Meritz extends Product{
   
   /* ������ - ����, ������� set */
   public Meritz(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("Meritz");
      person.setPayDuration(5);   
      person.setDuration(10);  
   }
   public void calculate() {
      int base = 13000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* KB���غ��� ���� ȸ�� */
class KB extends Product{
   
   /* ������ - ����, ������� set */
   public KB(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("KB");
      person.setPayDuration(5);   
      person.setDuration(10);   
   }
   public void calculate() {
      int base = 14000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* AXA���غ��� ���� ȸ�� */
class AXA extends Product{
   
   /* ������ - ����, ������� set */
   public AXA(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("AXA");
      person.setPayDuration(15);   
      person.setDuration(20);   
   }
   public void calculate() {
      int base = 16000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* ��ȭ���غ��� ���� ȸ�� */
class Hanwha extends Product{
   
   /* ������ - ����, ������� set */
   public Hanwha(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("Hanwha");
      person.setPayDuration(10);   
      person.setDuration(15);   
   }
   public void calculate() {
      int base = 12000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}
/* NH�������غ��� ���� ȸ�� */
class NH extends Product{
   
   /* ������ - ����, ������� set */
   public NH(int age, boolean accident) {
      super.setAge(age);
      super.setAccident(accident);
   }
   @Override
   public void set(Info person) {
      person.setProduct("NH");
      person.setPayDuration(15);   
      person.setDuration(25);   
   }
   public void calculate() {
      int base = 11000;
      double fee = base + base*ageAlpha+ base*weightVal;
      System.out.println();
      System.out.println("������ ���� ���Ծ��� "+fee+"�� ���� �����Ǿ����ϴ�.");
      setFee(fee);
      System.out.println("===========================================");
      System.out.println();
   }
   
}


/* ���� Ŭ���� */
public class Register {
   static ArrayList <Info> user = new ArrayList<>(100);    
   /* ��ü ����Ʈ�� �� ���� ���� */
   public static void store_info(Info person) {
      user.add(person);
      Info.addgetNumber();
   }

   /* ������ �̹� ��ϵ��ִ� ������ Ȯ�� */
   public static int searchUser(Info search) {   
      int count = Info.getNumber();
      int i;
      for(i=0; i<count; i++) {
         if(search.getname().equals(user.get(i).getname()) && search.getbirth().equals(user.get(i).getbirth())) return -1;
      }
      if(i==count) return 0;
      return 0;
   }
   

   public static void register () {
      Scanner keyboard = new Scanner(System.in);
      PrintWriter outputStream  = null;
      try {
    	  outputStream = new PrintWriter(new FileOutputStream("Person.txt", true));
      }
      catch(FileNotFoundException e)
      {
    	  System.exit(0);
      }
      Loop1:
      for(;;)
      {
         System.out.print("������ ������ �Է����ּ��� : ");
         String name = keyboard.nextLine();
         System.out.println("������ ��������� �Է����ּ��� (yyyy/mm/dd) : ");
         String birth = keyboard.nextLine();

         Info person = new Info();
         
         person.setBasicInfo(name, birth);
         System.out.println("������ ������ �ԷµǾ����ϴ�. ��ø� ��ٷ��ּ���...\n");

         /* ���� �̹� ��ϵǾ��ִ� ��� */
         if(searchUser(person)==-1) {
            System.out.println("�̹� ����Ͻ� ���Դϴ�.");
            System.out.println("< 1. ���� �� ���� Ȯ�� >\t<2. ���� ����>\t<3. ����>");
            System.out.print("=> ");
            int select = keyboard.nextInt();
            if(select==1) {

            }
            else if(select == 2) {

            }
            else {
               System.out.println("���α׷��� ����Ǿ����ϴ�. ���� ���񽺼��͸� �湮���ּż� �����մϴ�.");
               break Loop1;
            }
         } /* ���� �̹� ��ϵ��� ����, �ű԰��� ��� */
         else {
            System.out.println("*** ȯ���մϴ� " + person.getname()+"��! ������ ���� ������ �Ͻðڽ��ϱ�? ***");
            System.out.print("(��/�ƴϿ�)�� �Է¹ٶ��ϴ�. => ");
            String want = keyboard.nextLine();

            if(want.equals("��")) {
               store_info(person);
               int productchoice;
               try {
            	  System.out.println();
                  System.out.println("1. �����ػ� 2. �Ｚȭ�� 3. DB���غ��� 4. �޸���ȭ�� 5. KB���غ��� 6. AXA���غ��� 7. ��ȭ���غ��� 8. NH�������غ���");
                  System.out.print("=> ");
                  productchoice = keyboard.nextInt();
                  if(productchoice > 8) throw new Exception("�������� �ʴ� ��ǰ�Դϴ�!! ��ȣ�� �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
               }catch(Exception e) {
                  System.out.println(e); 
                  System.out.println("1. �����ػ� 2. �Ｚȭ�� 3. DB���غ��� 4. �޸���ȭ�� 5. KB���غ��� 6. AXA���غ��� 7. ��ȭ���غ��� 8. NH�������غ���");
                  System.out.print("=> ");
                  productchoice = keyboard.nextInt();
                  if(productchoice > 8) {
                  System.out.println("�������� �ʴ� ��ǰ�Դϴ�!! ���α׷��� ����Ǿ����ϴ�.");
                  break Loop1;
                  }
               }
               
               Product user= new Product();

               System.out.print("���̸� �Է����ּ��� : ");
               int age = keyboard.nextInt();
               user.setAge(age);
                           
               System.out.print("��� ������ �����Ű���? (Y/N) : ");
               boolean acc=false;
               String accident = keyboard.next();
               if(accident.equals("Y")) acc = true;
               else acc = false;
               user.setAccident(acc);
               keyboard.nextLine();
               System.out.println("����� ������ ������ ��¥�� �Է����ּ��� (yyyy-mm-dd) : ");
               String start_date = keyboard.nextLine();
               person.setStartDate(start_date);
               
               System.out.println("������ ������ �ԷµǾ����ϴ�. ����� ���� ���̴� ��ø� ��ٷ��ּ���.. ");
               Product newUser = null;
               
               switch(productchoice) {
               case 1:{

                  newUser = new Hyundai(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 2:{
                  newUser = new Samsung(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 3: {
                  newUser = new DB(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 4: {
                  newUser = new Meritz(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 5: {
                  newUser = new KB(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 6:{
                  newUser = new AXA(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 7:{
                  newUser = new Hanwha(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               case 8: {
                  newUser = new NH(age, acc);
                  newUser.set(person);
                  newUser.calculate();
                  break;
               }
               
               }
               
               outputStream.print(person.getname()+ " ");
               outputStream.print(age + " ");
               outputStream.print(acc + " ");
               outputStream.print(start_date + " ");
               outputStream.print(newUser.getFee() + " ");
               outputStream.println();
               outputStream.close();
               break;
               
         }else {
            System.out.println("�����մϴ� ����. �ƽ����� ������ �� �˰ڽ��ϴ�");
            break;
         }
            
            
      }
      
   }
   }
}
