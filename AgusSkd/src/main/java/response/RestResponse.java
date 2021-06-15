package response;


import java.io.Serializable;
import java.util.List;


public class RestResponse implements Serializable {
	private static final long serialVersionUID = 4210265933052852138L;
	private int code;	//status flag based on CommonConstants
	private String desc; //message description
	private long totalRecords; //total records data
	private Object modules; //real data content
	
	public RestResponse(){
	}
	
	public RestResponse(int code, String desc, Object modules){
		this.code = code;
		this.desc = desc;
		this.modules = modules;
	}
	
	public RestResponse(int code, String desc, Object modules, long totalRecords){
		this.code = code;
		this.desc = desc;
		this.modules = modules;
		this.totalRecords = totalRecords;
	}

	public Object getModules() {
		return modules;
	}

	public void setModules(Object modules) {
		this.modules = modules;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}