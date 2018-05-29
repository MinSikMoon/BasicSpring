package controller;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import dao.BasicDao;
@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping(value = "/s3")
	public void s3() {
		String bucket_name = "bucketname";

		System.out.format("Objects in S3 bucket %s:\n", bucket_name);
		AWSCredentials awsCredentials = new BasicAWSCredentials("[your key]", "[your key]");
		AmazonS3 amazonS3 = new AmazonS3Client(awsCredentials);
		
		ListObjectsV2Result result = amazonS3.listObjectsV2(bucket_name);
		List<S3ObjectSummary> objects = result.getObjectSummaries();
		for (S3ObjectSummary os : objects) {
			System.out.println("* " + os.getKey());
			System.out.println(os);
		}
	}
	
	@RequestMapping(value = "/dbTest")
	public void dbTest(){
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-db.xml");
		BasicDao bd = ctx.getBean("basicDao", BasicDao.class);
		bd.selectAllTest();
		ctx.close();
	}
}
