package seven.SecretAgents;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	@Before("execution(* seven.SecretAgents.*.*(..))")
	public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("!!!!!!!!! "+joinPoint.toString());
          
    }
}
