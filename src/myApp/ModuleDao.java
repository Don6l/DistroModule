package myApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ModuleDao {
instance;

private Map<Integer, Module> moduleMap = new HashMap<Integer, Module>();

private ModuleDao(){
	
	
	
	//Create module1
	Module module1 = new Module();
	module1.setName("Distributed Systems and Security");
	module1.setLecturer("PJ");
	module1.setHoursPerWeek(4);
	
	moduleMap.put(1, module1);
	
	//Create module2
	Module module2 = new Module();
	module2.setName("Java");
	module2.setLecturer("SK");
	module2.setHoursPerWeek(6);
	
	moduleMap.put(2, module2);
}

	public List<Module> getModules(){
		List<Module> modules = new ArrayList<Module>();
		modules.addAll(moduleMap.values());
		return modules;
	}
	
	public Module getModuleById(int id){
		return moduleMap.get(id);
	}

}
