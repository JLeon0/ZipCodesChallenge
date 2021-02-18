package com.challenge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipCodeJLeonApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipCodeJLeonApplication.class, args);
	}
	//@Autowired
   // JobLauncher jobLauncher;
      
   // @Autowired
   // Job job;
    
    //@Scheduled(cron = "0 */1 * * * ?")
    //public void perform() throws Exception
    //{
     //   JobParameters params = new JobParametersBuilder()
      //          .addString("JobID", String.valueOf(System.currentTimeMillis()))
       //         .toJobParameters();
        //jobLauncher.run(job, params);
    //}
}
