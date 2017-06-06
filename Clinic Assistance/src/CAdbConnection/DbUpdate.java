package CAdbConnection;

public class DbUpdate {
	DbConnection dbCon =DbConnection.getInstance();
	public void insertPerson(String fName,String mName,String lName,
			String dob,String ssn,String country, String ppNo)
	{
		StringBuilder sb =new StringBuilder();
		sb.append("INSERT INTO person "
				 +  "(fName,mName,lName,dob,ssn,country,passportNo) "
				 +  "VALUES (");
		sb.append("'" + fName + "',");
		sb.append("'" + mName + "',");
		sb.append("'" + lName + "',");
		sb.append("'" + dob + "',");
		if(ssn.trim()=="")
		sb.append("NULL,");
		else sb.append("'" + ssn + "',");
		sb.append("'" + country + "',");
		sb.append("'" + ppNo + "');");
		dbCon.executeQuery(sb.toString());
		
	}
	public void updatePerson(String personId,String fName,String mName,String lName,
			String dob,String ssn,String country, String ppNo)
	{
		StringBuilder sb =new StringBuilder();
		sb.append("Update person set ");
				
		sb.append("fName = '" + fName + "',");
		sb.append("mName = '" + mName + "',");
		sb.append("lName = '" + lName + "',");
		sb.append("dob = '" + dob + "',");
		sb.append("ssn = '" + ssn + "',");
		sb.append("country = '" + country + "',");
		sb.append("passportNo = '" + ppNo + "'");
		sb.append("where personId = '" + personId + "'");
		dbCon.executeQuery(sb.toString());
		
	}
	public DbConnection getConnection()
	{
		return dbCon;
	}
}
