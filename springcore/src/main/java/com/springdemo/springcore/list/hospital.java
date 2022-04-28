package com.springdemo.springcore.list;

import java.util.List;

public class hospital {
	private String name;
	private List<String> departments;

	@Override
	public String toString() {
		return "hospital [name=" + name + ", departments=" + departments + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

}
