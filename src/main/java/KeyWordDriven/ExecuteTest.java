package KeyWordDriven;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecuteTest {
	
	
	public static void main(String[] args) {
		ExecuteTest execute = new ExecuteTest();
		Class<?> objClass = execute.getClass();
		try {
			Method method = objClass.getMethod("launchApplication", null);
			method.invoke(execute);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Keywords keys = new Keywords();
		
//		List<List<String> keyWorsd = getAllKeys()
//		
//				for(List>String row: keyWorsd ) {
//					keyword = row.get(0);
//					object = row.Get(1);
//							
//				}
		
	}

	
	
	public void launchApplication(String obj, String Val) {
		System.out.println("Launch Applicaiton");
	}
	
	public void EnterText(String obj, String val) {
		
	}
	
	public void loginToApp1() {
	
	}
	

}
