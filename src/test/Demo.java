package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Demo {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties() ; 
		FileReader in = new FileReader("user.txt"); 
		pro.load(in);
		in.close();
		Scanner sc = new Scanner(System.in); 
		System.out.println("�������û�����");
		String user = sc.next();
		Set<String> set = pro.stringPropertyNames();
		for (String s : set) {
			if(user.equals(s)){
				System.out.println("���������룺");
				String passwd = sc.next();
				if(passwd.equals(pro.getProperty(s))){
					System.out.println("��½�ɹ���");
					return;
					
				}else{
					System.out.println("�������");
					return;
				}
			}
			
		}
		System.out.println("�޴��û���");
	}
}