package org.reRun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailAnalysis implements IAnnotationTransformer  {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
		Class<? extends IRetryAnalyzer> retryAnalyzer= annotation.getRetryAnalyzerClass();
		
		if (retryAnalyzer!=null) {
			
			annotation.setRetryAnalyzer(RetryConditions.class);
		}
		
		
	}

	
	
	
	
}
	
	
	