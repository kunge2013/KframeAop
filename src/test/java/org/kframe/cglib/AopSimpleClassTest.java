package org.kframe.cglib;

import java.lang.reflect.Method;

import org.kframe.aop.KEnhancer;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AopSimpleClassTest {
	public void test() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		KEnhancer enhancer = new KEnhancer();
		enhancer.setSuperclass(AopSimpleClassTest.class);
		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				System.out.println("before method run...");
				Object result = proxy.invokeSuper(obj, args);
				System.out.println("after method run...");
				return result;
			}
		});
		AopSimpleClassTest sample = (AopSimpleClassTest) enhancer.create();
		sample.test();
	}
}
