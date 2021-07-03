package Com.Actitime.Generics;

import java.io.IOException;

public class Genrics_Demo {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.getPropertyValue("url");
	String un = f.getPropertyValue("username");
	String pass = f.getPropertyValue("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pass);
	
	String e = f.getExcelData("CreateCustomer", 1, 2);
	String e1 = f.getExcelData("CreateCustomer", 1, 3);
	System.out.println(e);
	System.out.println(e1);
}
}
