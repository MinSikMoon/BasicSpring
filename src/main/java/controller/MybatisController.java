package controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MybatisDao;
import vo.MybatisVo;

@Controller
public class MybatisController {
	private static final Logger logger = Logger.getLogger(MybatisController.class);
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/mybatisTest")
	public @ResponseBody void mybatisTest() {
		MybatisDao mdao = sqlSession.getMapper(MybatisDao.class);
		for(MybatisVo vo : mdao.selectAll()){
			System.out.println(vo.getTitle());
		}
	}
}
