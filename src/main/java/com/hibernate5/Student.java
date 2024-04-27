package com.hibernate5;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String city;
	@OneToMany(mappedBy = "id")
	private String[] courses;
	@OneToMany(mappedBy = "id")
	private String [] skills;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student( String name, String city, String[] courses, String[] skills) {
		super();
		this.name = name;
		this.city = city;
		this.courses = courses;
		this.skills = skills;
	}
	
	public Student(int id, String name, String city, String[] courses, String[] skills) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.courses = courses;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String [] getSkills() {
		return skills;
	}
	public void setSkills(String [] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", courses=" + Arrays.toString(courses)
				+ ", skills=" + skills + "]";
	}
}
