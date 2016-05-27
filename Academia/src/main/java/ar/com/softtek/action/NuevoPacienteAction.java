package ar.com.softtek.action;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;




 
public class NuevoPacienteAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("NuevoPacienteAction: ");

	
	private String name;
	
	  public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	
	public String execute() {


	    
		if(true)
		{
					
		log.info("Exito");

			return "success";
		}
		else
			return "error";
		}
    

	
}
