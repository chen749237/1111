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
		System.out.println("请输入用户名：");
		String user = sc.next();
		Set<String> set = pro.stringPropertyNames();
		for (String s : set) {
			if(user.equals(s)){
				System.out.println("请输入密码：");
				String passwd = sc.next();
				if(passwd.equals(pro.getProperty(s))){
					System.out.println("登陆成功！");
					return;
					
				}else{
					System.out.println("密码错误！");
					return;
				}
			}
			
		}
		System.out.println("无此用户！");
	}
}