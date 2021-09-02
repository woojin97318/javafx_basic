package quiz;

import java.util.HashMap;

public class MyDB {
	private HashMap<String, String> table;
	
	public HashMap<String, String> getTable() {
		return table;
	}
	public void setTable(HashMap<String, String> table) {
		this.table = table;
	}

	public MyDB() {
		table = new HashMap<String, String>();
		table.put("if", "if1234");
		table.put("else", "else1234");
		table.put("while", "while1234");
		table.put("for", "for1234");
		table.put("admin", "admin1234");
	}
}
