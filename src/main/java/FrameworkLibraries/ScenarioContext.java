package FrameworkLibraries;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ScenarioContext {
	
	private HashMap<String, Object> scenarioContect;
	
	public ScenarioContext() {
		scenarioContect = new HashMap<>();
	}
	
	public void setScenarioContext(String key, Object val) {
		scenarioContect.put(key, val);
	}
	
	public Object getScenarioContext(String key) {
		return scenarioContect.get(key);
	}
	
	public Object processVariable(String key) throws IOException  {
//		try {
		if(key.startsWith("@")) {
			key=key.substring(1,key.length());
			System.out.println(key);
			System.out.println(scenarioContect.get(key));
			return scenarioContect.get(key);
		}else if(key.startsWith("$")) {
			key=key.substring(1,key.length());
//			try {
			Properties props = ExternalFiles.readPropertiesFile("TestData/CommonTD.properties");

			return props.get(key);
//			}
		}else {
			return key;
		}
//		}catch(Exception e) {
//			
//		}
		
	}

}
