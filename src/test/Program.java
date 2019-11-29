package test;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

import LibraryDao.Dao;
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
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Sign IN");
		System.out.println("2.Sign up");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static int usermenu( )
	{
		System.out.println("0.Sign Out");
		System.out.println("1.Edit Profile");
		System.out.println("2.Change Password");
		System.out.println("3.Find Book By Name");
		System.out.println("4.Check Book Availability");
		System.out.println("5.List Issued Books");
		System.out.println("6.Payment History");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		try( userDao dao = new userDao())
		{
			int choice, bookId;
			float price;
			while( ( choice = Program.menuList( ) ) != 0 )
			{
				switch( choice )
				{
				case 1:
					Dao user = new Dao();
					int id = User.signin( user );
					if(id != 0)
					{
						while( (choice = Program.usermenu()) != 0)
						{
							
							switch(choice)
							{
							case 1:
								System.out.println("Enter New Email: ");
								String Mail = sc.nextLine();
								System.out.println("Enter New Phone: ");
								int Phone = sc.nextInt();
								dao.updateE(Mail,id);
								dao.updateM(Phone,id);
								break;
							case 2:
								System.out.println("Enter New Email: ");
								String pass = sc.nextLine();
								dao.updateP(pass,id);
								break;
							case 3:
								Book book1 = new Book();
								System.out.println("Enter BookName : ");
								String book = sc.nextLine();
								book1.search(book);
								break;
								
							}
						}
					}
					break;
				case 2:
					
				case 3:
					
				case 4:
					
				}
			}
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
}
