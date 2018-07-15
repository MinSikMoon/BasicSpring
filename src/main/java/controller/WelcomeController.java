package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	private static final Logger logger = Logger.getLogger(WelcomeController.class);
	@RequestMapping(value = "/welcome")
	public String welcome() {
		if(logger.isDebugEnabled())
			logger.debug("welcomecontroller 동작함.");
		return "welcome";
	}

	
}
