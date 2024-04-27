package com.collectionMapping;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="collection_mapping_students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@ElementCollection
	@CollectionTable(name="collection_mapping_courses", joinColumns=@JoinColumn(name="course_id"))
	@OrderColumn(name="course_order")
	@Column(name="course_name")
	private String[] courses;
	@ElementCollection
	@CollectionTable(name="collection_mapping_skills", joinColumns = @JoinColumn(name="skill_id"))
	@Column(name="skill_name")
	private List<String> skills;
	@ElementCollection
	@CollectionTable(name="collection_mapping_marks", joinColumns=@JoinColumn(name="marks_id"))
	@Column(name="marks")
	private List<Integer> marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email, String[] courses, List<String> skills, List<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.courses = courses;
		this.skills = skills;
		this.marks = marks;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", courses=" + Arrays.toString(courses)
				+ ", skills=" + skills + ", marks=" + marks + "]";
	}
	
	
	
}
