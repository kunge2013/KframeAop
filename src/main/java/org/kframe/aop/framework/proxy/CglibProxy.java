package org.kframe.aop.framework.proxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

private Object target;//需要代理的目标对象
    
   
    
    public static void main(String[] args) {
        CglibProxy cglib = new CglibProxy();//实例化CglibProxy对象
        
    }



	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
    

}
