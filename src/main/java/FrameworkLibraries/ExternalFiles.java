package FrameworkLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.yaml.snakeyaml.Yaml;

public class ExternalFiles {
	
	public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
//	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
//	      } catch(FileNotFoundException fnfe) {
//	         fnfe.printStackTrace();
//	      } catch(IOException ioe) {
//	         ioe.printStackTrace();
//	      } finally {
	         fis.close();
//	      }
	      return prop;
	   }
	
	public static void createYamlObject(String fileName) throws FileNotFoundException {
		Yaml yaml = new Yaml();
		InputStream inputStream = new FileInputStream(fileName);
		int i=1;
		HashMap yamlMap = yaml.load(inputStream);
		
//		for (Object o : yamlMap.entrySet()) {
//			System.out.println("Item: " + i++);
////			   System.out.println(o);
//			   
//			   Map<String,String> obj1 = new HashMap<String,String> ();
//			   obj1 = (Map<String, String>) o;
//			   System.out.println(obj1.get("obj1"));
//		}
		
//		yamlMap
		
		System.out.println(getValue(yamlMap,"Reg_Page.obj"));
		
//		HashMap obj1 = new HashMap();
//		
//		HashMap obj = yamlMap;
//		System.out.println(yamlMap.get("Reg_Page"));
//		
//		HashMap obj2 = (HashMap) yamlMap.get("Reg_Page");
//		
//		System.out.println(obj2.get("obj3"));
		



	}
	//object = parent.child
	
	public static String getValue(HashMap yamlMap, String object) {
		String[] strOr = object.split("\\.");
//		System.out.println(strOr[0]);
		HashMap obj = yamlMap;
		HashMap obj2 = (HashMap) yamlMap.get(strOr[0]);
		return (String) obj2.get(strOr[1]);
		
	}

}

