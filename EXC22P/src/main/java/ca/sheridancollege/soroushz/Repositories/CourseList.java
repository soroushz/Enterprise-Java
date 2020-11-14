package ca.sheridancollege.soroushz.Repositories;

import java.util.List;

import ca.sheridancollege.soroushz.Beans.Course;

public interface CourseList {
	
	public List<Course> getCourseList();
	public void setCourseList(List<Course> courseList);
	public void emptyList();
}
