package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BasicDao {
	
	//constructor
	private JdbcTemplate jdbcTemplate;
	
	public BasicDao(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void selectAllTest(){
		System.out.println("select all test 수행중");
		try{
			List<String> results = (List<String>)jdbcTemplate.queryForList("your sql query", String.class);
			System.out.println(results.size());
			for(String s : results)
				System.out.println(s);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
