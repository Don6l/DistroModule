package myApp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/modules")
public class ModuleResources {

	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public List<Module> getModules(){
		return ModuleDao.instance.getModules();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON,
      MediaType.TEXT_XML })
	@Path("{moduleId}")
	public Module getModule(@PathParam("moduleId") String id){
		return ModuleDao.instance.getModuleById(Integer.parseInt(id));
	}
}
