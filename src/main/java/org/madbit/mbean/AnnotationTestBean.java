package org.madbit.mbean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="bean:name=testBean4", description="My Managed Bean", log=true,
logFile="jmx.log", currencyTimeLimit=15, persistPolicy="Always", persistPeriod=200,
persistLocation="/Users/alessiofiore", persistName="bar")
public class AnnotationTestBean implements IJmxTestBean {

	private String name;
    private int age;
    
    @ManagedAttribute
	public String getName() {
		return name;
	}
    
    @ManagedAttribute
	public void setName(String name) {
		this.name = name;
	}
    
    @ManagedAttribute
	public int getAge() {
		return age;
	}
    
    @ManagedAttribute
	public void setAge(int age) {
		this.age = age;
	}
    
    @ManagedOperation(description="Add two numbers")
    public int getPippo() {
    	return age;
    }
}
