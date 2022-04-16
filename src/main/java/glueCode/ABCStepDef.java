package glueCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ABCStepDef {
	
	
	
	@Given ("Open {word} Application")
	public void openApp(String appName) {
		System.out.println("Opening " + appName + " application...");
	}
 
	@Then ("Verify results as {int}")
	public void verify(int val) {
		System.out.println("Verifying value: "+ val);
		
	}
	
	@When ("Register User:")
	public void register(DataTable data) {
//		List<List<String>> strLs = data.asLists(String.class);
		//for(int i=0;i<strLs.size();i++)
//		for(List<String> v:strLs) {
//			System.out.println(v.get(0));
//			System.out.println(v.get(1));
//		}
		
		Map<String, String> map = data.asMap(String.class, String.class);
		System.out.println(map.get("user name"));
		System.out.println(map.get("DOB"));
		map.put("user name", "Jerry");
		 
	}
	
	@When ("Add {int} and {int} and put result to @{word}")
	public void addNums(int a, int b, String param) {
		int c=a+b;
//		sc.setScenarioContext(param, c);
		System.out.println("Adding items...");
	}
	
	@Then ("verify {word} as {int}")
	public void verufyResult(String pram, int c) throws IOException {
//		int sum = (Integer) scenario.getScenarioContext(pram);
//		String sum =  (String) sc.processVariable(pram);
//		System.out.println(sum);
		
//		if(Integer.parseInt(sum)==c) {
//			System.out.println("Passed");
//		}else {
//			System.out.println("Faled");
//		}
	}
	
	@And ("Add below ites to @{word}:")
	public void addtoMap(String param, List<List<String>> td) {
//		sc.setScenarioContext(param, td);
	}
	
	@And ("display {word}")
	public void display(String param) {
//		List<List<String>> map =   (List<List<String>>) sc.getScenarioContext(param);
//		
//		System.out.println(map);
		
	}

}
