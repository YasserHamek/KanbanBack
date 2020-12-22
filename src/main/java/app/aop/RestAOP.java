package app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestAOP {

	@Before("execution (* app.controller.*.*(..))")
	public void restLogging(JoinPoint joinPoint) {
		
		System.out.println("******************** AOP : the method "+joinPoint.getSignature().getName()+" of the "
	+ joinPoint.getTarget().getClass() +" will be executed");
	}
	
	@After("execution (* app.controller.*.*(..))")
	public void restLogging2(JoinPoint joinPoint) {
		
		System.out.println("******************** AOP :  the method "+joinPoint.getSignature().getName()+" of the "
	+ joinPoint.getTarget().getClass() +" has been executed succsessfuly ");
	}
}
