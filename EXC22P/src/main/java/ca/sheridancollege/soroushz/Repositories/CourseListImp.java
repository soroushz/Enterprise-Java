package ca.sheridancollege.soroushz.Repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.soroushz.Beans.Course;

@Component
public class CourseListImp implements CourseList {

	private List<Course> cList = new CopyOnWriteArrayList<Course>();

	public List<Course> getCourseList() {
		return cList;
	}

	public void setCourseList(List<Course> courseList) {
		this.cList = courseList;
	}
	
	public void emptyList() {
		cList.clear();
	}
	
	
}
