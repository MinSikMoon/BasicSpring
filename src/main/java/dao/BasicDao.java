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
	
	public List<String> selectAllTest(){
		List<String> result = null;
		try{
			result = (List<String>)jdbcTemplate.queryForList("[your query]", String.class);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
}