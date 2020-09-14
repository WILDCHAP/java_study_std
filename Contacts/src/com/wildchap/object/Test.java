package com.wildchap.object;

public class Test {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public boolean equals(Test t) {
		if (this.name == t.name)
			if(this.age == t.age)
				return true;
		return false;
	}
	public String toString() {
		return "Customer: name:" + name + " age :" + age;
	}
}
