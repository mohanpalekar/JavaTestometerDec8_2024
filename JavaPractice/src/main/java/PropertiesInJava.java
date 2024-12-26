import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInJava {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		File file = new File("src/main/resources/app.properties");
		
		FileReader fr = new FileReader(file);
		
		prop.load(fr);
		
		System.out.println(prop.getProperty("userName"));
		
		System.out.println(prop.getProperty("password"));
		
		System.out.println(prop.getProperty("password1"));
	}

}
