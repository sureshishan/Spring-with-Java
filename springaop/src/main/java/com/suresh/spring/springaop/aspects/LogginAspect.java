package com.suresh.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.suresh.spring.springaop.impl.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("before loggin.");
	}

	@After("execution(* com.suresh.spring.springaop.impl.ProductServiceImpl.multiply(..))")
	public void lofAfter(JoinPoint joinPoint) {
		System.out.println("after loggin");
	}

}
