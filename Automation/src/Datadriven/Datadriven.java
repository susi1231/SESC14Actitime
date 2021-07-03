package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 class Datadriven {
		public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("./data/commondata.property");
			Properties p=new Properties();
			p.load(file);
			String url=p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
		
			
			
			
		}
}
