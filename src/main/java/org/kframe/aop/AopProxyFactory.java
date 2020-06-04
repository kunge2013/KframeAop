package org.kframe.aop;

import org.kframe.aop.framework.AdvisedSupport;
import org.kframe.aop.framework.AopConfigException;

public interface AopProxyFactory {
	AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException;
}
