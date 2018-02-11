package refresh_budget_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Refresh_BudgetApp_Controller {

	@RequestMapping(value="/event", method = RequestMethod.POST)	
	public String event(String json) throws Exception {
		// if we got here then someone commited to repo
		Process p = Runtime.getRuntime().exec("sudo /home/ubuntu/refresh_restart.sh");
		p.waitFor();
		return null;
	}
}