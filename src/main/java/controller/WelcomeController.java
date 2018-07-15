package controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.BasicDao;

@Controller
public class WelcomeController {
	//constructor
	private static final Logger logger = Logger.getLogger(WelcomeController.class);
	
	@Autowired
	private BasicDao basicDao;

	
	@RequestMapping(value = "/welcome")
	public String welcome() {
		if(logger.isDebugEnabled())
			logger.debug("welcomecontroller 동작함.");
		return "welcome";
	}
	
	@RequestMapping(value = "/dbTest")
	public @ResponseBody void dbTest() throws Exception {
		List<String> result =  basicDao.selectAllTest();
		System.out.println(result);
	}

	
}
