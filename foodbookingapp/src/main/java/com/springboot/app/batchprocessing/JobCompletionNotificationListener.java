package com.springboot.app.batchprocessing;

import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.JobExecution;

import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component 
public class JobCompletionNotificationListener extends JobExecutionListenerSupport { 
 	 
 	  private final JdbcTemplate jdbcTemplate; 
 
 	  @Autowired 
 	  public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) { 
 	    this.jdbcTemplate = jdbcTemplate; 	  } 
 
 
 	  public void afterJob(JobExecution jobExecution) { 
 		  if(jobExecution.getBatchStatus() == BatchStatus.COMPLETED) {} 

}
}