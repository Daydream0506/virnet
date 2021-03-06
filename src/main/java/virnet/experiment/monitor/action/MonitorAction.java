package virnet.experiment.monitor.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MonitorAction extends ActionSupport implements ServletRequestAware{
	

	private static final long serialVersionUID = 6703262531506665378L;
	
	private HttpServletRequest request;
	private Map<String, Object> result = new HashMap<String, Object>();
	
	public String sessionConfigure(){
		
		String	username = this.request.getParameter("username");
		String	workgroup = this.request.getParameter("workgroup");
		String	expId = this.request.getParameter("expId");
		String	expRole = this.request.getParameter("expRole");
		String	expCaseId = this.request.getParameter("expCaseId");
		String cabinetIP = "172.17.0.61";//默认机柜ip，此字段在这个函数中没有用到

		
		System.out.println("session值： "+username+" "+workgroup+" "+expId+" "+expRole+" "+expCaseId);
		
		ActionContext.getContext().getSession().put("username", username);
		ActionContext.getContext().getSession().put("workgroup", workgroup);
		ActionContext.getContext().getSession().put("expId", expId);
		ActionContext.getContext().getSession().put("expRole", expRole);
		ActionContext.getContext().getSession().put("cabinetIP", cabinetIP);
		
		this.result.put("isSuccess", true);
		
		return SUCCESS;
	}
	
public String reallocateMachine(){
		System.out.println("调用重新分配函数");
	
		String	username = this.request.getParameter("username");
		String	workgroup = this.request.getParameter("workgroup");
		String	expId = this.request.getParameter("expId");
		String	expRole = this.request.getParameter("expRole");
		String	expCaseId = this.request.getParameter("expCaseId");
		String cabinetIP = "172.17.0.61";//默认机柜ip，此字段在这个函数中没有用到
		
		
		System.out.println("session值： "+username+" "+workgroup+" "+expId+" "+expRole+" "+expCaseId);
		
		ActionContext.getContext().getSession().put("username", username);
		ActionContext.getContext().getSession().put("workgroup", workgroup);
		ActionContext.getContext().getSession().put("expId", expId);
		ActionContext.getContext().getSession().put("expRole", expRole);
		ActionContext.getContext().getSession().put("cabinetIP", cabinetIP);
		
		this.result.put("isSuccess", true);
		
		return SUCCESS;
	}

public String changeMachine(){
	System.out.println("调用更改机柜函数");

	String	username = this.request.getParameter("username");
	String	workgroup = this.request.getParameter("workgroup");
	String	expId = this.request.getParameter("expId");
	String	expRole = this.request.getParameter("expRole");
	String	expCaseId = this.request.getParameter("expCaseId");
	String cabinetIP = this.request.getParameter("cabinetIP");
	
	
	System.out.println("session值： "+username+" "+workgroup+" "+expId+" "+expRole+" "+expCaseId+" "+cabinetIP);
	
	ActionContext.getContext().getSession().put("username", username);
	ActionContext.getContext().getSession().put("workgroup", workgroup);
	ActionContext.getContext().getSession().put("expId", expId);
	ActionContext.getContext().getSession().put("expRole", expRole);
	ActionContext.getContext().getSession().put("cabinetIP", cabinetIP);
	System.out.println("cabinetip ="+cabinetIP);
	
	this.result.put("isSuccess", true);
	
	return SUCCESS;
}
	
	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public void setServletRequest(HttpServletRequest arg0) {
        this.request = arg0;
    }
}
