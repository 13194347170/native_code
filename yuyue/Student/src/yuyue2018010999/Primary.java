package yuyue2018010999;

import java.util.Scanner;

public class Primary {

	public static void main(String[] args) {

		Student[] stu=new Student[20];
		Scanner sc=new Scanner(System.in);
		StudentManager sm=new StudentManager();
		int execute=1;   
		int num=0;      
		while(execute!=0){
			System.out.println("��ѡ�������");
			System.out.println("**************************************************");
			System.out.println("*        1 ����                                  *");
			System.out.println("*        2 ����                                  *");
			System.out.println("*        3 ɾ��                                  *");
			System.out.println("*        4 ���                                  *");
			System.out.println("*        5 �˳�                                  *");
			System.out.println("**************************************************");
			int oper=sc.nextInt();
			if(oper==1){
				sm.Insert(stu,num);
				num++;
			} else if(oper==2){
				sm.Find(stu,num);
			} else if(oper==3){
				sm.Delete(stu,num);
				num--;
			} else if(oper==4){
				sm.OutPut(stu,num);
			} else if(oper==5){
				execute=sm.Exit();
			} else{
				System.out.println("�������");
				continue;
			}
		}
	}

}
