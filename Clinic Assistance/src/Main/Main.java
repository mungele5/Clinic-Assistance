package Main;

import java.sql.ResultSet;
import java.sql.SQLException;

import CAdbConnection.DbUpdate;

public class Main {
	public static void main(String args[]){
	DbUpdate db=new DbUpdate();
	db.insertPerson("J", "", "G", "1987-09-02", "", "US", "1234567");
	ResultSet rs=db.getConnection().fetchResult("select * from person");

	try 
	{
		while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		}
}
