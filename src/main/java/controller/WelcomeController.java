package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "welcome";
	}

	// 방참여 매핑 : chat guest 전용 //host와 client 분기시켜야 한다.
	@ResponseBody
	@RequestMapping(value = "/keyboard", method = RequestMethod.GET)
	public String keyboard() {
		System.out.println("keyboard 시작됨");

		JSONObject jobjBtn = new JSONObject();
		ArrayList<String> btns = new ArrayList<String>();
		btns.add("신청1");
		btns.add("신청2 테스틓ㅎ");

		jobjBtn.put("type", "buttons");
		jobjBtn.put("buttons", btns);
		System.out.println(jobjBtn.toJSONString());
		return jobjBtn.toJSONString();
	}

}
