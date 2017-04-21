package com.gms.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("controller()")
	public void beforeExecutionOnController(JoinPoint jp){
		System.out.println("Before method: " + jp.getSignature().getName() + ". Class: " + jp.getTarget().getClass().getSimpleName());
	}
	
	//XML config
	@After("controller()")
	public void afterExecutionOnController(JoinPoint jp){
		System.out.println("After method: " + jp.getSignature().getName() + ". Class: " + jp.getTarget().getClass().getSimpleName());
	}
	
	@After("execution(* com.gms.service.AdminService.getAllAdmins(..))")
	public void beforeExecutionOnService(JoinPoint jp){
		System.out.println("Around method: " + jp.getSignature().getName() + ". Class: " + jp.getTarget().getClass().getSimpleName());
	}
	
	@AfterThrowing("within(com.gms.*)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown="+joinPoint.toString());
	}
	
	//XML config
	@Pointcut("execution(* com.gms.controller.*.*(..))")
	private void controller(){}

}
