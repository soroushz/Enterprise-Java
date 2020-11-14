package ca.sheridancollege.soroushz.Repositories;

import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.soroushz.Beans.Course;
import lombok.Data;

@Component
@Data
public class CourseListImp implements CourseList {

	private List<Course> cList = new CopyOnWriteArrayList<Course>();

	public void emptyList() {
		cList.clear();
	}
	
	
}
