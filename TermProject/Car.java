package TermProject;

import java.util.Scanner;

public class Car{

   private static String fuel;

   public static void setFuel(int key) {
      switch (key) {
      case 1: fuel = "Gasolin";
      break;
      case 2: fuel = "Electric";
      break;
      default : {System.out.println("�߸� �Է��ϼ̽��ϴ�."); System.exit(0);} break;
      }
   }
   public static String getFuel() {
      return fuel;
   }

   public static void car() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("���Ͻô� ���� ���Ḧ �������ּ���");
      System.out.print("1.Gasolin  2.Electric  =>  ");
      int fuel = keyboard.nextInt();
      setFuel(fuel);
      System.out.println(getFuel() + "�� �����ϼ̽��ϴ�!");
      System.out.println();
      System.out.print("1. ������  2. ������  =>  ");
      int country = keyboard.nextInt();
      if(country == 1) {
         Domestic car = null;
         System.out.println();
         System.out.println("���� �귣�带 �������ּ���");
         if(getFuel().equals("Electric")) {
            System.out.print("1.Hyundai  2.Kia  => ");
            int brand = keyboard.nextInt();
            try {
               switch(brand) {
               case 1: car = new Electric_Hyundai(); break;
               case 2: car = new Electric_Kia(); break;
               default: throw new Error("���� ��ȣ�Դϴ�");
               }
            }
            catch(Error e) {
               System.out.println(e+ " �ٽ� �ѹ� �Է¹ٶ��ϴ�");
               System.out.print("1.Hyundai  2.Kia  => ");
               brand = keyboard.nextInt();
               switch(brand) {
               case 1: car = new Electric_Hyundai(); break;
               case 2: car = new Electric_Kia(); break;
               default: {System.out.println("���α׷��� ����Ǿ����ϴ�."); System.exit(0);} break;
               }
            }
         }
         else {
            System.out.print("1.Hyundai  2.Kia  3.Genesis  4.Chevrolet  => ");
            int brand = keyboard.nextInt();
            try {
               switch(brand) {
               case 1: car = new Hyundai_car(); break;
               case 2: car = new Kia(); break;
               case 3: car = new Genesis(); break;
               case 4: car = new Chevrolet(); break;
               default: throw new Error("���� ��ȣ�Դϴ�");
               }
            }
            catch(Error e) {
               System.out.println(e+ " �ٽ� �ѹ� �Է¹ٶ��ϴ�");
               System.out.print("1. Hyundai  2.Kia  3.Genesis  4.Chevrolet  => ");
               brand = keyboard.nextInt();
               switch(brand) {
               case 1: car = new Hyundai_car(); break;
               case 2: car = new Kia(); break;
               case 3: car = new Genesis(); break;
               case 4: car = new Chevrolet(); break;
               default: {System.out.println("���α׷��� ����Ǿ����ϴ�."); System.exit(0);} break;
               }
            }
         }
         
         car.selectModel();

      }
      else if(country == 2) {
         Foreign car = null;
         System.out.println();
         System.out.println("���� �귣�带 �������ּ���");
         if(getFuel().equals("Electric")) {
            System.out.print("1.Tesla  2.Renault_Nissan  => ");
            int brand = keyboard.nextInt();
            try {
               switch(brand) {
               case 1: car = new Tesla(); break;
               case 2: car = new Renault_Nissan(); break;
               default: throw new Error("���� ��ȣ�Դϴ�");
               }
            }
            catch(Error e) {
               System.out.println(e+ " �ٽ� �ѹ� �Է¹ٶ��ϴ�");
               System.out.print("1.Tesla  2.Renault_Nissan  => ");
               brand = keyboard.nextInt();
               switch(brand) {
               case 1: car = new Tesla(); break;
               case 2: car = new Renault_Nissan(); break;
               default: {System.out.println("���α׷��� ����Ǿ����ϴ�."); System.exit(0);} break;
               }
            }

         }
         else {
            System.out.print("1.Benz  2.Bmw  3.Audi  4.Volkswagen  => ");
            int brand = keyboard.nextInt();
            try {
               switch(brand) {
               case 1: car = new Benz(); break;
               case 2: car = new Bmw(); break;
               case 3: car = new Audi(); break;
               case 4: car = new Volkswagen(); break;
               default: throw new Error("���� ��ȣ�Դϴ�");
               }
            }
            catch(Error e) {
               System.out.println(e+ " �ٽ� �ѹ� �Է¹ٶ��ϴ�");
               System.out.print("1.Benz  2.Bmw  3.Audi  4.Volkswagen  => ");
               brand = keyboard.nextInt();
               switch(brand) {
               case 1: car = new Benz(); break;
               case 2: car = new Bmw(); break;
               case 3: car = new Audi(); break;
               case 4: car = new Volkswagen(); break;
               default: {System.out.println("���α׷��� ����Ǿ����ϴ�."); System.exit(0);} break;
               }
            }
         }
         
         car.selectModel();

      }
      else {
         System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
      }
      
   }

}


// ������
abstract class Domestic{
   final Scanner keyboard = new Scanner(System.in);
   abstract public void selectCarModel(int model);
   abstract public void selectModel();
}

// ������ - ������
class Electric_Hyundai extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      int car;
      switch(model) {
      case 1: {
         System.out.print("1.�ͽ�Ŭ��ú�  2.������Ƽ��  =>  ");
         car = keyboard.nextInt();
         if( car == 1) System.out.println("�ش� ������ ������ 4,980�����Դϴ�.");
         else if(car == 2) System.out.println("�ش� ������ ������ 5,455�����Դϴ�.");
         else System.out.println("�������� �ʴ� ���Դϴ�.");
      }
      break;
      case 2:{
         System.out.print("1.�����̾�  2.�����  3.�ͽ�Ŭ��ú�  4.Ķ���׷���  =>  ");
         car = keyboard.nextInt();
         switch(car) {
         case 1:  System.out.println("�ش� ������ ������ 3,679�����Դϴ�."); break;
         case 2:  System.out.println("�ش� ������ ������ 3,900�����Դϴ�."); break;
         case 3:  System.out.println("�ش� ������ ������ 4,012�����Դϴ�."); break;
         case 4:  System.out.println("�ش� ������ ������ 4,489�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
      }
      break;
      case 3: {
         System.out.print("1.���  2.�����̾� �÷���  3.�ν��۷��̼�  =>  ");
         car = keyboard.nextInt();
         if( car == 1) System.out.println("�ش� ������ ������ 2,881�����Դϴ�.");
         else if(car == 2) System.out.println("�ش� ������ ������ 3,108�����Դϴ�.");
         else if(car == 3) System.out.println("�ش� ������ ������ 3,635�����Դϴ�");
         else System.out.println("�������� �ʴ� ���Դϴ�.");
      }
      break;
      case 4: {
         System.out.print("1.���  2.�����̾�  3.�ν��۷��̼�  =>  ");
         car = keyboard.nextInt();
         if( car == 1) System.out.println("�ش� ������ ������ 2,857�����Դϴ�.");
         else if(car == 2) System.out.println("�ش� ������ ������ 3,073�����Դϴ�.");
         else if(car == 3) System.out.println("�ش� ������ ������ 3,467�����Դϴ�");
         else System.out.println("�������� �ʴ� ���Դϴ�.");
      }
      break;
      default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
      }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("���� �������� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.���̿��� 5  2.�׷��� ���̺긮��  3.�Ÿ ���̺긮��  4. ���� ���̺긮��  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
   
}
class Electric_Kia extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
      case 1: System.out.println("�ش� ������ ������ 4,187�����Դϴ�."); break;
      case 2: System.out.println("�ش� ������ ������ 4,780 ~ 4,980�����Դϴ�."); break;
      case 3: System.out.println("�ش� ������ ������ 4,950 ~ 7,200�����Դϴ�."); break;
      default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
      }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("��� �������� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.��� EV 5  2.�Ϸ� EV  3.EV6  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}

// ������ - ����, ���ָ�
class Hyundai_car extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 2,975 ~ 4,212�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 3,573 ~ 5,563�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 2,435 ~ 3,567�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("���븦 �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2020 ��Ÿ��  2.2020 �Ӹ����̵� EV  3.2021 ����  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}
class Kia extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 1,738 ~ 2,425�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 3,220 ~ 4,526�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 2,356 ~ 3,151�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("��Ƹ� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2022 k3  2.2021 k8  3.2021 k5  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}
class Genesis extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 15,609�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 5,291 ~ 6,214�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 6,067 ~ 6,951�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("���׽ý��� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 G90L  2.2020 G80  3.2020 GV80  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
}
class Chevrolet extends Domestic{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 1,885 ~ 2,333�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 5,450 ~ 5,529�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 2,364 ~ 3,338�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("�������� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2022 ������ Ʈ����  2.2021 ������ ī����  3.2021 ������ ������  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}



// ������
abstract class Foreign{
   
   final Scanner keyboard = new Scanner(System.in);
   abstract public void selectCarModel(int model);
   abstract public void selectModel();
}

// ������ - ����, ���ָ�
class Benz extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 14,060 ~ 21,860�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 21,760 ~ 24,560�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 7,621�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("������ �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 ���� SŬ����  2.2021 ���� GŬ����  3.2021 ���� GLAŬ���� AMG  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}
class Bmw extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 12,270 ~ 13,170�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 12,170 ~ 13,070�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 12,630 ~ 16,940�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("BMW�� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 BMW M4  2.2021 BMW M3  3.2021 BMW X7  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}
class Audi extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 25,569�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 14,696 ~ 19,400�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 13,696�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("�ƿ�� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 �ƿ�� R8  2.2021 �ƿ�� A8L  3.2021 �ƿ�� A8  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
}
class Volkswagen extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 2,949 ~ 3,285�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 8,275 ~ 9,659�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 5,324 ~ 6,113�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("�����ٰ��� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 �����ٰ� ��Ÿ  2.2021 �����ٰ� ���Ʒ�  3.2020 �����ٰ� ���׿�  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
}

// ������ - ������
class Tesla extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 5,999 ~ 7,999�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 5,479 ~ 7,479�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 10,414 ~ 12,914�����Դϴ�."); break;
         case 4: System.out.println("�ش� ������ ������ 11,599 ~ 13,599�����Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("�׽��� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2021 �׽��� ��Y  2.2021 �׽��� ��3  3.2019 �׽��� ��S  4.2019 �׽��� ��X  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
   
}
class Renault_Nissan extends Foreign{
   @Override
   public void selectCarModel(int model) 
   {
      switch(model) {
         case 1: System.out.println("�ش� ������ ������ 4,190 ~ 4,830�����Դϴ�."); break;
         case 2: System.out.println("�ش� ������ ������ 5,630�����Դϴ�."); break;
         case 3: System.out.println("�ش� ������ ������ 40,000�޷��Դϴ�."); break;
         default: System.out.println("�������� �ʴ� ���Դϴ�."); break;
         }
   }
   public void selectModel()
   {
      System.out.println();
      System.out.println("���� �ֻ��� �����ϼ̱���! ���� �������ּ���");
      System.out.print("1.2019 �ֻ� ����  2.2017 �ֻ� ����� ���̺긮��  3.2020 �ֻ� �Ƹ���  =>  ");
      int model = keyboard.nextInt();
      System.out.println();
      selectCarModel(model);
   }
}


