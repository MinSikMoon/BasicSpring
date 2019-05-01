package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/resources/**/*.xml"
})
@WebAppConfiguration
public class WelcomeControllerTest {
	//properties
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext ctx;
	//setting
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void test_1() {
		try {
			//System.out.println(mockMvc.perform(MockMvcRequestBuilders.get("/welcome")).andReturn().getModelAndView().getViewName());
			assertEquals("welcome", this.mockMvc.perform(MockMvcRequestBuilders.get("/welcome")).andReturn().getModelAndView().getViewName()); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
