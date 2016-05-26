package ar.com.softtek.action;


import com.opensymphony.xwork2.ActionSupport;




 
public class NuevoPacienteAction extends ActionSupport{
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
			
			return "success";
		}
		else
			return "error";
		}
    

	
}
