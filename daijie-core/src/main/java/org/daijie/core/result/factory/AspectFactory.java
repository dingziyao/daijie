package org.daijie.core.result.factory;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 定义AOP工厂类
 * @author daijie_jay
 * @since 2018年1月1日
 */
public interface AspectFactory {

	/**
	 * 进入方法需要定义的表达式
	 */
	public void targets();
	
	/**
	 * 进入方法之前运行的方法
	 * @param joinPoint 获取方法
	 * @throws Exception 抛出异常
	 */
	public void before(JoinPoint joinPoint) throws Exception;
	
	/**
	 * 进入方法之后运行的方法
	 * @param result 拦截方法的返回参数
	 * @return 对应拦截方法的返回参数
	 * @throws Exception 抛出异常
	 */
	public Object after(JoinPoint joinPoint, Object result) throws Exception;
	
	/**
	 * 进入方法前后运行的方法
	 * @param proceedingJoinPoint 获取方法
	 * @return 对应拦截方法的返回参数
	 * @throws Exception 抛出异常
	 */
	public Object proceed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable;
	
	/**
	 * 进入方法后出现运行异常时运行的方法
	 * @param exception 方法处理时捕获的异常
	 * @return 对应拦截方法的返回参数
	 */
	public Object throwing(JoinPoint joinPoint, Exception exception);
}
