package com.example.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component  
public class ZuulLoggingFilter extends ZuulFilter  
{  
	//creating Logger object  
	private Logger logger=LoggerFactory.getLogger(this.getClass());  

	@Override  
	public String filterType()   
	{  
		return "pre"; //intercept all the request before execution  
	}  
	@Override  
	public int filterOrder()   
	{  
		return 1; //setting filter order to 1  
	}
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true; //executing filter for every request  
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		return null;
	}  
}
