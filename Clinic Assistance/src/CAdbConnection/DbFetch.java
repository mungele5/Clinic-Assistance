package CAdbConnection;

import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

public class DbFetch {
public DefaultTableModel personList()
{
	DefaultTableModel table =new DefaultTableModel();
	DbConnection dbCon =DbConnection.getInstance();
	ResultSet set=dbCon.fetchResult("select * from person");
	try
	{
	ResultSetMetaData metaData =  (ResultSetMetaData) set.getMetaData();
    int totalColumn = metaData.getColumnCount();
    Object[] dataRow = new Object[totalColumn];
    if(set!= null)
    {
        for(int i=1;i<=totalColumn;i++)
        {
            table.addColumn(metaData.getColumnName(i));
        }
        while(set.next())
        {
            for(int i=1;i<=totalColumn;i++)
            {
                dataRow[i-1] = set.getObject(i);
            }
            table.addRow(dataRow);
        }
        

    }
	}
	catch(Exception ex)
	{
		
	}
 return table;
}
}
