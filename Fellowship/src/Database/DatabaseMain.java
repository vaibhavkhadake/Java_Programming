package Database;

public class DatabaseMain {

	public static void main(String[] args) throws Exception 
	{
		 MySQLAccess dao = new MySQLAccess();
		    dao.readDataBase();	
	}

}
