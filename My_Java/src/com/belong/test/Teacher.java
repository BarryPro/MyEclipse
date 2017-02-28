package com.belong.test;

public class Teacher {
	private String name;
	private Integer age;
	
		
	public Teacher(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我叫"+name+"今年是"+age+"岁";
	}

}
