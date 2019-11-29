package test;
import java.util.Scanner;

import person.*;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	
	private static void acceptRecord(Person person)
	{
		System.out.print("Enter User's Name	:	");
		person.setUsers_name(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter User's Email	:	");
		person.setUsers_email(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter User's Phone:	");
		person.setUsers_phone(sc.nextInt());
		System.out.print("Enter User's Password:	");
		person.setUsers_passwd(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter User's Role	:	");
		person.setUsers_role(sc.nextLine());
		sc.nextLine();
	}
	
	public static void main(String[] args) {
		Program p = new Program();
		p.acceptRecord(person);
	}
}
